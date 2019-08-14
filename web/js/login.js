$(function () {
    $("#login").on("click", validateUser);
})

function getUserInfo() {
    $.post("/login", {
        userName: $("#userName").val(),
        password: $("#password").val()
    }).done(validateUser);

    function validateUser(data) {
        $("#errorMsg").text("");

        console.log(data);
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