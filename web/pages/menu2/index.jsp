<%@ page import="models.menu.MenuViewModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>

    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
    <script src="/js/menu.js"></script>

    <% MenuViewModel model = (MenuViewModel) request.getAttribute("model"); %>
</head>
<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />
    <input type="hidden" id="menuName" value="<%= request.getParameter("menuType")%>">
    <script>
        <%--const canEdit = '<%= true %>' === 'true';--%>
        const canEdit = '${userType == 'ADMIN' ? 'true' : 'false'}' === 'true';
    </script>

    <!-- Breadcrumbs -->
    <div class="padding-y-60 bg-cover" data-dark-overlay="6" style="background:url(/img/cafe/breadcrumb-bg.jpg) no-repeat">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6 my-2 text-white">
                    <ol class="breadcrumb breadcrumb-double-angle bg-transparent p-0">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item">Menu</li>
                    </ol>
                    <h2 class="h1">
                        Breakfast menu
                    </h2>
                </div>

            </div>
        </div>
    </div>

    <section class="py-3 position-relative shadow-v2">
        <div class="container">
            <!-- Menu types -->
            <div class="card flex-wrap flex-row pt-4">
                <jsp:include page="/pages/shared/_menuCards.jsp" />
            </div> <!-- END row-->
        </div>
    </section>


    <section class="padding-y-100 bg-light-v1">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="d-md-flex bg-white rounded shadow-v1 p-4" id="categories-list-container">
                        <ul class="nav nav-pills nav-isotop-filter align-items-center my-2 mr-auto" id="categories-list"></ul>
                    </div>
                </div>
            </div> <!-- END row-->

            <div class="row isotop-filter" id="menu-items-container"></div> <!-- END row-->
        </div> <!-- END container-->
    </section>   <!-- END section-->


    <jsp:include page="/pages/menu2/categoryModal.jsp" />
    <jsp:include page="/pages/menu2/menuItemModal.jsp" />

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>