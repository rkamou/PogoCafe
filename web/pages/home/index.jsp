<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pogo cafe</title>

    <jsp:include page="/pages/shared/layoutDependecies.jsp" />
</head>
<body>
    <jsp:include page="/pages/shared/layoutTop.jsp" />

    <section class="height-90vh py-5 flex-center bg-cover jarallax" data-dark-overlay="4" style="background:url(/img/mainBg.jpg) no-repeat">
        <div class="containe
        r">
            <div class="row">
                <div class="col-lg-12 mx-auto text-center text-white">
                    <h4 class="display-5 font-weight-bold text-primary wow slideInUp">
                        Welcome to
                    </h4>
                    <h2 class="display-md-3 font-weight-bold text-white wow slideInUp">
                        Pogo Cafe
                    </h2>
                    <p class="lead wow slideInUp">
                        Welcome to our warm and delicious food home
                    </p>
                    <a href="/menu" class="btn btn-primary btn-lg  mt-3 mx-2 wow slideInUp">Our menu</a>
                </div>
            </div>
        </div>
    </section>


    <section class="padding-y-100">
        <div class="container">
            <div class="card flex-wrap flex-row padding-md-40 shadow-v2 z-index-10" data-offset-top-lg="-200">
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <img src="/img/menu/breakfast.jpg" class="card-img-top" alt="">
                        <h4 class="my-4">
                            Breakfast menu
                        </h4>
                        <p>
                            Breakfast description
                        </p>
                        <a href="/menu" class="btn btn-outline-primary mt-3 align-self-start">
                            Read More
                        </a>
                    </div>
                </div>
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <img src="/img/menu/lunch.jpg" class="card-img-top" alt="">
                        <h4 class="my-4">
                            Lunch and dinner
                        </h4>
                        <p>
                            Launch description
                        </p>
                        <a href="/menu" class="btn btn-outline-primary mt-3 align-self-start">
                            Read More
                        </a>
                    </div>
                </div>
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <img src="/img/menu/kids.jpg" class="card-img-top" alt="">
                        <h4 class="my-4">
                            Children menu
                        </h4>
                        <p>
                            Children menu description
                        </p>
                        <a href="/menu" class="btn btn-outline-primary mt-3 align-self-start">
                            Read More
                        </a>
                    </div>
                </div>
            </div> <!-- END row-->
            <div class="row marginTop-lg-100">
                <div class="col-lg-5 mr-auto mt-5">
                    <div class="owl-carousel" data-items="1" data-dots="true">
                        <img class="rounded" src="/img/cafe/cafe1.jpg" alt="">
                        <img class="rounded" src="/img/cafe/cafe2.jpg" alt="">
                        <img class="rounded" src="/img/cafe/cafe3.jpg" alt="">
                        <img class="rounded" src="/img/cafe/cafe4.jpg" alt="">
                    </div>
                </div>
                <div class="col-lg-6 mt-5">
                    <h2>
                        <small class="d-block text-gray">Welcome to</small>
                        <span class="text-primary">Pogo</span> cafe
                    </h2>
                    <p class="my-4">
                    <p>
                        Welcome to Pogo cafe. We offer healthy, fresh Mexican cuisine using only the finest
                        ingredients and freshest products. At Pogo cafe we serve up fresh & healthy Mexican
                        cuisine. Please choose from our selection of appetizers, soups, Tandoori specials, lamb,
                        chicken, biriyani and much much more.
                    </p>
                    <p>
                        We Are Looking forward to having you as our guest while we take you on a culinary journey
                        through Mexico. Offering you not only the best service, our ultimate goal at Sapphire is to
                        ensure that our guests leave with an unforgettable dining experience.
                    </p>
                    </p>
                    <a href="#" class="btn btn-outline-primary">
                        Read More
                    </a>
                </div>
            </div> <!-- END row-->
        </div> <!-- END container-->
    </section>


    <section class="padding-y-100 bg-light-v5">
        <div class="container">
            <div class="row">

                <div class="col-12 text-center">
                    <h2 class="mb-4">
                        Popular meals
                    </h2>
                    <div class="width-3rem height-4 rounded bg-primary mx-auto"></div>
                </div>

                <div class="col-md-4 mt-5">
                    <div class="card wow slideInUp" data-wow-delay=".1s">
                        <img class="card-img-top" src="/img/menu/chicken-menu.jpg" alt="">
                        <div class="padding-30">

                            <div class="d-flex justify-content-between">
                                <div class="media align-items-center">
                                    <img src="/img/users/john.jpg" alt="" class="iconbox mr-2">
                                    <div class="media-body">
                                        by <a href="#" class="text-primary">John Styves Vallon</a>
                                    </div>
                                </div>
                                <a href="#" class="btn btn-opacity-primary iconbox iconbox-sm">
                                    <i class="ti-heart"></i>
                                </a>
                            </div>
                            <h2 class="h4 my-3">
                                Chicken meal
                            </h2>
                            <p>
                                Fresh chicken from our yard
                            </p>
                            <a href="/menu" class="btn btn-outline-primary mt-2">Read More</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mt-5">
                    <div class="card wow slideInUp" data-wow-delay=".2s">
                        <img class="card-img-top" src="/img/menu/bali-menu.jpg" alt="">
                        <div class="padding-30">

                            <div class="d-flex justify-content-between">
                                <div class="media align-items-center">
                                    <img src="/img/users/john.jpg" alt="" class="iconbox mr-2">
                                    <div class="media-body">
                                        by <a href="#" class="text-primary">John Styves Vallon</a>
                                    </div>
                                </div>
                                <a href="#" class="btn btn-opacity-primary iconbox iconbox-sm">
                                    <i class="ti-heart"></i>
                                </a>
                            </div>
                            <h2 class="h4 my-3">
                                Tropical Bali Plate VG
                            </h2>
                            <p>
                                Mmm. Just taste it
                            </p>
                            <a href="/menu" class="btn btn-outline-primary mt-2">Read More</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mt-5">
                    <div class="card wow slideInUp" data-wow-delay=".3s">
                        <img class="card-img-top" src="/img/menu/avocado-menu.jpg" alt="">
                        <div class="padding-30">

                            <div class="d-flex justify-content-between">
                                <div class="media align-items-center">
                                    <img src="/img/users/john.jpg" alt="" class="iconbox mr-2">
                                    <div class="media-body">
                                        by <a href="#" class="text-primary">John Styves Vallon</a>
                                    </div>
                                </div>
                                <a href="#" class="btn btn-opacity-primary iconbox iconbox-sm">
                                    <i class="ti-heart"></i>
                                </a>
                            </div>
                            <h2 class="h4 my-3">
                                Crushed Lime Avocado
                            </h2>
                            <p>
                                The most delicious in your life
                            </p>
                            <a href="/menu" class="btn btn-outline-primary mt-2">Read More</a>
                        </div>
                    </div>
                </div>

                <div class="col-12 text-center marginTop-60">
                    <a href="/menu" class="btn btn-primary btn-lg">
                        See All
                    </a>
                </div>
            </div> <!-- END row-->
        </div> <!-- END container-->
    </section>


    <section class="paddingTop-60 paddingBottom-100">
        <div class="container">
            <div class="row text-center">

                <div class="col-lg-3 col-md-6  mt-5 wow zoomIn" data-wow-delay=".1s">
                    <h1 class="ec-counter text-primary" data-to="520" data-speed="3000">
                        520
                    </h1>
                    <p class="lead text-dark">
                        Menu meals
                    </p>
                </div>

                <div class="col-lg-3 col-md-6  mt-5 wow zoomIn" data-wow-delay=".2s">
                    <h1 class="ec-counter text-primary" data-to="690" data-speed="3000">
                        690
                    </h1>
                    <p class="lead text-dark">
                        Feedbacks on Tripadvisor
                    </p>
                </div>

                <div class="col-lg-3 col-md-6  mt-5 wow zoomIn" data-wow-delay=".3s">
                    <h1 class="ec-counter text-primary" data-to="856084" data-speed="3000">
                        235K
                    </h1>
                    <p class="lead text-dark">
                        Happy Customers
                    </p>
                </div>

                <div class="col-lg-3 col-md-6  mt-5 wow zoomIn" data-wow-delay=".4s">
                    <h1 class="ec-counter text-primary" data-to="5204" data-speed="3000">
                        5204
                    </h1>
                    <p class="lead text-dark">
                        Success Stories
                    </p>
                </div>

            </div> <!-- END row-->
        </div> <!-- END container-->
    </section>

    <jsp:include page="/pages/shared/layoutBottom.jsp" />
</body>
</html>
