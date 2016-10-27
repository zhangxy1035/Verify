<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--Mobile first-->
    <title>APP管理平台</title>
    
    <meta name="description" content="Free Admin Template Based On Twitter Bootstrap 3.x">
    <meta name="author" content="">
    
    <meta name="msapplication-TileColor" content="#5bc0de" />
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="../lib/css/bootstrap.css">
    

    <!-- Metis core stylesheet -->
    <link rel="stylesheet" href="../lib/css/main.css">



    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body class="login">

      <div class="form-signin">
    <div class="text-center">
        <img src="../images/logo.png" alt="Metis Logo">
    </div>
    <hr>
    <div class="tab-content">
        <div id="login" class="tab-pane active">
            <form id="loginForm" action="login.from" method="post">
                <p class="text-muted text-center">
                    输入用户名和密码
                </p>
                <input type="text" name="username" placeholder="用户名" class="form-control top">
                <input type="password" name="password" placeholder="密码" class="form-control top">
                <input name="code" type="text" placeholder="验证码" class="form-control bottom">
                <img src="getCode.from" alt="验证码" id="img" onclick="change()" />
                <div class="checkbox">
		  <label>
		    <input type="checkbox"> 记住用户名和密码
		  </label>
		</div>
                <button class="btn btn-lg btn-primary btn-block" onclick="doSubmit();">登陆</button>
            </form>
        </div>
    </div>
    <hr>
  </div>


    <!--jQuery -->
    <script  src="../lib/js/jquery.js"></script>

    <!--Bootstrap -->
    <script src="../lib/js/bootstrap.js"></script>


    <script type="text/javascript">

        function doSubmit(){
            //表单数据js检查
            //提交表单
            document.getElementById("loginForm").submit();
        }
        function change(){
            document.getElementById("img").src='getCode.from?'+new Date().getTime();
        };

    </script>
</body>
</html>
