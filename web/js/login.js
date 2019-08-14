$(function () {
    $("#login").on("click", getUserInfo);
});

function getUserInfo() {
    let userName = $("#userName").val();
    let password = $("#password").val();
    console.log("here");
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
        if (data.success) {
            window.location.href = "/";
        } else {
            for (const error of data.errors) {
                $("#errorMsg").append(error);
            }
        }
    }
}