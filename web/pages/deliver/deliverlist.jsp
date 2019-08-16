
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ord" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<sql:query var="rs" dataSource="jdbc/pogocafe">
    select id,order_package,user_order_id,status,ordered,shipTo,shipped_date from orders
</sql:query>

<html>
<head>
    <title>Title</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp" />
Deliver List
<section class="paddingTop-50 paddingBottom-100 bg-light-v2">
    <div class="container">
        <ord:forEach var="row" items="${rs.rows}">

            <div class="list-card align-items-center shadow-v1 marginTop-30">
                <div class="col-lg-4 px-lg-4 my-4">
                    <img class="w-100" src="assets/img/360x220/3.jpg" alt="">
                </div>
                <div class="col-lg-8 paddingRight-30 my-4">
                    <div class="media justify-content-between">
                        <div class="group">
                            <a href="#" class="h4" id="orNpck">
                                <ord:out value="${row.order_package}"/> | <ord:out value="${row.status}"/>
                            </a>
                            <ul class="list-inline mt-3">
                                <li class="list-inline-item mr-2">
                                    <i class="ti-user mr-2"></i>
                                    <span id="orderUser_id"><ord:out value="${row.user_order_id}"/></span>
                                </li>
                                <li class="list-inline-item mr-2">
                                        <%--                                <i class="fas fa-star text-warning"></i>--%>
                                        <%--                                <i class="fas fa-star text-warning"></i>--%>
                                        <%--                                <i class="fas fa-star text-warning"></i>--%>
                                        <%--                                <i class="fas fa-star text-warning"></i>--%>
                                        <%--                                <i class="fas fa-star text-warning"></i>--%>
                                        <%--                                <span class="text-dark">5</span>--%>
                                        <%--                                <span>(4578)</span>--%>
                                </li>
                            </ul>
                        </div>
                        <a href="#" class="btn btn-opacity-primary iconbox iconbox-sm orderaction order_id"
                           data-container="body" data-toggle="tooltip" data-placement="top" data-skin="light" title="" data-original-title="Add to wishlist">
                            <i class="ti-heart"><span style="display: none;" id="spoderId">${row.id}</span></i>
                        </a>
                    </div>
                    <p id="pordadress">
                        <ord:out value="${row.shipTo}"/></p>
                    <ul class="list-inline mb-0">
                        <li class="list-inline-item mr-3">
                            <span class="h4 d-inline text-primary">$180</span>
                            <span class="h6 d-inline small text-gray"><s>$249</s></span>
                        </li>
                        <li class="list-inline-item mr-3">
                            <i class="ti-headphone small mr-2"></i>
                            46 lectures
                        </li>
                        <li class="list-inline-item mr-3">
                            <i class="ti-time small mr-2"></i>
                            27.5 hours
                        </li>
                    </ul>
                </div>
            </div>
        </ord:forEach>




        <div class="row">
            <div class="col-12 marginTop-70">
                <ul class="pagination pagination-primary justify-content-center">
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-angle-left small"></i>
                        </a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">1</a>
                    </li>
                    <li class="page-item active disabled mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">2</a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">3</a>
                    </li>
                    <li class="page-item disabled mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-more-alt"></i>
                        </a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">16</a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-angle-right small"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div> <!-- END row-->
    </div> <!-- END container-->
</section>
</body>
<%--<script src="/js/order.js"></script>--%>
</html>
