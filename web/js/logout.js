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
            $("#logoutMsg").text(data + " is logged out!");
        }
    }
}