<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ include file="/view/pub/base.jsp" %>
    <title>运维系统</title>
    <link href="static/switch/bootstrap-switch.min.css" rel="stylesheet">
    <script src="static/switch/bootstrap-switch.js"></script>
    <link href="static/bs_grid/jquery.bs_grid.min.css" rel="stylesheet">
    <script src="static/bs_grid/jquery.bs_grid.js"></script>
    <script src="static/bs_grid/en.min.js"></script>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
</head>
<script type="text/javascript" language="javascript" class="init">


</script>
<body class="hold-transition skin-blue sidebar-mini">
<!--提示窗口-->
<div class="modal fade" id="alertInfo" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="promptInfo">提示</h4>
            </div>
            <div class="modal-body">
                <label class="control-label" id="alertLabelInfo">操作成功！</label>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<!--提示窗口-->
<div class="modal fade" id="opAlertInfo" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="opPromptInfo">提示</h4>
            </div>
            <div class="modal-body">
                <label class="control-label" id="opAlertLabelInfo">确认删除此条数据吗？</label>
            </div>
            <div class="modal-footer">
                <button id="confirm" name="confirm" class="btn btn-info">是</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">否</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="loginInfoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" style="width:800px;" role="document">
        <div class="modal-content ">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="exampleModalLabel">员工信息管理</h4>
            </div>
            <div class="modal-body">
                <div class="form-horizontal">
                    <form id=add_form>
                        <div class="box-body">
                            <html:hidden id="org_id"/>
                            <html:hidden id="mg_org"/>
                            <html:hidden id="create_login"/>
                            <html:hidden id="role_id"/>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-link" aria-hidden="true"></span>
                                    <label class="control-label">工号</label>
                                </div>
                                <div class="col-md-4">
                                    <input class="form-control" id="login_no" name="login_no" data-container="body" data-toggle="popover" data-placement="bottom" data-content="此字段必须填写">
                                </div>
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                    <label class="control-label">工号名称</label>
                                </div>
                                <div class="col-md-4">
                                    <input class="form-control" id="login_name" name="login_name">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                    <label class="control-label">客户名称</label>
                                </div>
                                <div class="col-md-4">
                                    <input class="form-control" id="cust_name" name="cust_name">
                                </div>
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-phone" aria-hidden="true"></span>
                                    <label class="control-label">电话号码</label>
                                </div>
                                <div class="col-md-4">
                                    <input class="form-control" id="phone_no" name="phone_no">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                                    <label class="control-label">归属组织</label>
                                </div>
                                <div class="col-md-4">
                                    <div class="input-group">
                                        <input class="form-control" id="org_name" name="org_name" readonly="true">
                                        <span class="input-group-addon" id="org_choose" style="cursor:pointer;"><i class="fa fa-check-square-o"></i></span>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                                    <label class="control-label">管理范围</label>
                                </div>
                                <div class="col-md-4">
                                    <div class="input-group">
                                        <input class="form-control" id="mg_orgname" name="mg_orgname" readonly="true">
                                        <span class="input-group-addon" id="mgorg_choose" style="cursor:pointer;"><i class="fa fa-check-square-o"></i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                    <label class="control-label">工号角色</label>
                                </div>
                                <div class="col-md-4">
                                    <div class="input-group">
                                        <input class="form-control" id="role_name" name="role_name" readonly="true">
                                        <span class="input-group-addon" id="role_choose" style="cursor:pointer;"><i class="fa fa-check-square-o"></i></span>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <span class="fa fa-check" aria-hidden="true"></span>
                                    <label class="control-label">性别</label>
                                </div>
                                <div class="col-md-2">
                                    <input id="sex" name="sex" type="checkbox" checked="checked" data-off-color="primary" data-on-text="男" data-off-text="女">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                                    <label class="control-label">地址</label>
                                </div>
                                <div class="col-md-4">
                                    <textarea class="form-control" id="address" name="address"></textarea>
                                </div>
                                <div class="col-md-2">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                    <label class="control-label">备注</label>
                                </div>
                                <div class="col-md-4">
                                    <textarea class="form-control" id="note" name="note"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-2">
                                    <span class="fa fa-check" aria-hidden="true"></span>
                                    <label class="control-label">有效标志</label>
                                </div>
                                <div class="col-md-2">
                                    <input id="valid" name="valid" type="checkbox"  checked="checked" data-on-text="是" data-off-text="否">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" id="save" class="btn btn-primary">保存</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="orgtreemodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="ModalLabel">组织部门</h4>
            </div>
            <div class="modal-body">
                <div id="orgtree" class=""></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="mgorgtreemodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="orgModalLabel">下辖组织部门</h4>
            </div>
            <div class="modal-body">
                <div id="mgorgtree" class=""></div>
            </div>
            <div class="modal-footer">
                <button type="button" id="savemgorg" class="btn btn-primary">保存</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="roletreemodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="roleModalLabel">系统角色</h4>
            </div>
            <div class="modal-body">
                <div id="roletree" class=""></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>O</b>MT</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Operation</b>MT</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">4</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有 4 未读邮件</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li><!-- start message -->
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="static/dist/img/user2-160x160.jpg" class="img-circle"
                                                     alt="User Image">
                                            </div>
                                            <h4>
                                                请处理报修工单
                                                <small><i class="fa fa-clock-o"></i> 5 分钟</small>
                                            </h4>
                                            <p>请审批234号报修工单</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="static/dist/img/user3-128x128.jpg" class="img-circle"
                                                     alt="User Image">
                                            </div>
                                            <h4>
                                                开会通知
                                                <small><i class="fa fa-clock-o"></i> 2 小时</small>
                                            </h4>
                                            <p>6月1日系统开发进展通报会</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="static/dist/img/user4-128x128.jpg" class="img-circle"
                                                     alt="User Image">
                                            </div>
                                            <h4>
                                                安全检查
                                                <small><i class="fa fa-clock-o"></i> 今天</small>
                                            </h4>
                                            <p>6月2日安全组检查</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="static/dist/img/user3-128x128.jpg" class="img-circle"
                                                     alt="User Image">
                                            </div>
                                            <h4>
                                                运维监控系统使用培训
                                                <small><i class="fa fa-clock-o"></i> 昨天</small>
                                            </h4>
                                            <p>请您参加5月25日运维监控系统使用培训</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="static/dist/img/user4-128x128.jpg" class="img-circle"
                                                     alt="User Image">
                                            </div>
                                            <h4>
                                                运维监控系统上线通知
                                                <small><i class="fa fa-clock-o"></i> 2 天</small>
                                            </h4>
                                            <p>运维监控系统6月20日上线试运行</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">查看所有邮件</a></li>
                        </ul>
                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-bell-o"></i>
                            <span class="label label-warning">10</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有10个通知</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-aqua"></i> 5名新员工入职
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-warning text-yellow"></i>运维监控系统6月20日上线试运行
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-red"></i>五个告警信息待处理
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-shopping-cart text-green"></i>两个设备维修工单待审批
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-user text-red"></i>设备巡检
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">查看全部</a></li>
                        </ul>
                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-flag-o"></i>
                            <span class="label label-danger">9</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有 9 个待处理任务</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                处理预警任务
                                                <small class="pull-right">20%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-aqua" style="width: 20%"
                                                     role="progressbar"
                                                     aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">20% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                跟踪维修工单
                                                <small class="pull-right">40%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-green" style="width: 40%"
                                                     role="progressbar"
                                                     aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">40% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                更换车道设备
                                                <small class="pull-right">60%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-red" style="width: 60%"
                                                     role="progressbar"
                                                     aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">60% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                处理服务器报警
                                                <small class="pull-right">80%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-yellow" style="width: 80%"
                                                     role="progressbar"
                                                     aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">80% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                </ul>
                            </li>
                            <li class="footer">
                                <a href="#">查看所有任务</a>
                            </li>
                        </ul>
                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="static/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs">管理员</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    系统管理员
                                    <small>智能运维系统</small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <li class="user-body">
                                <div class="row">
                                    <div class="col-xs-4 text-center">
                                        <a href="#">F</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">S</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">F</a>
                                    </div>
                                </div>
                                <!-- /.row -->
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">Profile</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- Control Sidebar Toggle Button  设置
                    <li>
                      <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                    </li>
                    -->
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>管理员</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu" id="funcMenu">
                <li class="header">功能菜单</li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                工号管理
                <small>Login management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active"></li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Your Page Content Here -->
            <div class="box box-info">
                <div class="box-header with-border">
                    <div class="btn-group" role="group" aria-label="...">
                        <button type="button" id="add" class="btn btn-info" data-toggle="modal" data-target="#loginInfoModal" data-whatever="@增加">添加</button>
                        <button type="button" id="delete" class="btn btn-info" data-container="body" data-toggle="popover" data-placement="bottom" data-content="请选择需要删除的工号">删除</button>
                        <button type="button" id="update" class="btn btn-info" data-whatever="@修改" data-container="body" data-toggle="popover" data-placement="bottom" data-content="请选择需要修改的记录">修改</button>
                    </div>
                </div><!-- /.box-header -->
                <div class="form-horizontal">
                    <div class="box-body">
                        <html:hidden id="org_flag"/>
                        <html:hidden id="sel_org_id"/>
                        <html:hidden id="login_id"/>
                        <html:hidden id="op_type" />
                        <div class="form-group">
                            <div class="col-md-2">
                                <span class="glyphicon glyphicon-link" aria-hidden="true"></span>
                                <label class="control-label">工号</label>
                            </div>
                            <div class="col-md-2">
                                <input class="form-control" id="sel_login_no" name="sel_login_no">
                            </div>
                            <div class="col-md-2">
                                <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                <label class="control-label">工号名称</label>
                            </div>
                            <div class="col-md-2">
                                <input class="form-control" id="sel_login_name" name="sel_login_name">
                            </div>
                            <div class="col-md-2">
                                <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                                <label class="control-label">归属组织</label>
                            </div>
                            <div class="col-md-2">
                                <div class="input-group">
                                    <input class="form-control" id="query_org_name" name="query_org_name" readonly="true">
                                    <span class="input-group-addon" id="query_org_choose" style="cursor:pointer;"><i class="fa fa-check"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="box-footer">
                        <div class="col-md-5"></div>
                        <div class="col-md-2">
                            <button type="submit" id="query" class="btn btn-block btn-info">查询1</button>
                        </div>
                        <div class="col-md-5"></div>
                    </div>
                </div><!-- /.box-footer -->
            </div><!-- /.box -->
            <div class="box box-success">
                <div id="login_grid"></div>
            </div><!-- /.box -->
        </section><!-- /.content -->
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 0.1.0
        </div>
        <strong>版权所有 &copy; 2018-2020 <a href="https://www.baidu.com">视讯伟业科技有限公司</a>.</strong> 保留一切权利.
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
            <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <!-- Home tab content -->
            <div class="tab-pane" id="control-sidebar-home-tab">
                <h3 class="control-sidebar-heading">Recent Activity</h3>
                <ul class="control-sidebar-menu">
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-birthday-cake bg-red"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                                <p>Will be 23 on April 24th</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-user bg-yellow"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                                <p>New phone +1(800)555-1234</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                                <p>nora@example.com</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-file-code-o bg-green"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                                <p>Execution time 5 seconds</p>
                            </div>
                        </a>
                    </li>
                </ul>
                <!-- /.control-sidebar-menu -->

                <h3 class="control-sidebar-heading">Tasks Progress</h3>
                <ul class="control-sidebar-menu">
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Custom Template Design
                                <span class="label label-danger pull-right">70%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Update Resume
                                <span class="label label-success pull-right">95%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Laravel Integration
                                <span class="label label-warning pull-right">50%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Back End Framework
                                <span class="label label-primary pull-right">68%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                            </div>
                        </a>
                    </li>
                </ul>
                <!-- /.control-sidebar-menu -->

            </div>
            <!-- /.tab-pane -->
            <!-- Stats tab content -->
            <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
            <!-- /.tab-pane -->
            <!-- Settings tab content -->
            <div class="tab-pane" id="control-sidebar-settings-tab">
                <form method="post">
                    <h3 class="control-sidebar-heading">General Settings</h3>

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Report panel usage
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Some information about this general settings option
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Allow mail redirect
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Other sets of options are available
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Expose author name in posts
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Allow the user to show his name in blog posts
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <h3 class="control-sidebar-heading">Chat Settings</h3>

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Show me as online
                            <input type="checkbox" class="pull-right" checked>
                        </label>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Turn off notifications
                            <input type="checkbox" class="pull-right">
                        </label>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Delete chat history
                            <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
                        </label>
                    </div>
                    <!-- /.form-group -->
                </form>
            </div>
            <!-- /.tab-pane -->
        </div>
    </aside>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
</body>
</html>
