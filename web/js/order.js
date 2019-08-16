$(function () {
    $("#orders-container").on("click", ".proceed-to-delivery", proceedToDelivery);
    $("#orders-container").on("click", ".mark-as-delivered", markAsDelivered);
})


function  proceedToDelivery(e) {
    console.log(this.getAttribute("order-id"));

    $.post("/order-change-status", {
        id: this.getAttribute("order-id"),
        status: "ONDELIVERY"
    }).done(function (data) {
        if (ProceedResult(data)) {
            NotificationSuccess("Order processed sucessfully");
            window.location.href = "/orders-list";
        }
    })

}

function  markAsDelivered(e) {
    console.log(this.getAttribute("order-id"));

    $.post("/order-change-status", {
        id: this.getAttribute("order-id"),
        status: "DELIVERED"
    }).done(function (data) {
        if (ProceedResult(data)) {
            NotificationSuccess("Order delivered sucessfully");
            window.location.href = "/orders-list";
        }
    })
}