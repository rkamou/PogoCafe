<%@ page import="models.users.UserType" %>
<%@ page import="models.users.UserModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New User</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
    <script src="/js/editUser.js"></script>
<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />

    <div class="container bg-light-v5">
        <div class="row">
            <div class="col-lg-6 mx-auto mt-5">
                <div class="card shadow-v2">
                    <div class="card-header border-bottom">
                        <h4 class="mt-4">
                            ${model.id == 0 ? "Add New User" : "Edit user"}
                        </h4>
                    </div>
                    <input type="hidden" id="id" value="${model.id}">
                    <div class="card-body">

                        <div class="input-group input-group--focus mb-3">
                            <label class="w-100"> First Name:
                                <input type="text" id="firstName" class="form-control w-100" value="${model.firstName}">
                            </label>
                        </div>

                        <div class="input-group input-group--focus mb-3">
                            <label class="w-100"> Last Name:
                                <input type="text" id="lastName" class="form-control w-100" value="${model.lastName}">
                            </label>
                        </div>

                        <div class="input-group input-group--focus mb-3">
                            <label class="w-100"> User Name:
                                <input type="text" id="userName" class="form-control w-100" value="${model.userName}">
                            </label>
                        </div>

                        <div class="input-group input-group--focus mb-3">
                            <label class="w-100"> Password:
                                <input type="password" id="password" class="form-control w-100" value="${model.password}">
                            </label>
                        </div>

                        <div class="input-group input-group--focus mb-3">

                            <label for="userRole" class="col-form-label">Choose Role</label>
                            <select data-placeholder="Choose menu" class="chosen-select ec-select my_select_box" tabindex="5" id="userRole">
                                <option value="<%= UserType.ADMIN %>">Admin</option>
                                <option value="<%= UserType.CUSTOMER %>">Customer</option>
                                <option value="<%= UserType.DELIVER %>">Deliver</option>
                            </select>
                        </div>

                        <button id="save" class="btn btn-block btn-primary">Save</button>
                        <button id='delete' class='btn btn-block btn-danger ${model.id != 0 ? "" : "d-none" }'>Delete</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>
