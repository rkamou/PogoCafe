<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
    <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous"></script>
    <script src="./js/login.js"></script>
    <link rel="stylesheet" href="./css/style.css"> </head>
<body>
<label><input id="userName" type="text"/></label> <br/>
<label><input id="password" type="password"/></label> <br/>
<label><input id="login" type="button" value="Login"/></label>
<p id="errorMsg"></p>
</body>
</html>
