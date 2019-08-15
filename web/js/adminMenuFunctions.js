$(function () {
    $abso("#save_new_menu").on("click", createMenu);
});

function createMenu() {
    let menuName = $("#userName").val();
    let menuDescription = $("#password").val();
    console.log("here");
    $.post("/admin_menu", {
        "menuName": menuName,
        "menuDescription": menuDescription
    }).done(validateUser);

    function validateUser(data) {
        $("#errorMsg").text("");

        if (!data) {
            $("#errorMsg").text("Error loading user data!");
            return;
        }
        if (data.success) {
            window.location.href = "/";
        } else {
            for (const error of data.errors) {
                $("#errorMsg").append(error);
            }
        }
    }
}