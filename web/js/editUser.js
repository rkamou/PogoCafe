$(function () {
    $("#save").on("click", getUserInfo);
    $("#delete").on("click", deleteUser);
});

function getUserInfo() {
    const userId = $("#id").val();
    $.post("/edit-user", {
        id: userId,
        firstName: $("#firstName").val(),
        lastName: $("#lastName").val(),
        userName: $("#userName").val(),
        password: $("#password").val(),
        role: $("#userRole").val()
    }).done(validateUser);

    function validateUser(data) {
        if (ProceedResult(data)) {
            if (userId == 0) {
                NotificationSuccess("User created successfully");
                window.location.href = "/list-user";
            } else {
                NotificationSuccess("User updated successfully");
            }
        }
    }
}

function deleteUser() {
    $.post("/delete-user", {
        id: $("#id").val()
    }).done(validateUser);

    function validateUser(data) {
        if (ProceedResult(data)) {
            NotificationSuccess("User deleted successfully");
            window.location.href = "/list-user";
        }
    }
}