
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
    <script src="/js/order.js"></script>
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp" />

<section class="paddingTop-50 paddingBottom-100 bg-light-v2">
    <div class="container" id="orders-container">
            <ord:forEach var="order" items="${order_data}">
            <div class="list-card align-items-center shadow-v1 marginTop-30">
            <div class="col-lg-12 paddingRight-30 my-4">
                <div class="media justify-content-between">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-6">
                                <div class="group">
                                    <h4>#${order.id}, status: <ord:out value="${order.status}" /></h4>
                                    <ul class="list-inline mt-3">
                                        <li class="list-inline-item mr-2">
                                            <i class="ti-user mr-2"></i><span id="orderUser_id"><ord:out value="${order.firstName} ${order.lastName}" /></span>
                                            UserName: ${order.username}<br>
                                            Email: ${order.email}<br>
                                            Address 1: ${order.adresse1}<br>
                                            Address 2: ${order.adresse2}<br>
                                            ZIP: ${order.zip}<br>
                                            City: ${order.city}<br>
                                            State: ${order.state}<br>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-6">
                                <h4>Ordered items list</h4>
                                <ul>
                                <ord:forEach var="orderItem" items="${order.listItem}">
                                    <li>${orderItem.name}, ${orderItem.price} USD</li>
                                </ord:forEach>
                                </ul>
                                <h5>Total: ${order.totalAmount} USD</h5>
                                <div class="w-100">
                                    <ord:if test="${order.status == 'ORDERED'}">
                                        <button class="btn btn-primary float-right proceed-to-delivery" order-id="${order.id}">Proceed to delivery</button>
                                    </ord:if>
                                    <ord:if test="${order.status=='ONDELIVERY'}">
                                        <button class="btn btn-primary float-right mark-as-delivered" order-id="${order.id}">Mark as delivered</button>
                                    </ord:if>

                                    <ord:if test="${order.status=='DELIVERED'}">
                                        <h4 class="float-right mt-2">Delivered</h4>
                                    </ord:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </ord:forEach>




    </div> <!-- END container-->
</section>
</body>
</html>
