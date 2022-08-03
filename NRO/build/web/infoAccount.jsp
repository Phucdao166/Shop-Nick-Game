<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
    <!--===============================================================================================-->	
            <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
    <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="css/util.css">
            <link rel="stylesheet" type="text/css" href="css/main.css">
    <!--===============================================================================================-->

    <style type="text/css">
        .wrap-login100{
            display: block;
        }
        .info{
            display: flex;
        }
        .info1{
            display: inline;
        }

        .login100-pic {
            width: 433px;
        }
        .login100-pic img {
            margin-top: -112px;
        }
        .info {
            margin-top: -38px;
        }
        .info1 {
            margin-top: -43px;
            margin-left: 35px;
        }
        .container-login100{
            background: linear-gradient(-135deg, #406e3c, #c0b1d5);
        }
        .login100-form-title{
            font-size: 31px;
            color: darkblue;
        }
        .wrap-login100{
            padding: 237px 129px 79px 72px;
        }
        .change{
            background-color: aliceblue;
            text-align: center;
            margin: 18px 27px;
            font-size: 21px;
            font-weight: bold;
            color: cadetblue;
            text-decoration: none;
        }
        .ac{
            color: red;
            font-size: 31px;
            display: initial;
            margin-left: 20px;
        }
    </style>
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" >
			<form class="wrap-login100" action="information" method="post">
                            <li class="nav-item">
            </li>
            <div class="info">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="https://i.imgur.com/Xrb9ATD.png" alt="IMG">
				</div>
                <div class="info1">
                                <div class="login100-form validate-form">
                                    <span class="login100-form-title">UserID:<p class="ac">${a.id}</p></span>
                                </div>
				<div class="login100-form validate-form">
                                    <span class="login100-form-title">User:<p class="ac">${a.user}</p></span>
                                </div>
                                <div class="change">
                                    <a class="change" href="loadpass?id=${a.id}">Change pass</a>
                                </div>
                                </div>
            </div>
			</form>
		
	</div>
        </div>
	

	
<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>