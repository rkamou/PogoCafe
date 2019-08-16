
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ord" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<%--<sql:query var="rs" dataSource="jdbc/pogocafe">--%>
<%--    select id,order_package,user_order_id,status,ordered,shipTo,shipped_date from orders--%>
<%--</sql:query>--%>

<html>
<head>
    <title>Title</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp" />

<section class="paddingTop-50 paddingBottom-100 bg-light-v2">
    <div class="container">
<%--        <ord:forEach var="row" items="${rs.rows}">--%>

            <ord:forEach var="row" items="${order_data}">


            <div class="list-card align-items-center shadow-v1 marginTop-30">
            <div class="col-lg-4 px-lg-4 my-4">
                <img class="w-100" src="assets/img/360x220/3.jpg" alt="">
            </div>
            <div class="col-lg-8 paddingRight-30 my-4">
                <div class="media justify-content-between">
                    <div class="group">
                        <a href="#" class="h4" id="orNpck">
                           <ord:out value="${row.status}"/>

<%--                            <ord:out value="${row.order_package}"/> | <ord:out value="${row.status}"/>--%>

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
                        <i class="ti-heart"><span style="display: none;" id="spoderId">${row.user_order_id}</span></i>
                    </a>
                </div>
                <p id="pordadress">
                    <ord:out value="${row.shipTo}"/></p>

            </div>
        </div>
        </ord:forEach>




    </div> <!-- END container-->
</section>
</body>
<script src="/js/order.js"></script>
</html>
