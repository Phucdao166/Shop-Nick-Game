
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- Material Design Bootstrap -->
  <link href="css/mdb.min.css" rel="stylesheet">
  <!-- Your custom styles (optional) -->
  <link href="css/style.min.css" rel="stylesheet">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
        <style>
            body{
                
            }
            h3{
                text-align: center;
                height: 73px;
                font-size: 42px;
                color: crimson;
                background-color: blanchedalmond;
                margin: auto;
            }
            table tr{
                 text-align: center;
            }
            p{
                text-align: center;
                font-size: 19px;
                margin-top: -11px;
                height: 35px;
                background-color: blanchedalmond;
            }
            img{
                margin: 30px 39px;
                 text-align: center;
            }
            .nickID{
                text-align: center;
            }
            .pay{
                float: right;
            }
            .proces{
                padding-top: 10px;
            }
            .pay2{
                float: right;
            }
            .pt-5, .py-5 {
                padding-top: 1rem!important;
            }
            h4{
                text-align: center;
            }
        </style>
    </head>
    <body>
<section class="pt-5 pb-5">
  <div class="container">
    <div class="row w-100">
        <div class="col-lg-12 col-md-12 col-12">
            <h3 class="display-5 mb-2 text-center">Shopping Cart</h3>
                <c:choose>
                    <c:when test="${sessionScope.cart==null||sessionScope.cart.size()==0}">
                        <h1>List Cart is Empty</h1>
                    </c:when>
                    <c:otherwise>
                    <p class="mb-5 text-center">
                        <i class="text-info font-weight-bold">${sessionScope.cart.size()}</i> nick in your cart</p>
                    <table id="shoppingCart" class="table table-condensed table-responsive">
                        <thead>
                            <tr>
                                <th style="width:10%">ID</th>
                                <th style="width:20%">Product</th>
                                <th style="width:12%">Price</th>
                                <th style="width:10%">Planet</th>
                                <th style="width:16%">Action</th>
                            </tr>
                        </thead>
                    <c:forEach items="${cart}" var="i">
                        <tbody>
                            <tr>
                                <td>${i.value.product.nickID}</td>
                                <td>
                                    <img src="${i.value.product.image}" alt="" class="img-fluid d-none d-md-block rounded mb-2 shadow ">
                                </td>
                                <td >${i.value.product.money}</td>
                                <td>${i.value.product.planet}</td>
                                <td>             
                                    <a href="removeproductcart?nickID=${i.value.product.nickID}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>             
                        </tbody>
                    </c:forEach>
                    </table>
                    
                    <div class="pay">
                        <h4>Total:</h4>
                        <h1>${totalMoney} VND</h1>
                    </div>
        </div>
    </div>
            <div class="proces">
                    <div class="pay2">
                        <a href="order" class="btn btn-primary mb-4 btn-lg pl-5 pr-5">Pay</a>
                    </div>
                    </c:otherwise>
                </c:choose>
            <div class="back">
                <a href="home"><i class="fas fa-arrow-left mr-2"></i> Continue Shopping</a>
            </div>
            </div>
    </div>                      
</section>
                            <footer class="page-footer text-center font-small mt-4 wow fadeIn">

    <!--Call to action-->
    <div class="pt-4">
      <a class="btn btn-outline-white" href="https://mdbootstrap.com/docs/jquery/getting-started/download/" target="_blank"
        role="button">Download MDB
        <i class="fas fa-download ml-2"></i>
      </a>
      <a class="btn btn-outline-white" href="https://mdbootstrap.com/education/bootstrap/" target="_blank" role="button">Start
        free tutorial
        <i class="fas fa-graduation-cap ml-2"></i>
      </a>
    </div>
    <!--/.Call to action-->

    <hr class="my-4">

    <!-- Social icons -->
    <div class="pb-4">
      <a href="https://www.facebook.com/mdbootstrap" target="_blank">
        <i class="fab fa-facebook-f mr-3"></i>
      </a>

      <a href="https://twitter.com/MDBootstrap" target="_blank">
        <i class="fab fa-twitter mr-3"></i>
      </a>

      <a href="https://www.youtube.com/watch?v=7MUISDJ5ZZ4" target="_blank">
        <i class="fab fa-youtube mr-3"></i>
      </a>

      <a href="https://plus.google.com/u/0/b/107863090883699620484" target="_blank">
        <i class="fab fa-google-plus-g mr-3"></i>
      </a>

      <a href="https://dribbble.com/mdbootstrap" target="_blank">
        <i class="fab fa-dribbble mr-3"></i>
      </a>

      <a href="https://pinterest.com/mdbootstrap" target="_blank">
        <i class="fab fa-pinterest mr-3"></i>
      </a>

      <a href="https://github.com/mdbootstrap/bootstrap-material-design" target="_blank">
        <i class="fab fa-github mr-3"></i>
      </a>

      <a href="http://codepen.io/mdbootstrap/" target="_blank">
        <i class="fab fa-codepen mr-3"></i>
      </a>
    </div>
    <!-- Social icons -->

    <!--Copyright-->
    <div class="footer-copyright py-3">
      © 2019 Copyright:
      <a href="https://mdbootstrap.com/education/bootstrap/" target="_blank"> MDBootstrap.com </a>
    </div>
    <!--/.Copyright-->
  </footer>
                        
    </body>
</html>
