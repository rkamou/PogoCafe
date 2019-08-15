$(function () {
    $("#login").on("click", getUserInfo);
});

function getUserInfo() {
    let userId = $("#id").val();
    let firstName = $("#firstName").val();
    let lastName = $("#lastName").val();
    let loginName = $("#userName").val();
    let password = $("#password").val();
    let role = $("#userRole").val();

    $.post("/adduser", {
        userId: userId,
        firstName: firstName,
        lastName: lastName,
        loginName: loginName,
        password: password,
        role: role,
    }).done(validateUser);
    function validateUser(data) {
        $("#errorMsg").text("");

        if (!data) {
            $("#errorMsg").text("User cannot be created at this momment!");
            return;
        }
        if (data) {
            window.location.href = "/adduser";
        }
    }
}