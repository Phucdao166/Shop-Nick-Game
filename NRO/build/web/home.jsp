<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Ngoc Rong Online</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="css/style.min.css" rel="stylesheet">
        <style type="text/css">
            html,
            body,
            header,
            .carousel {
                height: 60vh;
                background-color: antiquewhite;
            }
            .nav-item li{
                display: inline-block;
                background-color: #00ff6d;
            }
            .search1{
                display: flex;
            }
            .navbar-brand{
                font-weight: bold;
                font-size: 40px;
                color: bisque;
            }
            .navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5{
                background-color: blue;
            }
            .form-control{
                margin: 5px;
                padding: 9px;
                font-size: 18px;
            }
            .btn{
                padding: 8px;
                font-size: 13px;
            }

            .list-group-item:last-child {
                margin: 0px 0px -1px;
                border-radius: 20px;
            }

            .list-group-item:first-child {
                margin: 0px 0px -1px;
                border-radius: 20px;
            }

            .list-group-item {
                border-radius: 20px; 
            }

            .mdb-color.lighten-3 {
                background-color: #FFA!important;
            }

            .navbar-dark .navbar-brand {
                color: #2a0303;
            }
            .row{
                margin: 1px;
            }
            .view{
                width: 98%;
                margin-left: 11px;
            }
            a{
                color: black;
                font-weight: 100px;
            }
            .nav-item1 { 
                border-radius: 29px;
                background-color: greenyellow;
                padding:  3px;
                color: red;
            }
            .nav-item1 a{ 

                color: red;
            }
            @media (max-width: 740px) {

                html,
                body,
                header,
                .carousel {
                    height: 100vh;
                }
            }
            .page {
                margin: 34px 160px;  
            }
            .page a{
                margin: 19px;
                padding: 10px 13px;
                border: 1px solid;
                border-radius: 29px;
            }
            a.active{
                background-color: greenyellow;
                font-weight: bold;
            }
            .sv{
                display: flex;
                margin-left: 28px;
            }
            .sv p{
                margin-left: 100px;
            }
            h4 a{
                font-size: 29px;
                font-weight: bold;
                color: darkgreen;
            }
            .btn-danger {
                color: cornsilk;
                background-color: blueviolet!important;
                font-weight: bold;
            }
            .btn-success {
                font-weight: bold;
            }
            .cart{
                border: 2px black solid;
                border-radius: 34px;
            }
            .ca{
                color: black;
                font-size: 20px;
                font-weight: bold;
            }
            .mdb-color.lighten-3 {
                background-color: #FFA!important;
                width: 114%;
                margin-left: -64px;
                text-align: center;
            }
            @media (min-width: 800px) and (max-width: 850px) {

                html,
                body,
                header,
                .carousel {
                    height: 100vh;
                }
            }

        </style>
    </head>

    <body>

        <!-- Navbar -->
        <nav class="navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar">
            <div class="container">

                <!-- Brand -->
                <a class="navbar-brand waves-effect" href="home">
                    <strong class="blue-text">NRO</strong>
                </a>

                <!-- Collapse -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <!-- Links -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">

                    <!-- Left -->
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item1">
                            <a class="nav-link waves-effect" href="home">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <c:if test="${sessionScope.acc.isAdmin == 1}">
                            <li class="nav-item1">
                                <a class="nav-link waves-effect" href="manageraccount">Management Account</a>
                            </li>

                            <li class="nav-item1">
                                <a class="nav-link waves-effect" href="managerproducts">Management Product</a>
                            </li>  
                        </c:if>
                        <c:if test="${sessionScope.acc != null}">
                            <li class="nav-item1">
                                <a class="nav-link" href="information?id=${sessionScope.acc.id}">Hello ${sessionScope.acc.user}</a>
                            </li>

                            <li class="nav-item1">
                                <a class="nav-link waves-effect" href="logout">Logout</a>
                            </li>
                        </c:if>

                        <c:if test="${sessionScope.acc == null}">
                            <li class="nav-item1">
                                <a class="nav-link waves-effect" href="login.jsp">Login</a>
                            </li>
                            <li class="nav-item1">
                                <a class="nav-link waves-effect" href="signUp.jsp">Sign Up</a>
                            </li>
                        </c:if>

                    </ul>

                    <!-- Right -->
                    <ul class="navbar-nav nav-flex-icons">
                        <li class="cart">
                            <a class="nav-link waves-effect" href="cart">
                                <c:if test="${sessionScope.cart.size() == cart.size()}">
                                    <span class="badge red z-depth-1 mr-1"> ${sessionScope.cart.size()}</span>
                                </c:if>
                                <i class="fas fa-shopping-cart"></i>
                                <span class="ca"> Cart </span>
                            </a>
                        </li>
                    </ul>

                </div>

            </div>
        </nav>
        <!-- Navbar -->

        <!--Carousel Wrapper-->
        <div id="carousel-example-1z" class="carousel slide carousel-fade pt-4" data-ride="carousel">
            <!--Slides-->
            <div class="carousel-inner" role="listbox">

                <!--First slide-->
                <div class="carousel-item active">
                    <div class="view" style="background-image: url('https://i.imgur.com/6HJhIRf.png'); background-size: cover;"></div>

                    <!-- Mask & flexbox options-->
                    <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">
                    </div>
                </div>
            </div>

        </div>

        <!--/.Carousel Wrapper-->

        <!--Main layout-->
        <main>
            <div class="container">

                <!--Navbar-->
                <nav class="navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5">

                    <!-- Navbar brand -->
                    <span class="navbar-brand">Planet</span>

                    <!-- Collapse button -->
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
                            aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <!-- Collapsible content -->
                    <div class="collapse navbar-collapse" id="basicExampleNav">

                        <!-- Links -->
                        <ul class="navbar-nav mr-auto">   
                            <div class="nav-item">
                                <c:forEach items="${listC}" var="o">
                                    <li class="list-group-item text-white"><a href="category?cid=${o.cid}">${o.cname}</a></li>
                                </c:forEach>
                                <li class="list-group-item text-white"><a href="orderbydesc">Price Decrease</a></li>
                                <li class="list-group-item text-white"><a href="orderbyasc">Price Increase</a></li>
                            </div>
                        </ul>
                        <!-- Links -->

                        <form action="search" method="post" class="form-inline">
                            <div class="search1">
                                <input name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                                <div class="input-group-append">
                                    <button  type="submit" class="btn btn-secondary btn-number">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- Collapsible content -->

                </nav>
            </div>
            <!--/.Navbar-->

            <!--Section: Products v.3-->

            <div class="col-sm-12">
                <div class="row">
                    <c:forEach items="${pageP}" var="o">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <img class="card-img-top" src="${o.image}"a lt="Card image cap">
                                <div class="card-body">
                                    <h4 class="title"><a href="detail?nickID=${o.nickID}" title="View Product">Account ${o.nickID}</a></h4>
                                    <a class="sv">${o.planet}<p>Sever ${o.sever}</p></a>                    
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.money} VND</p>
                                        </div>
                                        <div class="col">
                                            <a href="showcart?nickID=${o.nickID}" class="btn btn-success btn-block">Add to cart</a>             
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <!--Section: Products v.3-->
                </div>
                <!--Pagination-->
                <nav class="d-flex justify-content-center wow fadeIn">
                    <ul class="page">
                        <c:forEach begin="1" end="${endP}" var="i">
                            <a class="${tagg==i?"active":""}" href="page?index=${i}">${i}</a>
                        </c:forEach>
                    </ul>
                </nav>
                <!--Pagination-->

            </div>
        </main>

        <footer class="page-footer text-center font-small mt-4 wow fadeIn">
            <div class="pt-4">
                <a class="btn btn-outline-white" href="http://ngocrongonline.com/" target="_blank"
                   role="button">Download Game
                    <i class="fas fa-download ml-2"></i>
                </a>
                <a class="btn btn-outline-white" href="http://ngocrongonline.com/" target="_blank" role="button">Dragon Ball homepage
                    <i class="fas fa-graduation-cap ml-2"></i>
                </a>
            </div>

            <div class="pb-4">
                <a href="https://www.facebook.com/profile.php?id=100011261025968" target="_blank">
                    <i class="fab fa-facebook-f mr-3"></i>
                </a>

                <a href="https://twitter.com/kanzo166" target="_blank">
                    <i class="fab fa-twitter mr-3"></i>
                </a>

                <a href="https://www.youtube.com/channel/UCXKDYboMtTIadBS7pbocdmA" target="_blank">
                    <i class="fab fa-youtube mr-3"></i>
                </a>

                <a href="#" target="_blank">
                    <i class="fab fa-google-plus-g mr-3"></i>
                </a>

                <a href="#" target="_blank">
                    <i class="fab fa-dribbble mr-3"></i>
                </a>

                <a href="#" target="_blank">
                    <i class="fab fa-pinterest mr-3"></i>
                </a>

                <a href="#" target="_blank">
                    <i class="fab fa-github mr-3"></i>
                </a>

                <a href="#" target="_blank">
                    <i class="fab fa-codepen mr-3"></i>
                </a>
            </div>
            <div class="footer-copyright py-3">
                © 2022 Dragon ball:
                <a href="http://ngocrongonline.com/" target="_blank"> Entertainment games </a>
            </div>
        </footer>
    </body>
</html>
