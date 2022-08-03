<%-- 
    Document   : Order
    Created on : Mar 11, 2022, 12:09:41 AM
    Author     : PC PHUC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
            body {
                min-height: 100vh;
                display: flex;
                align-items: center;
                justify-content: center;
                background-color: aliceblue;
                font-size: 0.8rem;
            }

            .card {
                max-width: 1000px;
                margin: 2vh
            }

            .card-top {
                padding: 0.7rem 5rem;
                background-color: antiquewhite;
            }

            .card-top a {
                float: left;
                margin-top: 4px;
                margin-left: -56px;
                background-color: aquamarine;
                border-radius: 26px;
                padding: 8px 16px;
                font-weight: bold;
            }

            #logo {
                font-family: 'Dancing Script';
                font-weight: bold;
                font-size: 2.6rem;
                margin-right: 50px;
            }

            .card-body {
                padding: 0 5rem 5rem 5rem;
                background-color: darksalmon;
                background-size: cover;
                background-repeat: no-repeat;
            }

            @media(max-width:768px) {
                .card-body {
                    padding: 0 1rem 1rem 1rem;
                    background-image: url("https://i.imgur.com/4bg1e6u.jpg");
                    background-size: cover;
                    background-repeat: no-repeat;
                }

                .card-top {
                    padding: 0.7rem 1rem;
                }
            }       

            .row {
                margin: 0
            }

            .upper {
                padding: 2rem 0;
                justify-content: space-evenly;
            }

            #three {
                border-radius: 1rem;
                width: 22px;
                height: 22px;
                margin-right: 3px;
                border: 1px solid blue;
                text-align: center;
                display: inline-block
            }

            #payment {
                margin: 0;
                color: blue
            }

            .icons {
                margin-left: auto
            }

            form span {
                color: rgb(179, 179, 179)
            }

            form {
                padding: 2vh 0
            }

            input {
                border: 1px solid rgba(0, 0, 0, 0.137);
                padding: 1vh;
                margin-bottom: 4vh;
                outline: none;
                width: 100%;
                background-color: rgb(247, 247, 247)
            }

            input:focus::-webkit-input-placeholder {
                color: transparent
            }

            .header {
                font-size: 1.5rem
            }

            .left {
                background-color: #ffffff;
                padding: 2vh
            }

            .left img {
                width: 2rem
            }

            .left .col-4 {
                padding-left: 0
            }

            .right .item {
                padding: 0.3rem 0
            }

            .right {
                background-color: #ffffff;
                padding: 2vh
            }

            .col-8 {
                padding: 0 1vh
            }

            .lower {
                line-height: 2
            }

            .btn {
                background-color: rgb(23, 4, 189);
                border-color: rgb(23, 4, 189);
                color: white;
                width: 100%;
                font-size: 0.7rem;
                margin: 4vh 0 1.5vh 0;
                padding: 1.5vh;
                border-radius: 0
            }

            .btn:focus {
                box-shadow: none;
                outline: none;
                box-shadow: none;
                color: white;
                -webkit-box-shadow: none;
                -webkit-user-select: none;
                transition: none
            }

            .btn:hover {
                color: white
            }

            a {
                color: black
            }

            a:hover {
                color: black;
                text-decoration: none
            }

            input[type=checkbox] {
                width: unset;
                margin-bottom: unset
            }

            #cvv {
                background-image: linear-gradient(to left, rgba(255, 255, 255, 0.575), rgba(255, 255, 255, 0.541)), url("https://img.icons8.com/material-outlined/24/000000/help.png");
                background-repeat: no-repeat;
                background-position-x: 95%;
                background-position-y: center
            }

            #cvv:hover {}
            
        </style>
        <title>Order</title>
    </head>
    <body>
        <div class="card">
    <div class="card-top border-bottom text-center"> <a href="home"> Back to shop</a> <span id="logo">Order Detail</span> </div>
    <div class="card-body">
        <div class="row upper"></div>
        <div class="row">
            <div class="col-md-7">
                <div class="left border">
                    <div class="row"> <span class="header">Payment By Smartbanking</span>
                        <div class="icons"> <img src="https://img.icons8.com/color/48/000000/visa.png" /> <img src="https://img.icons8.com/color/48/000000/mastercard-logo.png" /> <img src="https://img.icons8.com/color/48/000000/maestro.png" /> </div>
                    </div>
                    <form action="order" method="POST">
                       
                        <label for="paymentAccount" class="form-label">Payment Account:</label><input type="text" id="name" name="paymentAccount" placeholder="Account Number">
                        <label for="namePaymentAccount" class="form-label">Name Payment Account:</label><input type="text" id="namePaymentAccount" name="namePaymentAccount" placeholder="Name Payment Account">
                        <label for="infoUser" class="form-label">Phone or Email to receive nick game:</label><input type="text" id="infoUser" name="infoUser" placeholder="Phone Number or Email">
                        <label>Shop Owner Account:</label> <input type="text" value="103870542695" readonly>
                        <label>Name:</label><input type="text" value="DAO XUAN PHUC" readonly>
                        <label>Bank:</label><input type="text" value="Vietinbank" readonly>
                          <div class="row lower">
                        <div class="col text-left"><a href="#"></a></div>
                    </div> <button type="submit" class="btn">Check payment</button>
                    </form>
                </div>
            </div>
            <div class="col-md-5">
                <div class="right border">
                    <div class="header">Order Summary</div>
                    <c:forEach items="${cart}" var="i">
                    <div class="row item">
                        <div class="col-4 align-self-center"><img class="img-fluid" src="${i.value.product.image}"></div>
                        <div class="col-8">
                            <input type="hidden" name="nickID" value="${i.value.product.nickID}"/>
                            <div class="row">Account ${i.value.product.nickID}</div>                          
                            <div class="row text-muted">${i.value.product.planet}</div>
                            <div class="row"><b>${i.value.product.money} VND</b></div>
                        </div>
                    </div>
                    </c:forEach>
                    <hr>
                    <div class="row lower">
                        <div class="col text-left"><b>Total to pay</b></div>
                        <div class="col text-right"><b>${totalMoney} VND</b></div>
                    </div>
                    
                    
                </div>
            </div>
        </div>
    </div>
    <div> </div>
</div>
    </body>
</html>
