<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About Our Team</title>
    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
    <script src="/js/login.js"></script>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>
<section class="padding-y-100">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center">
                <h2 class="mb-4">
                    About Our Team
                </h2>
                <div class="width-3rem height-4 rounded bg-primary mx-auto"></div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-11 mx-auto">
                <div class="row align-items-center">
                    <div class="col-lg-7 order-2 order-lg-1 mt-5 wow fadeIn"
                         style="visibility: visible; animation-name: fadeIn;">
                        <h4 class="h3 mb-4">
                            <span class="text-primary d-md-block">Romuald Pogo</span>
                            From Cameroon.
                        </h4>
                        <p>
                            Full Stack Programmer, with several years of experience as a developer in IT industry.
                            Extensively experienced in Software Analysis, Design, Development, Implementation and
                            Testing of Object
                            Oriented Applications and Web based Enterprise Applications using in Java/C++
                            environment.<br/> Single. Favorite hobby is Movies.
                        </p>
                        <%--                <a href="#" class="btn btn-outline-primary mt-3">Read More</a>--%>
                    </div>
                    <div class="col-lg-4 ml-auto order-1 order-lg-2 mt-5 wow fadeIn"
                         style="visibility: visible; animation-name: fadeIn;">
                        <img class="w-100" src="/img/users/pogo.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-11 mx-auto">
                <div class="row align-items-center">
                    <div class="col-lg-4 mr-auto mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">
                        <img class="w-100" src="/img/users/Rustem.jpg" alt="">
                    </div>
                    <div class="col-lg-7 mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">
                        <h4 class="h3 mb-4">
                            <span class="text-primary d-md-block">Rustem Bayetov</span>
                            From Kazakhstan
                        </h4>
                        <p>
                            Master of Front-end but also back-end, with over 13 years of experience as a developer in IT
                            industry.
                            Specialized in C# environment <br>Married. Have son and 2 daughters. Love snowboarding and
                            coding.
                        </p>
                        <%--                <a href="#" class="btn btn-outline-primary mt-3">Read More</a>--%>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-11 mx-auto">
                <div class="row align-items-center">
                    <div class="col-lg-7 order-2 order-lg-1 mt-5 wow fadeIn"
                         style="visibility: visible; animation-name: fadeIn;">
                        <h4 class="h3 mb-4">
                            <span class="text-primary d-md-block">John Styves Vallon </span>
                            From Haiti.
                        </h4>
                        <p>
                            Expert in Mobile App. With a long background of many mobile apps in exploitation <br/>Single
                            no wife and children (free agent). Loves God, Life, Food, Coding,Girl(s) and Sport
                        </p>
                        <%--                <a href="#" class="btn btn-outline-primary mt-3">Read More</a>--%>
                    </div>
                    <div class="col-lg-4 ml-auto order-1 order-lg-2 mt-5 wow fadeIn"
                         style="visibility: visible; animation-name: fadeIn;">
                        <img class="w-100" src="/img/users/jhonn2.jpeg" alt="">
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-11 mx-auto">
                <div class="row align-items-center">
                    <div class="col-lg-4 mr-auto mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">
                        <img class="w-100" src="/img/users/saju.jpeg" alt="">
                    </div>
                    <div class="col-lg-7 mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">
                        <h4 class="h3 mb-4">
                            <span class="text-primary d-md-block">Saju Ahmad</span>
                            From Bangladesh.
                        </h4>
                        <p>
                            Innovative tech mind with 15 years of experience working as a computer programmer. Capable
                            of working with a variety of technology and software solutions, and managing databases.
                            Valuable team member who has experience diagnosing problems and developing solutions. .
                            <br/>Loves Football, Cricket and Fishing.
                        </p>
                        <%--                <a href="#" class="btn btn-outline-primary mt-3">Read More</a>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>
