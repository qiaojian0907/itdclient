<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title> 智能运维系统| Log in</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <script type="text/javascript" language="javascript" src="static/js/jquery.js"></script>
    <link rel="stylesheet" href="static/bootstrap/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="static/bootstrap/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="static/css/font-awesome.css">
    <link rel="stylesheet" href="static/css/ionicons.min.css">
    <link rel="stylesheet" href="static/css/AdminLTE.min.css">
    <script src="static/bootstrap/bootstrap/js/bootstrap.js"></script>
    <script src="static/js/fastclick.js"></script>
    <style>
        body {
            background:url("/static/dist/img/login.jpg") top center no-repeat; background-size:cover;
        }
    </style>
</head>
<body  >
<div class="login-box">
    <div class="login-logo">
        <b style="color:#FFFFFF; text-decoration:none;">智能运维系统</b>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body" style="  background: none">
        <p style="color:#FFFFFF; text-decoration:none;" class="login-box-msg">登录即可开始使用</p>
        <form action="login" method="post">
            <div class="form-group has-feedback">
                <input type="text" id="username" name="username" class="form-control" placeholder="ID">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" id="password" name="password" class="form-control" placeholder="Password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
</div>
<!-- /.login-box -->
</body>
<script type="text/javascript" language="javascript" class="init">
    if(window.location.search.substr(1) =="error"){
        $("#info").html("输入的ID和密码有误，请重新输入.");
    }
</script>
</html>
