$(function () {
    reloadShoppingCart();
    $("#shopping-cart").on("click", ".delete-item-from-cart", deleteFromShoppingCart);
    $("#send").on("click",checkout);
});

function reloadShoppingCart() {
    $.post("/get-shopping-cart")
        .done(function (data) {
            $("#shopping-cart").html("");
            let itemsCount = 0;

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
                    itemsCount++;
                }
            }

            if (itemsCount === 0) {
                shoppingCartEmpty();
            } else {
                let li = $("<li>").addClass("dropdown-cart__item");
                let div = $("<div>").addClass("media");
                let divBody = $("<div>").addClass("media-body pl-3");
                divBody.append($("<a>").addClass("btn btn-primary").attr("href", "/checkout").text("Checkout"));
                div.append(divBody);
                li.append(div);
                $("#shopping-cart").append(li);
            }
        });
}

function shoppingCartEmpty() {
    $("#shopping-cart").html("");

    let li = $("<li>").addClass("dropdown-cart__item");
    let div = $("<div>").addClass("media");
    let divBody = $("<div>").addClass("media-body pl-3");
    divBody.append($("<p>").addClass("h6").text("Your shopping cart is empty"));
    div.append(divBody);
    li.append(div);
    $("#shopping-cart").append(li);
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


function checkout() {
    let firstName   =$("#firstName").val();
    let zip         =$("#zip").val();
    let city_state  =$("#city_state").val();
    let lastName    =$("#lastName").val();
    let username    =$("#username").val();
    let email       =$("#email").val();
    let address     =$("#address").val();
    let address2    =$("#address2").val();

    console.log("Fi "+firstName);
    console.log("Zip "+zip);
    console.log("City State "+city_state);
    console.log("LastName "+lastName);
    console.log("Username "+username);

    console.log("Email "+email);
    console.log("Address "+address);
    console.log("Address2 "+address2);

    $.ajax("/checkout",{
        "type":"POST",
        "data":{
            "firstName":firstName,
            "zip":zip,
            "city_state":city_state,
            "lastName":lastName,
            "username":username,
            "email":email,
            "address":address,
            "address2":address2
        }

    }).done(saveProcess)
      .fail(showError);
}

function showError(xhr,status,error) {
    console.log(xhr,status,error);

}

function saveProcess(data) {
    console.log("Success ");

    console.log(JSON.parse(JSON.stringify(data)));
    console.log("Data "+data.toString())
}
