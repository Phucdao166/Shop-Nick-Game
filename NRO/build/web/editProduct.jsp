<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Add Products</title>

        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="vendor/nouislider/nouislider.min.css">

        <!-- Main css -->
        <link rel="stylesheet" href="css/style1.css">

        <style type="text/css">
            img {
                max-width: 100%;
                height: 701px;
                margin: 201px 11px;
            }
            .signup-img {
                width: 350px;
                float: left;
            }

            .signup-form {
                width: 650px;
            }

            .container {
                width: 100%;
                margin: 10px auto;
            }
            .register-form {
                padding: 10px 16px;
            }
            .form-row {
                margin: 0 0px;
            }

            .form-row .form-group {
                width: 93%;
                padding: 0 34px;
            }
            .form-submit {
                width: 15%;
                margin-top: 29px;
                margin-left: 560px;
                margin-bottom: 24px;
            }
            display-flex, .signup-content, .form-row, .label-flex, .form-radio-group {
                display: flow-root;
            }
            h3{
                color: red;
                font-size: 34px;
            }

            .bt {
                background-color: grey;
                font-size: 19px;
                color: cyan;
            }
        </style>

    </head>
    <body>

        <div class="main">

            <div class="container">
                <div class="signup-content">      
                    <form action="editproduct" method="post" class="register-form" id="register-form">
                        <h3 class="modal-title">Edit Nickgame</h3>
                        <div class="form-row">
                            <div class="form-group">
                                <div class="form-input">
                                    <label>ID</label>
                                    <input value="${e.nickID}" type="text" name="id" readonly/>
                                </div>
                                <div class="form-input">
                                    <label class="required">Planet</label>
                                    <input value="${e.planet}" type="text" name="planet" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Image</label>
                                    <input value="${e.image}" type="text" name="image" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Price</label>
                                    <input value="${e.money}"  type="text" name="price"  />
                                </div>
                                <div class="form-input">
                                    <label class="required">Power</label>
                                    <input value="${e.power}" type="text" name="power" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Intrinsic</label>
                                    <input value="${e.intrinsic}" type="text" name="intrinsic"/>
                                </div>
                                <div class="form-input">
                                    <label class="required">Disciple</label>
                                    <input value="${e.disciple}" name="disciple" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">LevelSkill</label>
                                    <input value="${e.skill}" name="levelSkill" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">Detail image</label>
                                    <input value="${e.dimage}" name="detailimage" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">Description</label>
                                    <input value="${e.description}" name="description" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">Sever</label>
                                    <input value="${e.sever}" name="sever" type="text">     
                                </div>
                                <div class="form-input">
                                    <label>Category</label>
                                    <select name="category" class="form-select" aria-label="Default select example">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option> 
                                    </select>
                                </div>    
                            </div>
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Edit" class="submit" id="submit" name="submit" />                      
                        </div>
                        <a href="managerproducts"><button type="button" class="bt">Back to managerproducts</button></a>
                    </form>
                </div>
            </div>
        </div>

        <!-- JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/nouislider/nouislider.min.js"></script>
        <script src="vendor/wnumb/wNumb.js"></script>
        <script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
        <script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
        <script src="js/main.js"></script>
    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>