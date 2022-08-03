<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <title>Au Register Forms by Colorlib</title>
        <link href="css/main1.css" rel="stylesheet" media="all">
        <style type="text/css">
            .title {
                font-size: 48px;
                color: cornsilk;
                background-color: darkseagreen;
                font-weight: bold;
                margin-bottom: 40px;
                text-align: center;
                border-radius: 20px;
            }
            
            .bg-gra-02{
                background: linear-gradient(to top right, #3d979b 0%, #232025 100%);
            }
        </style>
    </head>

    <body>
        <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
            <div class="wrapper wrapper--w680">
                <div class="card card-4">
                    <div class="card-body">
                        <h2 class="title">Change Password</h2>
                        <form action="changepass?id=${a.id}" method="post">
                            <p class="text-danger">${mess}</p><br/>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Oldpass</label>
                                        <input class="input--style-4" type="text" name="oldpass">
                                    </div>
                                </div>
                            </div>

                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">NewPass</label>
                                        <input class="input--style-4" type="text" name="newpass">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Repass</label>
                                        <input class="input--style-4" type="text" name="repass">
                                    </div>
                                </div>
                            </div>
                            <div class="p-t-15">
                                <button class="btn btn--radius-2 btn--blue" type="submit">Change</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <!--    <script src="vendor/jquery1/jquery.min.js"></script>
             Vendor JS
            <script src="vendor/select3/select2.min.js"></script>
            <script src="vendor/datepicker/moment.min.js"></script>
            <script src="vendor/datepicker/daterangepicker.js"></script>-->

        <!-- Main JS-->
        <!--    <script src="js/global.js"></script>-->

    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->