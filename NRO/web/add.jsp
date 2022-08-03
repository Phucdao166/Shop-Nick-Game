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
        }
        .register-form {
            padding: 10px 16px;
        }
        
        .form-row .form-group {
            width: 77%;
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
    </style>
    
</head>
<body>

    <div class="main">

        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="https://i.imgur.com/OYL4LEb.jpg" alt="">
                    
                </div>
                
                    <form action="add" method="post" class="register-form" id="register-form">
                        <h3 class="modal-title">Add New Nickgame</h3>
                        <div class="form-row">
                            <div class="form-group">
                                <div class="form-input">
                                    <label class="required">Planet</label>
                                    <input type="text" name="planet" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Image</label>
                                    <input type="text" name="image" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Price</label>
                                    <input type="text" name="price"  />
                                </div>
                                <div class="form-input">
                                    <label class="required">Power</label>
                                    <input type="text" name="power" />
                                </div>
                                <div class="form-input">
                                    <label class="required">Intrinsic</label>
                                    <input type="text" name="intrinsic"/>
                                </div>
                                <div class="form-input">
                                    <label class="required">Disciple</label>
                                    <input name="disciple" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">LevelSkill</label>
                                    <input name="levelSkill" type="text">
                                </div>
                                <div class="form-input">
                                     <label class="required">Detail image</label>
                                    <input name="detailimage" type="text">
                                </div>
                                <div class="form-input">
                                    <label class="required">Description</label>
                                <input name="description" type="text">
                                </div>
                                <div class="form-input">
                                   <label class="required">Sever</label>
                                <input name="sever" type="text">     
                                </div>
                                <div class="form-group">
                                <label>Category</label>
<!--                                <select name="category" class="form-select" aria-label="Default select example">
                                        <option value="Xayda">1</option>
                                        <option value="Trái Đất">2</option>
                                        <option value="Namec">3</option>
                                </select>-->
                            </div>
                            </div>
                        <div class="form-submit">
                            <input type="submit" value="add" class="submit" id="submit" name="submit" />                      
                        </div>
                        </div>
                    </form>
                
            
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