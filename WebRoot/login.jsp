
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录注册页</title>

<link rel="stylesheet" href="css/bootstrap.min.css">

<style type="text/css">  
            body{background: url(img/background.jpg) no-repeat;background-size:cover;font-size: 16px;}  
            .form{background: rgba(255,255,255,0.2);width:400px;margin:100px auto;}  
            #login_form{display: block;}  
            #register_form{display: none;}  
            .fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}  
            input[type="text"],input[type="password"]{padding-left:26px;}  
            .checkbox{padding-left:21px;}  
        </style>  
</head>

<body>
	
	<div class="container">  
        <div class="form row">  
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form"  method="get" action="login/login">  
                <h3 class="form-title">Welcome to GFinder</h3>
                <div class="col-sm-9 col-md-9">
                    <div class="form-group">  
                        <i class="fa fa-user fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="username " name="username" autofocus="autofocus" maxlength="20"/>  
                    </div>  
                    <div class="form-group">  
                        <i class="fa fa-lock fa-lg"></i>  
                        <input class="form-control required" type="password" placeholder="password" name="password" maxlength="8"/>  
                    </div>  
                    <div class="form-group">  
                        <label class="checkbox">
                        <input type="checkbox" name="remember" value="1"/> remember me
                        </label> 
                        
                        <hr/>
                        <a href="javascript:;" id="register_btn" class="">register</a>  
                    </div>  
                    <div class="form-group">  
                        <input type="submit" class="btn btn-success pull-right" id="login_submit" value="Login " />     
                    </div>  
                </div>  
            </form>  
        </div>  
  
        <div class="form row">  
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form"  method="get" action="login/register">  
                <h3 class="form-title">Register</h3>  
                <div class="col-sm-9 col-md-9">  
                    <div class="form-group">  
                        <i class="fa fa-user fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="username" name="username" autofocus="autofocus"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-lock fa-lg"></i>  
                            <input class="form-control required" type="password" placeholder="password" id="register_password" name="password"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="password" placeholder="input again" name="rpassword"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-envelope fa-lg"></i>  
                            <input class="form-control eamil" type="text" placeholder="email" name="email"/>  
                    </div>  
                    <div class="form-group">  
                        <input type="submit" class="btn btn-success pull-right" id="register_submit"  value="Register	" />  
                        <input type="submit" class="btn btn-info pull-left" id="back_btn" value="Back"/>  
                    </div>  
                </div>  
            </form>  	
        </div>    
        
	<script src="js/jquery-3.3.1.js" type="text/javascript"></script>
	<script src="js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/messages_zh.js" type="text/javascript"></script>
    <script src="js/login.js" type="text/javascript"></script>  
    <script>
    
    </script>
</body>
</html>