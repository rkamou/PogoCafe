<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="/js/shopCart.js"></script>

<nav class="ec-nav sticky-top bg-white">
    <div class="container">
        <div class="navbar p-0 navbar-expand-lg">
            <div class="navbar-brand">
                <a class="logo-default" href="index.html"><img alt="" src="/"></a>
            </div>
            <span aria-expanded="false" class="navbar-toggler ml-auto collapsed" data-target="#ec-nav__collapsible"
                  data-toggle="collapse">
        <div class="hamburger hamburger--spin js-hamburger">
          <div class="hamburger-box">
            <div class="hamburger-inner"></div>
          </div>
        </div>
      </span>
            <div class="collapse navbar-collapse when-collapsed" id="ec-nav__collapsible">
                <ul class="nav navbar-nav ec-nav__navbar ml-auto">


                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/menu">Menu</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contacts">Contacts</a>
                    </li>
                    <c:if test="${loginStatus != 'loggedin'}">
                        <li class="nav-item">
                            <a class="nav-link" href="/login">Login</a>
                        </li>
                    </c:if>

                     <c:if test="${loginStatus == 'loggedin'}">
                        <li class="nav-item">
                            <a class="nav-link" href="/list-user">Users</a>
                        </li>
                        <c:if test="${userType == 'ADMIN'}">
<%--                            <li class="nav-item">--%>
<%--                                <a class="nav-link" href="#">Reports</a>--%>
<%--                            </li>--%>
                            <li class="nav-item">
                                <a class="nav-link" href="/orders-list">Order List</a>
                            </li>
<%--                            <li class="nav-item">--%>
<%--                                <a class="nav-link" href="#">Delivery List</a>--%>
<%--                            </li>--%>
                        </c:if>
                         <c:if test="${userType == 'DELIVER'}">
                             <li class="nav-item">
                                 <a class="nav-link" href="#">Delivery List</a>
                             </li>
                         </c:if>
                        <li class="nav-item">
                            <a class="nav-link" href="/logout">Logout</a>
                        </li>
                        <li class="nav-item">
                            <p id="" class="nav-link" href="#">Logged in as ${userType}</p>
                        </li>
                    </c:if>
                </ul>
            </div>

            <!-- Shopping cart -->
            <div class="nav-toolbar">
                <ul class="navbar-nav ec-nav__navbar">
                    <li class="nav-item nav-item__has-dropdown">
                        <a class="nav-link dropdown-toggle no-caret" href="#" data-toggle="dropdown"><i class="ti-shopping-cart"></i></a>
                        <ul class="dropdown-menu dropdown-cart" aria-labelledby="navbarDropdown" id="shopping-cart"></ul>
                    </li>
                </ul>
            </div>
        </div>
    </div> <!-- END container-->
</nav>
<!-- END ec-nav -->
