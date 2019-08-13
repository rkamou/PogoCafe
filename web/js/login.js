$(function () {
    $("#login").on("click", login);
})

function login() {
    $.post("/login",
        {
            userName: $("#userName").val(),
            password: $("#password").val()
        })
        .done(function (data) {
            console.log(data);
            if (!data) {
                alert("User data not found!")
                return;
            }

            if (data.success) {
                window.href = "/home";
            } else {
                for (const error of data.errors){
                    alert(error);
                }
            }
        });
}