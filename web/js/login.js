$(function () {
    $("#login").on("click", getUserInfo);
})

function getUserInfo() {
    let userName = $("#userName").val();
    let password = $("#password").val();

    $.post("/login", {
        userName: userName,
        password: password
    }).done(validateUser);

    function validateUser(data) {
        $("#errorMsg").text("");

        if (!data) {
            $("#errorMsg").text("Error loading user data!");
            return;
        }

        if (data.value.userName === userName) {
            window.location.href = "/";
        } else {
            for (const error of data.errors) {
                $("#errorMsg").append(error);
            }
            // $("#errorMsg").text("Username or password is not valid");
        }
    }
}