<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ include file="/view/pub/base.jsp" %>
    <%@ include file="/view/pub/dataTables.jsp" %>
    <title>运维系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="static/dist/js/pages/dashboard.js"></script>
</head>
<script language="javascript" src="/rgraph/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/echarts/build/dist/echarts-all.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/echarts/build/dist/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/echarts/theme/dark.js"></script>
<script src="/static/jquery/dist/jquery.min.js"></script>
<script src="/static/charts/Chart.js"></script>
<script src="/static/js/workbench/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript" class="init">
    //加载功能菜单
    $.ajax({
        type:"GET",
        url: "getSessionInfo",
        data:"&uid="+$("#uid").val()
    }).then(function(data){
        $('#funcMenu').append(data.funcMenu);
        $('#ITDm').parents('.treeview').addClass("active");$('#ITDm').addClass("active");
        $('#xs-name').html(data.name);$('#user-name').html(data.name);
        $('#user_info').html(data.role_name+"<small>"+data.org_name+"</small>"+"<small>"+data.phone+"</small>");
        //xs-name,user-name
    });
</script>
<body class="hold-transition skin-blue sidebar-mini">
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

    <!-- Left side column. contains the logo and sidebar -->
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" id="PanoramicInformation">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                ITD
                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">站口道</li>
            </ol>
        </section>

        <!-- Main content -->
        <%--<section class="content">--%>
            <%--<div class="row">--%>
                <%--<!-- Left col -->--%>
                <%--<section class="col-lg-12 connectedSortable">--%>
                    <%--网络设备故障检测--%>
                    <%--<div class="box box-warning box-solid">--%>
                    <%--<div class="box-header with-border">--%>
                    <%--<h3 class="box-title">收费站</h3>--%>
                    <%--&lt;%&ndash;<button  class="btn btn-info" id="syniptoid">同步设备</button>&ndash;%&gt;--%>
                    <%--<div class="box-tools pull-right">--%>
                    <%--<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>--%>
                    <%--</button>--%>
                    <%--</div>--%>

                    <%--</div>--%>
                    <%--<!-- /.box-header -->--%>
                    <%--<div class="box-body">--%>
                    <%--<div class="well sidebar-nav" id="tree" style="width:100%;height: 500px;"></div>--%>
                    <%--<div class="row" id="orgList">--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<!-- /.box-body -->--%>
                    <%--</div>--%>
                <%--</section>--%>

                <%--<section class="col-lg-12 connectedSortable">--%>
                    <%--<div class="col-md-12">--%>
                    <%--<div class="box box-warning">--%>
                    <%--<div class="box-header with-border">--%>
                    <%--<div class="box-tools pull-right">--%>
                    <%--<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>--%>
                    <%--</button>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="box-body">--%>
                    <%--栏杆机--%>
                    <%--<button type="button" class="btn btn-default btn-sm checkbox-toggle" id=""><i class="fa fa-long-arrow-right"></i>--%>
                    <%--</button>--%>
                    <%--雨棚灯--%>
                    <%--<button type="button" class="btn btn-warning btn-sm checkbox-toggle"><i class="fa fa-arrow-down"></i>--%>
                    <%--</button>--%>
                    <%--通行灯--%>
                    <%--<button type="button" class="btn btn-success btn-sm checkbox-toggle"><i class="fa fa-arrow-circle-right"></i>--%>
                    <%--</button>--%>
                    <%--溫控--%>
                    <%--<button type="button" class="btn btn-danger btn-sm checkbox-toggle"><i class="fa fa-fw fa-certificate"></i>--%>
                    <%--</button>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>


                    <%--<div class="row">--%>
                    <%--<div class="col-lg-3 col-xs-6" id="railing">--%>
                    <%--<!-- small box -->--%>
                    <%--<div class="small-box bg-aqua">--%>
                    <%--<div class="inner">--%>
                    <%--<h3>栏杆机</h3>--%>
                    <%--<p>Railing Machine</p>--%>
                    <%--</div>--%>
                    <%--<div class="icon">--%>
                    <%--<i class="fa fa-long-arrow-right"></i>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<!-- ./col -->--%>
                    <%--<div class="col-lg-3 col-xs-6">--%>
                    <%--<!-- small box -->--%>
                    <%--<div class="small-box bg-yellow" id="canopy">--%>
                    <%--<div class="inner">--%>
                    <%--<h3>雨棚灯<sup style="font-size: 20px"></sup></h3>--%>

                    <%--<p>Canopy Light</p>--%>
                    <%--</div>--%>
                    <%--<div class="icon">--%>
                    <%--<i class="fa fa-arrow-down"></i>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<!-- ./col -->--%>
                    <%--<div class="col-lg-3 col-xs-6">--%>
                    <%--<div class="small-box bg-green" id="passage">--%>
                    <%--<div class="inner">--%>
                    <%--<h3>通行灯</h3>--%>

                    <%--<p>Passage Light</p>--%>
                    <%--</div>--%>
                    <%--<div class="icon">--%>
                    <%--<i class="fa fa-arrow-circle-right"></i>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<!-- ./col -->--%>
                    <%--<div class="col-lg-3 col-xs-6">--%>
                    <%--<!-- small box -->--%>
                    <%--<div class="small-box bg-red" id="temperature">--%>
                    <%--<div class="inner">--%>
                    <%--<h3>溫控</h3>--%>

                    <%--<p>Temperature Control</p>--%>
                    <%--</div>--%>
                    <%--<div class="icon">--%>
                    <%--<i class="fa fa-fw fa-certificate"></i>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row">--%>
                        <%--<div class="col-md-12">--%>
                        <%--<div class="box box-warning">--%>
                        <%--<div class="box-header with-border">--%>
                        <%--<div class="box-tools pull-right">--%>
                        <%--<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>--%>
                        <%--</button>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="box-body">--%>

                        <%--<div class="col-md-2 col-sm-6 col-xs-6">--%>
                        <%--环境--%>
                        <%--<div class="small-box">--%>
                        <%--<span class="info-box-icon bg-aqua"><i class="glyphicon glyphicon-leaf"></i></span>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3 col-sm-6 col-xs-6">--%>
                        <%--设置--%>
                        <%--<div class="small-box">--%>
                        <%--<span class="info-box-icon bg-red"><i class="ion ion-ios-gear-outline"></i></span>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3 col-sm-6 col-xs-6">--%>
                        <%--日志--%>
                        <%--<div class="small-box">--%>
                        <%--<span class="info-box-icon bg-green"><i class="fa fa-fw fa-file-text-o"></i></span>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-2 col-sm-6 col-xs-6">--%>
                        <%--维护--%>
                        <%--<div class="small-box">--%>
                        <%--<span class="info-box-icon bg-yellow"><i class="glyphicon glyphicon-wrench"></i></span>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-2 col-sm-6 col-xs-6">--%>
                        <%--其他--%>
                        <%--<div class="small-box">--%>
                        <%--<span class="info-box-icon bg-gray"><i class="fa fa-google-plus"></i></span>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>

                </section>




                <section class="col-lg-5 connectedSortable">
                    <%--故障设备统计分析--%>
                    <div class="box box-warning box-solid">
                        <div class="box-header with-border">
                            <h3 class="box-title">故障设备统计分析</h3>
                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                        </div>
                        <div class="box-body" id = "equipmentthrable" style="height: 300px">
                        </div>
                    </div>

                    <%--售后服务统计分析--%>
                    <div class="box box-warning box-solid">
                        <div class="box-header with-border">
                            <h3 class="box-title">售后服务统计分析</h3>
                            <div class="box-tools pull-right">
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button>
                            </div>
                        </div>
                        <div class="box-body" id="repair" style="height: 300px">
                        </div>
                    </div>
                </section>
                <!-- /.Left col -->
                <!-- right col (We are only adding the ID to make the widgets sortable)-->
                <section class="col-lg-7 connectedSortable">
                    <%--设备健康状态评估分析--%>
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title">设备健康状态评估分析</h3>
                            <div class="box-tools pull-left">
                            </div>
                            <div class="box-tools pull-right">
                                <span data-toggle="tooltip" class="badge bg-green">
                                    <select class="form-control" id="equpmentType">
                                        <option value="0">栏杆机</option>
                                        <option value="1">摄像机</option>
                                        <option value="2">称重器</option>
                                        <option value="3">顶棚灯</option>
                                        <option value="4">设备。。。</option>
                                    </select>
                                </span>
                                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                </button></div>
                        </div>
                        <div class="box-body" id="equipmentstatus">
                            <div id = "equipmentstatus1" style="width: 100%; height: 400px;"></div>
                            <%--<div id = "equipmentstatus2" style="width: 40%; height: 400px;float: right"></div>--%>
                        </div>
                        <div class="box-footer" id="alldatatolane" style="height: 400px;">
                        </div>
                    </div>
                </section>
                <!-- right col -->
            </div>
            <!-- /.row (main row) -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <div class="content-wrapper" id="toll" style="display: none">
        <%--<div class="box-header bg-teal disabled color-palette" id="header">--%>
        <%--</div>--%>
        <section class="content-header">
            <h1>
                收费站设备总数
                <small>Toll Equipment Num</small>
            </h1>
        </section>
        <div class="box-body bg-gray disabled color-palette" id="AllNumContent">
        </div>
        <div class="box-footer">
            <button  class="btn btn-info pull-right" id="back" style="display: none">返回</button>
        </div>
    </div>


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


