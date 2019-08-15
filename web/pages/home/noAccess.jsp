<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>

    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>
<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />

    <div class="container">
        <div class="row">
            <div class="col-12 text-center my-5">
                <h1 class="text-primary display-1">Access denied</h1>
                <h2 class="mb-4">
                    Sorry! Seems like you have no access <i class="fas fa-frown text-warning" aria-hidden="true"></i>
                </h2>
            </div>
        </div> <!-- END row-->
    </div> <!-- END container-->

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>
