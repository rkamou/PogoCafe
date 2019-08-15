$(function () {
    $("#category-new").on("click", newCategoryClick);
    $("#categories-list").on("click", "a", filterCategoryClick);
    $("#categories-list").on("click", "a.edit", editCategoryClick);

    reloadAllCategories();
    reloadAllItems();

    if (canEdit){
        $("#categories-list-container").append(
            $("<button>").attr("id", "category-new").addClass("btn").addClass("btn-link").text("New category")
        );
    }
});

// reloading categories list
function reloadAllCategories(){
    let all = `<li class="mb-2"><a href="#" category="0">All categories</a></li>`;
    $("#categories-list").html(all);

    $.post("/category-list", { menuName: $("#menuName").val() })
        .done(function (data) {
            if (data){
                // <li class="mb-2"><a href="#" category="7">Desserts</a></li>
                for (const cat of data) {
                    let li = $("<li>").addClass("mb-2");
                    li.append($("<a>").attr("href", "#").attr("category", cat.id).attr("title", cat.description).text(cat.name));
                    if (canEdit) {
                        li.append($("<a>").attr("href", "#").addClass("edit").attr("category", cat.id).text("edit"));
                    }
                    $("#categories-list").append(li);
                }
            }
        });
}

let menuItems = [];

// reloading all menu items
function reloadAllItems() {
    menuItems.push({
        id: 1,
        name: "Item 1",
        picture: "picture1"
    });
}

// filtering menu items by category
function filterMenuItems(categoryId) {
    for(item of menuItems){
        // console.log(item);
    }
}

// filtering menu items after user choose category
function filterCategoryClick(e) {
    e.preventDefault();
    filterMenuItems(this.getAttribute("category"));
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
function editCategoryClick(e) {
    e.preventDefault();
    $.post("/category-get", {
        id: this.getAttribute("category")
    })
        .done(function (data) {
            console.log(data);
            if (data) {
                openCategoryModal(data);
            }
        });
}