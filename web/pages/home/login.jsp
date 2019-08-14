<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
    <script src="/js/login.js"></script>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>

<div class="row">
    <div class="col-lg-6 mx-auto">
        <div class="card shadow-v2">
            <div class="card-header border-bottom">
                <h4 class="mt-4">
                    Staff Login!
                </h4>
            </div>
            <div class="card-body">
<%--                <form action="/login" method="post" class="px-lg-4">--%>
                    <div class="input-group input-group--focus mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white ti-email"></span>
                        </div>
                        <input type="text" id="userName" class="form-control border-left-0 pl-0" placeholder="Username">
                    </div>
                    <div class="input-group input-group--focus mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white ti-lock"></span>
                        </div>
                        <input type="password" id="password" class="form-control border-left-0 pl-0" placeholder="Password">
                    </div>
                    <button type="submit" id="login" class="btn btn-block btn-primary">Log in</button>
                    <p class="my-5 text-center" id="errorMsg">${loginMessage}</p>
<%--                </form>--%>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>
