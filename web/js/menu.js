$(function () {
    if (canEdit) {
        $("#categories-list-container")
            .append($("<button>").attr("id", "category-edit").addClass("btn").addClass("btn-outline-primary").addClass("my-2").text("Edit"))
            .append($("<button>").attr("id", "category-new").addClass("btn").addClass("btn-outline-primary").addClass("my-2").addClass("ml-3").text("New"));
    }

    $("#category-new").on("click", newCategoryClick);
    $("#category-edit").on("click", editCategoryClick);

    $("#categories-list").on("click", "a.nav-link", categorySelect);

    reloadAllCategories();
    reloadAllItems();
});

let lastSelectedCategory = 0;

// reloading categories list
function reloadAllCategories(){
    let all = `<a class="nav-link ${lastSelectedCategory == 0 ? 'active' : ''}" href="#" data-filter="*" category="0">All</a>`;
    $("#categories-list").html(all);

    $.post("/category-list", { menuName: $("#menuName").val() })
        .done(function (data) {
            if (data){
                for (const cat of data) {
                    const a = $("<a>")
                        .addClass("nav-link")
                        .attr("href", "#")
                        .attr("title", cat.description)
                        .attr("data-filter", ".category" + cat.id)
                        .attr("category", cat.id)
                        .text(cat.name);
                    if (lastSelectedCategory == cat.id){
                        a.addClass("active");
                    }
                    $("#categories-list").append(a);
                }
            }
            categorySelect();
        });
}

// reloading all menu items
function reloadAllItems() {
    menuItems.push({
        id: 1,
        name: "Item 1",
        picture: "picture1"
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
    } else{
        $("#category-edit").hide();
    }
}