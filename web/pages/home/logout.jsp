<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Logout</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
    <script src="/js/logout.js"></script>
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>

<div class="row">
    <div class="col-lg-6 mx-auto">
        <div class="card shadow-v2">
            <div class="card-header border-bottom">
                <h4 class="mt-4">
                </h4>
            </div>
            <div class="card-body">
                <p class="my-5 text-center" id="logoutMsg">${logoutMsg}</p>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>
