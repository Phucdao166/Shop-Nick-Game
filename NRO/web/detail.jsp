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
  <link href="css/style.min.css" rel="stylesheet">
  <style type="text/css">
    html,
    body,
    header,
    .carousel {
      height: 60vh;
    }

    h3{
        font-weight: 900;
        font-size: 37px;
        color: red;
    }
    
    .lead {
    font-size: 25px;
    font-weight: 600;
}

    .text-warning {
    color: #335fff!important;
}

    img {
        vertical-align: middle;
        border-style: none;
        width: 150%;
        margin-left: 58px;
    }
    @media (max-width: 740px) {

      html,
      body,
      header,
      .carousel {
        height: 100vh;
      }
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
                <a class="nav-link" href="#">Hello ${sessionScope.acc.user}</a>
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
          <li class="nav-item">
              <a class="nav-link waves-effect" href="cart">
                  <span class="badge red z-depth-1 mr-1"> ${sessionScope.cart.size()}</span>
              <i class="fas fa-shopping-cart"></i>
              <span class="clearfix d-none d-sm-inline-block"> Cart </span>
            </a>
          </li>
        </ul>

      </div>

    </div>
  </nav>
  <!--Main layout-->
  <main class="mt-5 pt-4">
    <div class="container dark-grey-text mt-5">

      <!--Grid row-->
      <div class="row wow fadeIn">
          <div class="col-md-3 mb-4">
             <h3 class="title mb-3">Account ${d.nickID}</h3>
          <!--Content-->

            <p class="lead">
              <span class="price h3 text-warning"> 
                <span class="currency"></span><span class="num">${d.money} VND</span>
              </span> 
            </p>

            <p class="lead font-weight-bold">Description</p>
            <p>${d.description}</p> 
            <p>Sever: ${d.sever}</p>
            <p>Power: ${d.power}</p>
            <p>Intrinsic: ${d.intrinsic}</p>
            <p>Disciple: ${d.disciple}</p>   
            <p>Level Skill: ${d.skill}</p> 

            <form class="d-flex justify-content-left">
              <!-- Default input -->
              <a href="showcart?nickID=${d.nickID}" class="btn btn-primary btn-md my-0 p" type="submit">Add to cart
                <i class="fas fa-shopping-cart ml-1"></i>
              </a>
            </form>
          </div>
        <div class="col-md-6 mb-8">
          <div> <a href="#"><img src="${d.dimage}"></a></div>
        </div>
        </div>
      </div>
      <hr>     
  </main>
  <!--Main layout-->

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
