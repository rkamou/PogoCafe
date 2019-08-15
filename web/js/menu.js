$(function () {
    if (canEdit) {
        $("#categories-list-container")
            .append($("<button>").attr("id", "category-edit").addClass("btn").addClass("btn-outline-primary").addClass("my-2").text("Edit"))
            .append($("<button>").attr("id", "category-new").addClass("btn").addClass("btn-outline-primary").addClass("my-2").addClass("ml-3").text("New"));
    }

    $("#category-new").on("click", newCategoryClick);
    $("#category-edit").on("click", editCategoryClick);

    $("#categories-list").on("click", "a.nav-link", categorySelect);
    $("#menu-items-container").on("click", "button.add-new-meal", addNewMeal);
    $("#menu-items-container").on("click", "button.add-to-cart", addToCart);
});

window.onload = function () {
    reloadAllCategories();
    reloadAllMenuItems();
};

let lastSelectedCategory = 0;
let categoriesList = [];

// reloading categories list
function reloadAllCategories() {
    let all = `<a class="nav-link ${lastSelectedCategory == 0 ? 'active' : ''}" href="#" data-filter="*" category="0">All</a>`;
    $("#categories-list").html(all);

    $.post("/category-list", {menuName: $("#menuName").val()})
        .done(function (data) {
            categoriesList = [];
            if (data) {
                for (const cat of data) {
                    categoriesList.push(cat);
                    const a = $("<a>")
                        .addClass("nav-link")
                        .attr("href", "#")
                        .attr("title", cat.description)
                        .attr("data-filter", ".category" + cat.id)
                        .attr("category", cat.id)
                        .text(cat.name);
                    if (lastSelectedCategory == cat.id) {
                        a.addClass("active");
                    }
                    $("#categories-list").append(a);
                }
            }
            categorySelect();
        });
}

// reloading all menu items
function reloadAllMenuItems() {
    $.post("/item-list")
        .done(function (data) {
            $("#menu-items-container").html("");
            $("#menu-items-container").isotope({layoutMode: 'fitRows'});

            if (data) {
                for (const item of data) {
                    let div = $("<div>").addClass("isotope-item").addClass("col-md-6").addClass("col-lg-4").addClass("marginTop-30")
                        .addClass("category" + item.idCategory);
                    if (lastSelectedCategory > 0 && lastSelectedCategory != item.idCategory){
                        div.css("display", "none");
                    }

                    let innerDiv = $("<div>").addClass("card").addClass("hover:parent").addClass("shadow-v1");
                    innerDiv.append($("<div>").addClass("menu-img-container").css("background-image", "url('" + item.picture + "')"));
                    // innerDiv.append($("<img>").addClass("card-img-top").attr("src", item.picture).attr("alt", item.name));
                    let divBody = $("<div>").addClass("card-body");
                    divBody.append($("<h4>").text(item.name));
                    // show/hide category id
                    // divBody.append($("<p>").addClass("text-gray").text(item.idCategory));
                    divBody.append($("<p>").text(item.ingredients));
                    innerDiv.append(divBody);
                    let divFooter = $("<div>").addClass("d-flex justify-content-between align-items-center border-top position-relative p-4");
                    divFooter.append($("<span>").addClass("d-inline-block bg-primary text-white px-4 py-1 rounded-pill").text("$" + item.price));
                    divFooter.append($("<button>").addClass("btn btn-primary btn-sm add-to-cart").attr("item-id", item.id).text("Add to cart"));
                    innerDiv.append(divFooter);
                    div.append(innerDiv);

                    $("#menu-items-container").isotope('insert', div);
                }
            }

            showAddNewMenuItem();
        });
}

function showAddNewMenuItem() {
    if (!canEdit) return;

    let allCategories = "";
    for (let cat of categoriesList) {
        allCategories += "category" + cat.id + " ";
    }

    let div = $("<div>").addClass("isotope-item").addClass("col-md-6").addClass("col-lg-4").addClass("marginTop-30")
        .addClass(allCategories);
    let innerDiv = $("<div>").addClass("card").addClass("hover:parent").addClass("shadow-v1");
    innerDiv.append($("<div>").addClass("menu-img-container").css("background-image", "url('/img/menu/empty-plate.jpg')"));
    // innerDiv.append($("<img>").addClass("card-img-top").attr("src", item.picture).attr("alt", item.name));
    let divBody = $("<div>").addClass("card-body");
    divBody.append($("<h4>").text("New meal"));
    // show/hide category id
    // divBody.append($("<p>").addClass("text-gray").text(item.idCategory));
    divBody.append($("<p>").text("Add new meal here"));
    innerDiv.append(divBody);
    let divFooter = $("<div>").addClass("d-flex justify-content-between align-items-center border-top position-relative p-4");
    divFooter.append($("<span>").addClass("d-inline-block bg-primary text-white px-4 py-1 rounded-pill").text("price"));
    divFooter.append($("<button>").addClass("btn btn-primary btn-sm add-new-meal").text("Add new meal"));
    innerDiv.append(divFooter);
    div.append(innerDiv);

    $("#menu-items-container").isotope('insert', div);
}

function addNewMeal() {
    openMenuItemModal({
        id: 0,
        name: "",
        ingredients: "",
        price: 0.0,
        picture: "",
        idCategory: 0
    });
}

// new category clicked
function newCategoryClick() {
    openCategoryModal({
        id: 0,
        name: "",
        description: "",
        menuName: ""
    });
}

// edit category clicked
function editCategoryClick() {
    if (lastSelectedCategory == 0) return;

    $.post("/category-get", {
        id: lastSelectedCategory
    })
        .done(function (data) {
            console.log(data);
            if (data) {
                openCategoryModal(data);
            }
        });
}

function categorySelect(e) {
    if (this["getAttribute"] && this.getAttribute("category")) {
        lastSelectedCategory = this.getAttribute("category");
    }

    if (lastSelectedCategory > 0) {
        $("#category-edit").show();
    } else {
        $("#category-edit").hide();
    }
}

function addToCart(e) {
    $.ajax("/item-get", {
          "type":"POST",
          "data":{
              "id":this.getAttribute("item-id")
          }

    }).done(showResul);
    console.log("John add me to cart! My menu id = " + this.getAttribute("item-id"));
}

function showResul(data) {
    console.log(data);
}