<%--ip修改--%>
<div id="alertIPselect" class="modal fade bs-example-modal-lg"  tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">IP设置</h4>
            </div>
            <div class="modal-body">
                <div class="box box-danger">
                    <div class="box-body">
                        <div class="col-xs-12">
                            <div class="table-responsive">
                                <table class="table" id="IPtable">
                                    <thead>
                                    <th>设备名称</th>
                                    <th>设备型号</th>
                                    <th>安装地址</th>
                                    <th>IP设置</th>
                                    </thead>
                                    <tbody id="equipmentipsyn">
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="box box-footer">
                        <button id="updateIP"  class="btn btn-success pull-right" >提交</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- ./wrapper -->
</body>
<script type="text/javascript">
    //设备与车道节点同步,主要通过调用mudbus接口获取设备ip，com信息，与设备id关联
    $("#syniptoid").on("click",function () {
    });

    $("#equipmentAllNum").on("click",function () {
        AllNumContent();
        $("#toll").show();
        $("#back").show();
        $("#PanoramicInformation").hide();
    });

    $("#back").on("click",function () {
        $("#back").hide();
        $("#toll").hide();
        $("#PanoramicInformation").show();
    });
    //收费站设备统计
    function AllNumContent(){
        $.ajax({
            url:'/tollquery',
            type:'post',
            data:{
            }
        }).then(function (data) {
            console.log(data);
            $("#AllNumContent").empty();
            $.each(data,function (index,item) {
                var str = '<div class="col-md-3">'
                    +'<div class="box box-widget widget-user-2">'
                    +'<div class="widget-user-header bg-yellow">'
                    +'<div class="widget-user-image">'
                    +'</div>'
                    +'<h3 class="widget-user-username" id="orgName"+index>'+item.org_name +'</h3>'
                    +'<input type="hidden" value="'+item.org_code+'">'
                    +'<h5 class="widget-user-desc">'+'设备总数:'+item.use_num+'</h5>'
                    +'</div>'
                    +'<div class="box-footer no-padding">'
                    +'<ul class="nav nav-stacked" id="laneList'+index+'">'
//                    +'<li>'+'<a href="#"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">'
//                    +item.equipment_address+'</font></font><span class="pull-right badge bg-aqua"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">'
//                    +item.use_num+'</font></font></span></a></li>'
                    +'</ul>'
                    +'</div>'
                    +'</div>'
                    +'</div>'
                $("#AllNumContent").append(str);
                $.ajax({
                    url:'/lanequery',
                    type:'post',
                    data:{
                        org_code:item.org_code
                    }
                }).then(function (data) {
                    console.log(data);
                    $.each(data,function (ind,ite) {
                        var li = '<li>'+'<a href="#">' +
                            '<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">'
                            +ite.equipment_address+'</font></font>' +
                            '<span class="pull-right badge bg-aqua">' +
                            '<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">'
                            +ite.use_num+'</font></font></span></a></li>'
                        $("#laneList"+index).append(li);
                    });
                });
            });
        });
    }

    /*车道设备树状图*/
    //初始化echarts实例
    //        var myChart = echarts.init(document.getElementById('tree'),'dark');
    //        option = {
    //            backgroundColor: "#404A59",
    //            color: ['#ffd285','#ec4863', '#ff733f','#3AA6FF'],
    //            title : {
    //                text: '收费站',
    //                subtext: '设备总数:52',
    //                textStyle: {
    //                    color: '#ffd285'
    //                }
    //            },
    //    //        tooltip : {
    //    //            trigger: 'item',
    //    //        },
    //            calculable : false,
    //            series : [
    //                {
    //                    name:'树图',
    //                    type:'tree',
    //                    orient: 'vertical',  // vertical horizontal
    //                    rootLocation: {x: 'center',y: 50}, // 根节点位置  {x: 'center',y: 10}
    //                    nodePadding:100,
    //                    symbol: 'circle',//'circle' | 'rectangle' | 'triangle' | 'diamond' |'emptyCircle' | 'emptyRectangle' | 'emptyTriangle' | 'emptyDiamond'另外，还支持五种更特别的标志图形'heart'（心形）、'droplet'（水滴）、'pin'（标注）、'arrow'（箭头）和'star'（五角星），
    //                    symbolSize: 75,
    //                    itemStyle: {
    //                        normal: {
    //                            color:'#00c0ef',
    //                            label: {
    //                                show: true,
    //                                position: 'inside',
    //                                textStyle: {
    //                                    color: 'yellow',
    //    //                                color: function (params){
    //    //                                    var colorList = ['#ff4844','#9ac3e5','#66ac52','#ffc032','#549bd3','#f47e39'];
    //    //                                    return colorList[params.dataIndex];
    //    //                                },
    //                                    fontSize: 15,
    //                                    fontWeight:'bolder'
    //                                }
    //                            },
    //                            lineStyle: {
    //                                normal: {
    //                                    color: 'source',
    //                                    curveness: 1
    //                                }
    //                            }
    //                        },
    //                        emphasis: {
    //                            label: {
    //                                show: false
    //                            }
    //                        }
    //                    },
    //                    data: [
    //                        {
    //                            name: '收费站',
    //                            value: '设备总数',
    //                            symbolSize: [90, 70],
    //                            itemStyle: {
    //                                normal: {
    //                                    label: {
    //                                        show: true
    //                                    }
    //                                }
    //                            },
    //                            children: [
    //                                {
    //                                    name: '入口1车道',
    //                                    itemStyle: {
    //                                        normal: {
    //                                            label: {
    //                                                show: true
    //                                            }
    //                                        }
    //                                    },
    //                                    symbolSize: [60, 60],
    //                                    value:60,
    //                                },
    //                                {
    //                                    name: '入口2车道',
    //                                    symbolSize: [60, 60],
    //                                    itemStyle: {
    //                                        normal: {
    //                                            label: {
    //                                                show: true
    //                                            }
    //
    //                                        }
    //                                    },
    //                                    value: 50
    //                                },
    //                                {
    //                                    name: '出口1车道',
    //                                    symbolSize: [60, 60],
    //                                    itemStyle: {
    //                                        normal: {
    //                                            label: {
    //                                                show: true
    //                                            }
    //
    //                                        }
    //                                    },
    //                                    value: 2
    //                                },
    //                                {
    //                                    name: '出口2车道',
    //                                    symbolSize: [60, 60],
    //                                    itemStyle: {
    //                                        normal: {
    //                                            label: {
    //                                                show: true
    //                                            }
    //                                        }
    //                                    },
    //                                    value: 2
    //                                }
    //                            ]
    //                        }
    //                    ]
    //                }
    //            ]
    //        };
    //
    //        myChart.setOption(option);
    //        myChart.on("click", function (param){
    //            var name = param.name;
    //            console.log("param");
    //            console.log(param);
    //            if(param.name == 'IP设置'){
    //                //设置隐藏值，用于判断进哪个车道
    //                var hiddename = param.data.hiddenval;
    //                console.log("hiddename");
    //                console.log(hiddename);
    //                netEquipmentQuery(hiddename);
    //                $('#alertIPselect').modal({backdrop: 'static', keyboard: false});
    //            }
    //            else if (param.name == '进入车道'){
    //                console.log("进入车道");
    //                location.href="itds?flag="+true;
    //            }
    //            else
    //                clickFun2(param,name);
    //        });
    //
    //        //节点添加内容设置
    //        var mockData1 = {"name":"IP设置","symbol":"rectangle","cusField":"product","itemStyle":{"normal":{"label":{"show":true}}}};
    //        var mockData2 = {"name":"进入车道","symbol":"rectangle","cusField":"product","itemStyle":{"normal":{"label":{"show":true}}}};
    //        //给车道添加节点
    //        function clickFun2(param,name) {
    //            if(!(param.data.children && param.data.children.length > 0)) {
    //                console.log('open');
    //                if(param.data.children_bak) {
    //                    param.data.children = param.data.children_bak;
    //                }
    //                else {
    //                    param.data.children = [deepCopy(
    //                        {"name":"IP设置","hiddenval":name,"symbol":"rectangle","cusField":"product","itemStyle":{"normal":{"label":{"show":true}}}}
    //                    ),deepCopy(
    //                        {"name":"进入车道","hiddenval":name,"symbol":"rectangle","cusField":"product","itemStyle":{"normal":{"label":{"show":true}}}}
    //                    )]; //加载数据，此处用测试数据
    //                }
    //            } else {
    //                console.log('close');
    //                param.data.children_bak = param.data.children;
    //                param.data.children = []; //root节点会在refresh时读children的length
    //            }
    //            console.log(param);
    //            myChart.refresh(); //一定要refresh，否则不起作用
    //        }
    //
    //
    //    function deepCopy(p, c) {
    //        var c = c || {};
    //        for (var i in p) {
    //            if (typeof p[i] === 'object') {
    //                c[i] = (p[i].constructor === Array) ? [] : {};
    //                deepCopy(p[i], c[i]);
    //            } else {
    //                c[i] = p[i];
    //            }
    //        }
    //        return c;
    //    }
    //
    //        $.ajax({
    //            url : "/laneNodeQuery",
    //            type : "post",
    //            data : {
    //                org_name : $("#org_name").val(),
    //                org_code :$("#org_code").val()//'7100'
    //            },
    //            dataType : "json",
    //            success : function(result) {
    //                if (result) {
    //                    console.log(result);
    //                    console.log(result.name);
    //                    option.series[0].data.push(result);
    //                    myChart.setOption(option);
    //                    myChart.on("click", function (param){
    //                        console.log(param.name);
    //                        queryLaneEquipment(param.name);
    //                    });
    //                }
    //            }});
    //
    //    //网络查询,给网络设备设置ip
    //    function netEquipmentQuery(hiddename){
    //        $.ajax({
    //            url:'/netEquipmentQuery',
    //            type:'post',
    //            data:{
    //                address_orgcode:'7100',
    //                equipment_address:hiddename
    //            }
    //        }).then(function (data) {
    //            $("#equipmentipsyn").empty();
    //            $.each(data,function (index,item) {
    //                var address = item.equipment_address;
    //                var model = item.equipment_model;
    //                var name = item.equipment_name;
    //                var ip = item.equipment_ip;
    //                var idall = item.id;
    //                var str = "<tr>"
    //                    +"<td>"+name+"</td>"
    //                    +"<td>"+model+"</td>"
    //                    +"<td>"+address+"</td>"
    //                    +"<td><input id='"+idall+"' name='idall' type='email' class='form-control' value='"+ip+"'>"+"</td>"
    ////                    +"<td><button class='btn btn-success pull-right' >"+"提交"+"</button></td>"
    //                    +"</tr>"
    //                $("#equipmentipsyn").append(str);
    //            });
    //            $("#updateIP").on("click",function () {
    //                updateIP();
    //            });
    //        });
    //    }
    //
    //    //
    //    function updateIP(){
    //        //获取每个input的值
    //        var ipall = "";
    //        var idall = "";
    //        $("input[name='idall']").each(function() {
    //            ipall += $(this).val()+",";
    //            idall += $(this).attr("id")+",";
    //        });
    //        $.ajax({
    //            url:"/updateIP",
    //            type:"post",
    //            data:{
    //                equipment_ip:ipall,
    //                id_model:idall
    //            },
    //            success:function (data) {
    //                console.log(data);
    //                alert("设置成功!");
    //            }
    //        });
    //    }

    //IP修改提交
    //    function changeip(idall,ipcontent){
    //故障设备分析图
    option1 = {
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['故障设备']
        },
        toolbox: {
            show : false,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                //'1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'
                data : []
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'故障设备',
                type:'line',
                stack: '总量',
                //10, 21, 13, 23, 16, 18, 14,13, 23, 16, 18, 14
                data:[]
            },
        ]
    };
    var equipmentthrable = echarts.init(document.getElementById('equipmentthrable'),'dark');
    $.ajax({
        type : "post",
        url : "/errorequipment",
        async : true,
        data : {},
        dataType : "json",
        success : function(result) {
            console.log("故障设备返回数据");
            console.log(result);
            var names=[];    //类别数组（实际用来盛放X轴坐标值）
            var nums=[];    //值数组（实际用来盛放Y坐标值）
            if (result) {
                for(var i=0;i<result.length;i++){
                    var create_time = result[i].create_time.split("-")[1]+"月";
                    names.push(create_time);
                }
                for(var i=0;i<result.length;i++){
                    nums.push(result[i].count);
                }
                equipmentthrable.hideLoading();    //隐藏加载动画
                equipmentthrable.setOption({        //加载数据图表
                    xAxis: {
                        data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
                    },
                    series: [{
                        name:'故障设备',
                        data: [10, 21, 13, 23, 16, 18, 14,13, 23, 16, 18, 14]
                    }]
                });
            }
            equipmentthrable.setOption(option1);
        },
        error : function(errorMsg) {
            alert("图表请求数据失败!");
        }
    });
    //故障设备分析图




    //售后服务统计分析
    var equipmentrepair = echarts.init(document.getElementById('repair'),'dark');
    option3 = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {
                type: 'shadow'
            }
        },
        legend: {
            data:['维修次数']
        },
        toolbox: {
            show : false,
            orient : 'vertical',
            y : 'center',
            feature : {
                mark : {show: true},
                magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                //data : ['栏杆机','摄像头','设备3','设备4','设备5','设备6']

                data : []
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'维修次数',
                type:'bar',
                data:[]
            },
        ]
    };
    // var maintenance = echarts.init(document.getElementById('repair'));
    $.ajax({
        type : "post",
        url : "/customerStatitics",
        async : true,
        data : {
            //        dparent_id:"7100",
//            equipment_name:"" 暂定，目前还未确定健康评估规则
        },
        dataType : "json",
        success : function(result) {
            // console.log("车道节点返回数据处理");
            // console.log(result);
            var names=[];    //类别数组（实际用来盛放X轴坐标值）
            var nums=[];    //值数组（实际用来盛放Y坐标值）

            if (result) {
                for(var i=0;i<result.length;i++){
                    names.push(result[i].equipment_name);
                }//横轴
                for(var i=0;i<result.length;i++){
                    nums.push(result[i].count);
                }//数据

                equipmentrepair.hideLoading();    //隐藏加载动画
                equipmentrepair.setOption({       //加载数据图表
                    xAxis: {
                        data: names
                    },
                    series: [{
                        name:"栏杆机",
                        data: nums
                    }]
                });
            }
            equipmentrepair.setOption(option3);
        },
        error : function(errorMsg) {
            alert("图表请求数据失败!");
        }
    });
    equipmentrepair.setOption(option3);


    //设备健康状态评估分析
    option4 = {
        title : {
            text: '设备健康状态评估分析',
            subtext: '',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient : 'vertical',
            x : 'left',
            data:['健康','良好','一般','差']
        },
        calculable : true,
        series : [
            {
                name:'设备情况',
                type:'pie',
                radius : '55%',
                center: ['50%', 225],
                data:[
                    {value:335, name:'健康'},
                    {value:260, name:'良好'},
                    {value:179, name:'一般'},
                    {value:38, name:'差'}
                ]
            }
        ]
    };




    //柱状图，健康值
    changeType("栏杆机");
    $("#equpmentType").on("change",function () {
        var equipmentname = $("#equpmentType option:selected").text();
        changeType(equipmentname);
    });
    function changeType(equipmentname) {
        option5 = {
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'shadow'
                }
            },
            legend: {
                data: [equipmentname+'健康值']
            },
            toolbox: {
                show: false,
                orient: 'vertical',
                y: 'center',
                feature: {
                    mark: {show: true},
                    magicType: {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore: {show: true},
                    saveAsImage: {show: true}
                }
            },
            calculable: true,
            xAxis: [
                {
                    //'入口1车道','入口2车道','入口3车道','出口1车道','出口2车道','出口3车道','出口4车道'
                    data: []
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    splitArea: {show: true}
                }
            ],
            grid: {
                x2: 40
            },
            series: [
                {
                    name: equipmentname+'健康值',
                    type: 'bar',
                    itemStyle:{
                        normal:{
                            color:'#4ad2ff'
                        }
                    },
                    //49, 43, 39, 50, 49, 51, 47
                    data: []
                }
            ]
        };

        var myChart2 = echarts.init(document.getElementById('equipmentstatus1'));
        $.ajax({
            type: "post",
            url: "/queryLane",
            async: true,
            data: {
                dparent_id: "7100",
//            equipment_name:"" 暂定，目前还未确定健康评估规则
            },
            dataType: "json",
            success: function (result) {
                console.log("车道节点返回数据处理");
                console.log(result);
                var names = [];    //类别数组（实际用来盛放X轴坐标值）
                var nums = [];    //值数组（实际用来盛放Y坐标值）
                if (result) {
                    for (var i = 0; i < result.length; i++) {
                        names.push(result[i].org_name);
                    }
                    for (var i = 0; i < result.length; i++) {
                        nums.push(result[i].dparent_id);
                    }
                    myChart2.hideLoading();    //隐藏加载动画
                    myChart2.setOption({        //加载数据图表
                        xAxis: {
                            data: names
                        },
                        series: [{
                            name: equipmentname+'健康值',
                            type: 'category',
                            data: [79, 34, 98, 67, 89, 88, 99, 88]
                        }]
                    });
                }
                myChart2.setOption(option5);
            },
            error: function (errorMsg) {
                alert("图表请求数据失败!");
            }
        });
    }

    /*车道设备总健康值*/
    //柱状图，健康值
    option6 = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {
                type: 'shadow'
            }
        },
        legend: {
            data:['车道总健康值']
        },
        toolbox: {
            show : false,
            orient : 'vertical',
            y : 'center',
            feature : {
                mark : {show: true},
                magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                //'入口1车道','入口2车道','入口3车道','出口1车道','出口2车道','出口3车道','出口4车道'
                data : []
            }
        ],
        yAxis : [
            {
                type : 'value',
                splitArea : {show : true}
            }
        ],
        grid: {
            x2:40
        },
        series : [
            {
                name:'车道总健康值',
                type:'bar',
                //49, 43, 39, 50, 49, 51, 47
                data:[]
            }
        ]
    };
    var lanechart = echarts.init(document.getElementById('alldatatolane'));
    $.ajax({
        type : "post",
        url : "/queryLane",
        async : true,
        data : {
            dparent_id:"7100",
//            equipment_name:"" 暂定，目前还未确定健康评估规则
        },
        dataType : "json",
        success : function(result) {
            console.log("车道节点返回数据处理");
            console.log(result);
            var names=[];    //类别数组（实际用来盛放X轴坐标值）
            var nums=[];    //值数组（实际用来盛放Y坐标值）
            if (result) {
                for(var i=0;i<result.length;i++){
                    names.push(result[i].org_name);
                }//横轴
                for(var i=0;i<result.length;i++){
                    nums.push(result[i].dparent_id);
                }//数据
                lanechart.hideLoading();    //隐藏加载动画
                lanechart.setOption({       //加载数据图表
                    xAxis: {
                        data: names
                    },
                    series: [{
                        name:'栏杆机健康值',
                        data: [98,78,90,89,98,89,80,79]
                    }]
                });
            }
            lanechart.setOption(option6);
        },
        error : function(errorMsg) {
            alert("图表请求数据失败!");
        }
    });


</script>
</html>
