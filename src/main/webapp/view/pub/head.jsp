<%--
  Created by IntelliJ IDEA.
  User: wangbl
  Date: 2018/1/6
  Time: 上午10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--密码修改-->
<div class="modal fade bs-example-modal-lg" tabindex="-1" id="iuModifyPassword" role="dialog"
     aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" style="width:400px" role="document">
        <form onsubmit="return updatePassword();">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="head_experiment">密码修改</h4>
                    <html:hidden id="login_id"/>
                </div>
                <div class="form-horizontal modal-body">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">原密码</label>
                        <div class="col-sm-7">
                            <input type="password" required="required" class="form-control" id="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">新密码</label>
                        <div class="col-sm-7">
                            <input type="password" required="required" class="form-control" id="new_password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">确认密码</label>
                        <div class="col-sm-7">
                            <input type="password" required="required" class="form-control" id="confirm_password">
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button id="iu_modifyPassword_button" class="btn btn-info" data-container="body"
                            data-toggle="popover"
                            data-placement="bottom" data-content="">提交
                    </button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </form>
    </div>
</div>
<!--提示窗口-->
<div class="modal fade" id="passwordInfo" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="passwordModalLabel">提示</h4>
            </div>
            <div class="modal-body">
                <label class="control-label" id="passwordLabelInfo">作业下发成功！</label>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<form action="logout" method="post" id="outform">
</form>
<header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>D</b>EP</span>
        <!-- logo for regular state and mobile devices -->
        <!--<span class="logo-lg"><b>Tsinghua</b> University</span> -->
        <span class="logo-lg"><b></b>能源与动力工程系</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>
        <a href="#" class="logohead">
            <span class="logo-lg"><b></b>动力工程及工程热物理国家级实验教学示范中心</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li>
                    <a>
                        <span>${login_name}</span>
                    </a>
                </li>
                <li class="dropdown user user-menu">
                    <a href="#" onclick="modifyPassword();">
                        <span class="hidden-xs">密码修改</span>
                    </a>
                </li>
                <!-- Control Sidebar Toggle Button -->
                <li>
                    <a href="javascript:;" onclick="logout();" data-toggle="control-sidebar"><span
                            class="hidden-xs">退出</span></a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<script type="text/javascript" language="javascript" class="init">
    function modifyPassword() {
        $('#iuModifyPassword').modal('show');
    }
    function updatePassword() {
        $.ajax({
            type: "POST",
            url: "updatePassword",
            data: {
                "password": $("#password").val(),
                "new_password": $("#new_password").val(),
                "confirm_password": $("#confirm_password").val()
            }
        }).then(function (data) {
            $('#iuModifyPassword').modal('hide');
            $('#passwordLabelInfo').html(data);
            $('#passwordInfo').modal('show');
        });
        return false;
    }
    function logout() {
        document.getElementById("outform").submit();
    }
</script>
