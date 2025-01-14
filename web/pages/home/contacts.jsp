<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>

    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>


<section class="padding-y-100  bg-black-0_1">
    <div class="container">
        <div class="col-12 text-center mb-5">
            <h2>
                Contact Information
            </h2>
            <div class="width-4rem height-4 bg-primary my-2 mx-auto rounded"></div>
        </div>
        <div class="col-12 text-center bg-white">
            <div class="py-5 position-relative">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-4 col-md-6 mt-4">
                            <div class="media">
                                <span class="iconbox iconbox-md bg-primary text-white"><i class="ti-mobile"></i></span>
                                <div class="media-body ml-3">
                                    <h5 class="mb-0">1-800-643-4500</h5>
                                    <p>Call Us (8AM-10PM)</p>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 mt-4">
                            <div class="media">
                                <span class="iconbox iconbox-md bg-primary text-white"><i class="ti-email"></i></span>
                                <div class="media-body ml-3">
                                    <a href="mailto:support@echotheme.com" class="h5">support@pogocafe.com</a>
                                    <p>Call Us (8AM-10PM)</p>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 mt-4">
                            <div class="media">
                                <span class="iconbox iconbox-md bg-primary text-white"><i
                                        class="ti-location-pin"></i></span>
                                <div class="media-body ml-3">
                                    <h5 class="mb-0">Iowa, USA</h5>
                                    <p>1000 N 4th St, 52775 Fairfield</p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>
