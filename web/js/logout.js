$(function () {
    getUserInfo();
});

function getUserInfo() {
    $.post("/logout").done(validateUser);

    function validateUser(data) {
        if (!data) {
            $("#logoutMsg").text("Logout failed!");
            return;
        }

        if (data) {
            //$("#logoutMsg").text("Logout successful!");
            window.location.href = "/";
            // $("#logoutMsg").text("Logout successful!");
        }
    }
}