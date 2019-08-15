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
        const canEdit = '<%= false %>' === 'true';
    </script>

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

    <section class="paddingTop-50 paddingBottom-100 bg-light">
        <div class="container">
            <div class="row align-items-start">

                <!-- Left aside -->
                <aside class="col-lg-3 order-2 order-lg-1">
                    <div class="card shadow-v2 marginTop-30" id="categories-list-container">
                        <h4 class="card-header bg-primary text-white mb-0">Choose Category</h4>
                        <ul class="card-body list-unstyled mb-0" id="categories-list">
                        </ul>
                    </div>
                </aside> <!-- END col-lg-3 -->

                <!-- Menu items list -->
                <div class="col-lg-9 order-1 order-lg-2">
                    <div class="row">
                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/1.jpg" alt="">
                                <div class="card-body">
                                    <span class="badge position-absolute top-0 bg-success text-white" data-offset-top="-13">Best selling</span>
                                    <a href="#" class="h5">
                                        The Web Developer Bootcamp
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Andrew Mead
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-primary">$180</span>
                                    </h4>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/2.jpg" alt="">
                                <div class="card-body">
                                    <span class="badge position-absolute top-0 bg-danger text-white" data-offset-top="-13">Trending</span>
                                    <a href="#" class="h5">
                                        Visual Basic Essential Training
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Andrew Mead, John Doe
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-primary">$10</span>
                                        <span class="d-block text-gray"><s>$129</s></span>
                                    </h4>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/3.jpg" alt="">
                                <div class="card-body">
                                    <a href="#" class="h5">
                                        Programming Real-World Examples
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Anthony Broks
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-primary">$375</span>
                                    </h4>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/4.jpg" alt="">
                                <div class="card-body">
                                    <a href="#" class="h5">
                                        Programming Real-World Examples
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Asif vai
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-primary">$180</span>
                                    </h4>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/5.jpg" alt="">
                                <div class="card-body">
                                    <a href="#" class="h5">
                                        Java 8 Essential Training
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Jonathon
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-primary">$249</span>
                                    </h4>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 marginTop-30">
                            <div href="page-course-details.html" class="card text-gray shadow-v1">
                                <img class="card-img-top" src="assets/img/360x220/6.jpg" alt="">
                                <div class="card-body">
                                    <a href="#" class="h5">
                                        C++ Essential Training
                                    </a>
                                    <p class="my-3">
                                        <i class="ti-user mr-2"></i>
                                        Jonathon
                                    </p>
                                    <p class="mb-0">
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <i class="fas fa-star text-warning"></i>
                                        <span class="text-dark">5</span>
                                        <span>(4578)</span>
                                    </p>
                                </div>
                                <div class="card-footer media align-items-center justify-content-between">
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1">
                                            <i class="ti-headphone small mr-2"></i>
                                            46 lectures
                                        </li>
                                        <li class="mb-1">
                                            <i class="ti-time small mr-2"></i>
                                            27.5 hours
                                        </li>
                                    </ul>
                                    <h4 class="h5 text-right">
                                        <span class="text-success font-weight-bold">Free</span>
                                    </h4>
                                </div>
                            </div>
                        </div>


                    </div> <!-- END row-->
                </div> <!-- END col-lg-9 -->

            </div> <!-- END row-->

        </div> <!-- END container-->
    </section>

    <jsp:include page="/pages/menu2/categoryModal.jsp" />

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>