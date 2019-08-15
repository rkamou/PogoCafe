$(function () {
    reloadShoppingCart();
    $("#shopping-cart").on("click", ".delete-item-from-cart", deleteFromShoppingCart);

});

function reloadShoppingCart() {
    console.log("reload shopping cart")
    $.post("/get-shopping-cart")
        .done(function (data) {
            console.log(data);
            $("#shopping-cart").html("");

            if (data) {
                for (const item of data.items) {
                    let li = $("<li>").addClass("dropdown-cart__item");
                    let div = $("<div>").addClass("media");
                    div.append($("<img>").addClass("dropdown-cart__img").attr("src", item.picture).attr("alt", item.name));
                    let divBody = $("<div>").addClass("media-body pl-3");
                    divBody.append($("<a>").attr("href", "#").addClass("h6").text(item.name));
                    divBody.append($("<span>").addClass("text-primary").text("$" + item.price));
                    div.append(divBody);
                    li.append(div);

                    let a = $("<a>").addClass("dropdown-cart__item-remove").attr("href", "#");
                    a.append($("<i>").addClass("ti-close delete-item-from-cart").attr("item-id", item.id));
                    li.append(a);

                    $("#shopping-cart").append(li);
                }
            }
        });
}

function deleteFromShoppingCart(e) {
    e.preventDefault();

    $.ajax("/delete-from-cart", {
        "type": "POST",
        "data": {
            "itemId": this.getAttribute("item-id")
        }

    }).done(function (data) {
        if (ProceedResult(data)) {
            NotificationSuccess("Item deleted from your cart");
            reloadShoppingCart();
        }
    });
}