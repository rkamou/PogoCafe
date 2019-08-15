<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users list</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>
<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />


    <section class="padding-y-100 border-bottom border-light">
        <div class="container">
            <div class="row">
                <div class="col-12 mb-3 text-center">
                    <h4><span class="text-primary">Users</span> list</h4>
                </div>
                <div class="col-12 mb-3">
                    <a href="/edit-user" class="btn btn-primary">Add user</a>
                </div>
                <div class="col-12 mx-auto">
                    <div class="table-responsive">
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">First</th>
                                <th scope="col">Last</th>
                                <th scope="col">User name</th>
                                <th scope="col">Role</th>
                                <th scope="col">Actions</th>
                            </tr>
                            </thead>
                            <tbody>

                            <C:forEach var="item" items="${users}">
                                <tr>
                                    <th scope="row">${item.id}</th>
                                    <td>${item.firstName}</td>
                                    <td>${item.lastName}</td>
                                    <td>${item.userName}</td>
                                    <td>${item.role}</td>
                                    <td><a href="/edit-user?id=${item.id}">Edit</a></td>
                                </tr>

                            </C:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div> <!-- END row-->
        </div> <!-- END container-->
    </section> <!-- END section-->

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>
