<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Title-->
    <title>Complete education theme for School, College, University, E-learning</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>

<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />


    <section class="padding-y-150">
        <div class="container">
            <div class="row">
                <div class="col-md-4 order-md-2 mb-4">
                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                        <span>Your cart</span>
                        <%--                    <span class="badge badge-primary badge-pill">3</span>--%>
                    </h4>
                    <c:set var="evenCount" value="${0}" />

                    <c:forEach var="cartData" items="${model_data}">


                        <ul class="list-group mb-3">
                            <li class="list-group-item d-flex justify-content-between lh-condensed">
                                <div>
                                    <h6 class="my-0">${cartData.name}</h6>
                                    <small class="text-muted">${cartData.ingredients}</small>
                                </div>
                                <span class="text-muted">$${cartData.price}</span>
                            </li>


                        </ul>

                        <c:set var="evenCount" value="${evenCount+cartData.price}" />


                    </c:forEach>



                               <span class="text-muted float-right">Total : USD <c:out value="${evenCount}"/></span>


                </div>
                <div class="col-md-8 order-md-1">
                    <h4 class="mb-3">Billing address</h4>
                    <%--                <form class="needs-validation" novalidate="" _lpchecked="1">--%>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="firstName">First name</label>
                            <input type="text" class="form-control" id="firstName" placeholder="" value="" required="required">
                            <div class="invalid-feedback">
                                Valid first name is required.
                            </div>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="lastName">Last name</label>
                            <input type="text" class="form-control" id="lastName" placeholder="" value="" required="">
                            <div class="invalid-feedback">
                                Valid last name is required.
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="username">Username</label>
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text">@</span>
                            </div>
                            <input type="text" class="form-control" id="username" placeholder="Username" required="">
                            <div class="invalid-feedback" style="width: 100%;">
                                Your username is required.
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="email">Email <span class="text-muted">(Optional)</span></label>
                        <input type="email" class="form-control" id="email" placeholder="you@example.com">
                        <div class="invalid-feedback">
                            Please enter a valid email address for shipping updates.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address">Address</label>
                        <input type="text" class="form-control" id="address" placeholder="1234 Main St" required="">
                        <div class="invalid-feedback">
                            Please enter your shipping address.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address2">Address 2 <span class="text-muted">(Optional)</span></label>
                        <input type="text" class="form-control" id="address2" placeholder="Apartment or suite">
                    </div>

                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <label>Country</label>
                            <input type="text" class="form-control" id="contr_name" placeholder="country">

                            <%--                            <select class="custom-select d-block w-100" id="country" required="">--%>
                            <%--                                <option value="">Choose...</option>--%>
                            <%--                                <option>United States</option>--%>
                            <%--                            </select>--%>
                            <%--                            <div class="invalid-feedback">--%>
                            <%--                                Please select a valid country.--%>
                            <%--                            </div>--%>
                        </div>
                        <div class="col-md-4 mb-3">
                            <label>State</label>
                            <input type="text" class="form-control" id="city_state" placeholder="state">

                            <%--                            <select class="custom-select d-block w-100" id="state" required="">--%>
                            <%--                                <option value="">Choose...</option>--%>
                            <%--                                <option>California</option>--%>
                            <%--                            </select>--%>
                            <%--                            <div class="invalid-feedback">--%>
                            <%--                                Please provide a valid state.--%>
                            <%--                            </div>--%>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="zip">Zip</label>
                            <input type="text" class="form-control" id="zip" placeholder="" required="">
                            <div class="invalid-feedback">
                                Zip code required.
                            </div>
                        </div>
                    </div>

                    <hr class="mb-4">
                    <div class="clearfix">
                        <label class="ec-checkbox check-xs mb-3 mr-4">
                            <input type="checkbox" name="checkbox">
                            <span class="ec-checkbox__control"></span>
                            <span class="ec-checkbox__lebel">
                                Payment at Delivery
                            </span>
                        </label>
                    </div>

                    <button class="btn btn-primary btn-lg btn-block" id="send">Proceed checkout</button>
                    <%--                </form>--%>
                </div>
            </div>
        </div> <!-- END container-->
    </section>

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
    <%--<script src="assets/js/vendors.bundle.js"></script>--%>
    <%--<script src="assets/js/scripts.js"></script>--%>
</body>
</html>



