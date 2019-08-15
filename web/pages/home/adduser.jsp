<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New User</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
    <script src="/js/adduser.js"></script>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>

<div class="row">
    <div class="col-lg-6 mx-auto">
        <div class="card shadow-v2">
            <div class="card-header border-bottom">
                <h4 class="mt-4">
                    Add New User!
                </h4>
            </div>
            <div class="card-body">
                <div class="input-group input-group--focus mb-3">
                    <label> User ID:
                        <input type="text" id="id" class="form-control border-left-0 pl-0" placeholder="">
                    </label>
                </div>

                <div class="input-group input-group--focus mb-3">
                    <label> First Name:
                        <input type="text" id="firstName" class="form-control border-left-0 pl-0"
                               placeholder="">
                    </label>
                </div>

                <div class="input-group input-group--focus mb-3">
                    <label> Last Name:
                        <input type="text" id="lastName" class="form-control border-left-0 pl-0"
                               placeholder="">
                    </label>
                </div>

                <div class="input-group input-group--focus mb-3">
                    <label> Login Name:
                        <input type="text" id="userName" class="form-control border-left-0 pl-0"
                               placeholder="">
                    </label>
                </div>

                <div class="input-group input-group--focus mb-3">
                    <label> Password:
                        <input type="password" id="password" class="form-control border-left-0 pl-0"
                               placeholder="">
                    </label>
                </div>

                <div class="input-group input-group--focus mb-3">
                    <select id="userRole" data-placeholder="Choose a Role..." class="select ec-select" multiple="false"
                            tabindex="-1" style="display: none;">
                        <option value="">ADMIN</option>
                        <option value="">CUSTOMER</option>
                        <option value="">DRIVER</option>
                    </select>
                </div>

                <button id="add" class="btn btn-block btn-primary">Log in</button>
                <p class="my-5 text-center" id="errorMsg">${loginMessage}</p>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>
