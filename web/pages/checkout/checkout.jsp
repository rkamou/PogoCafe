<%--
  Created by IntelliJ IDEA.
  User: johnstyvesvallon
  Date: 2019-08-15
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <jsp:include page="/pages/shared/layoutDependecies.jsp" />


    <!-- Title-->
    <title>Complete education theme for School, College, University, E-learning</title>

    <!-- SEO Meta-->
    <meta name="description" content="Education theme by EchoTheme">
    <meta name="keywords" content="HTML5 Education theme, responsive HTML5 theme, bootstrap 4, Clean Theme">
    <meta name="author" content="education">

    <!-- viewport scale-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">


<%--    <!-- Favicon and Apple Icons-->--%>
<%--    <link rel="icon" type="image/x-icon" href="assets/img/favicon/favicon.ico">--%>
<%--    <link rel="shortcut icon" href="assets/img/favicon/114x114.png">--%>
<%--    <link rel="apple-touch-icon-precomposed" href="assets/img/favicon/96x96.png">--%>


<%--    <!--Google fonts-->--%>
<%--    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Maven+Pro:400,500,700%7CWork+Sans:400,500">--%>


<%--    <!-- Icon fonts -->--%>
<%--    <link rel="stylesheet" href="assets/fonts/fontawesome/css/all.css">--%>
<%--    <link rel="stylesheet" href="assets/fonts/themify-icons/css/themify-icons.css">--%>


<%--    <!-- stylesheet-->--%>
<%--    <link rel="stylesheet" href="assets/css/vendors.bundle.css">--%>
<%--    <link rel="stylesheet" href="assets/css/style.css">--%>

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

                </c:forEach>
<%--                <form class="card p-2">--%>
<%--                    <div class="input-group">--%>
<%--                        <input type="text" class="form-control" placeholder="Promo code">--%>
<%--                        <div class="input-group-append">--%>
<%--                            <button type="submit" class="btn btn-primary">Redeem</button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </form>--%>
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
                            <label">Country</label>
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
                            <label >State</label>
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


                    <hr class="mb-4">

<%--                    <h4 class="mb-3">Payment at the Delivery</h4>--%>


                    <hr class="mb-4">


                    <hr class="mb-4">
                    <button class="btn btn-primary btn-lg btn-block" type="submit" id="send">Proceed checkout</button>
<%--                </form>--%>
            </div>
        </div>
    </div> <!-- END container-->
</section>




<footer class="site-footer">
    <div class="footer-top bg-dark text-white-0_6 pt-5 paddingBottom-100">
        <div class="container">
            <div class="row">

                <div class="col-lg-3 col-md-6 mt-5">
<%--                    <img src="assets/img/logo-white.png" alt="Logo">--%>
                    <div class="margin-y-40">
                        <p>
                            Nunc placerat mi id nisi interdm they mtolis. Praesient is haretra justo ught scel erisque placer.
                        </p>
                    </div>
                    <ul class="list-inline">
                        <li class="list-inline-item"><a class="iconbox bg-white-0_2 hover:primary" href=""><i class="ti-facebook"> </i></a></li>
                        <li class="list-inline-item"><a class="iconbox bg-white-0_2 hover:primary" href=""><i class="ti-twitter"> </i></a></li>
                        <li class="list-inline-item"><a class="iconbox bg-white-0_2 hover:primary" href=""><i class="ti-linkedin"> </i></a></li>
                        <li class="list-inline-item"><a class="iconbox bg-white-0_2 hover:primary" href=""><i class="ti-pinterest"></i></a></li>
                    </ul>
                </div>

                <div class="col-lg-3 col-md-6 mt-5">
                    <h4 class="h5 text-white">Contact Us</h4>
                    <div class="width-3rem bg-primary height-3 mt-3"></div>
                    <ul class="list-unstyled marginTop-40">
                        <li class="mb-3"><i class="ti-headphone mr-3"></i><a href="tel:+8801740411513">800 567.890.576 </a></li>
                        <li class="mb-3"><i class="ti-email mr-3"></i><a href="mailto:support@educati.com">support@educati.com</a></li>
                        <li class="mb-3">
                            <div class="media">
                                <i class="ti-location-pin mt-2 mr-3"></i>
                                <div class="media-body">
                                    <span> 184 Main Collins Street Chicago, United States</span>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>

                <div class="col-lg-2 col-md-6 mt-5">
                    <h4 class="h5 text-white">Quick links</h4>
                    <div class="width-3rem bg-primary height-3 mt-3"></div>
                    <ul class="list-unstyled marginTop-40">
                        <li class="mb-2"><a href="page-about.html">About Us</a></li>
                        <li class="mb-2"><a href="page-contact.html">Contact Us</a></li>
                        <li class="mb-2"><a href="page-sp-student-profile.html">Students</a></li>
                        <li class="mb-2"><a href="page-sp-admission-apply.html">Admission</a></li>
                        <li class="mb-2"><a href="page-events.html">Events</a></li>
                        <li class="mb-2"><a href="blog-card.html">Latest News</a></li>
                    </ul>
                </div>

                <div class="col-lg-4 col-md-6 mt-5">
                    <h4 class="h5 text-white">Newslatter</h4>
                    <div class="width-3rem bg-primary height-3 mt-3"></div>
                    <div class="marginTop-40">
                        <p class="mb-4">Subscribe to get update and information. Don't worry, we won't send spam!</p>
                        <form class="marginTop-30" action="#" method="POST">
                            <div class="input-group">
                                <input type="text" placeholder="Enter your email" class="form-control py-3 border-white" required="">
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="submit">Subscribe</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div> <!-- END row-->
        </div> <!-- END container-->
    </div> <!-- END footer-top-->

    <div class="footer-bottom bg-black-0_9 py-5 text-center">
        <div class="container">
            <p class="text-white-0_5 mb-0">&copy; 2018 Educati. All rights reserved. Created by <a href="http://echotheme.com" target="_blunk">EchoTheme</a></p>
        </div>
    </div>  <!-- END footer-bottom-->
</footer> <!-- END site-footer -->


<div class="scroll-top">
    <i class="ti-angle-up"></i>
</div>

<script src="assets/js/vendors.bundle.js"></script>
<script src="assets/js/scripts.js"></script>
</body>
</html>



