<%--
  Created by IntelliJ IDEA.
  User: liuxiao
  Date: 2018/6/14
  Time: 下午14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ include file="/view/pub/base.jsp" %>
    <%@ include file="/view/pub/dataTables.jsp" %>
    <title>运维系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
</head>
<script type="text/javascript" language="javascript" class="init">
    $(document).ready(function () {
        $('.form_date').datetimepicker({
            language: 'zh-CN',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,//1表示月，2表示天
            minView: 3,
            forceParse: 0
        });
        $('.form_datetime').datetimepicker({
            language: 'zh-CN',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0,
            showMeridian: 1,
            pickerPosition: "bottom-left"
        });
        $('.form_time').datetimepicker({
            format: "hh:ii:ss", //format: "HH:ii P",
            language: 'zh-CN',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 1,
            minView: 0,
            maxView: 1,
            forceParse: 0
        });

        //加载功能菜单
        $.ajax({
            type: "GET",
            url: "getSessionInfo",
            data: "&uid=" + $("#uid").val()
        }).then(function (data) {
            $('#funcMenu').append(data.funcMenu);
            $('#itd').parents('.treeview').addClass("active");
            $('#itd').addClass("active");
            //$('#xs-name').html(data.name);
            //$('#user-name').html(data.name);
            //$('#user_info').html(data.role_name + "<small>" + data.org_name + "</small>" + "<small>" + data.phone + "</small>");
            //xs-name,user-name
        });
    });

</script>
<body class="hold-transition skin-blue sidebar-mini autocomplete-div">
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
            <h1 id="title">
                站道口
                <small>Notice</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>ITD</a></li>
                <li class="active">站道口</li>
            </ol>
        </section>
        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-yellow">
                            <div class="widget-user-image">
                                <%--<img class="img-circle" src="../dist/img/user7-128x128.jpg" alt="User Avatar">--%>
                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">栏杆机</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <dl><br>
                                <dt align="center">栏杆控制<dt/><br>
                                <dd align="center" style="color:green">抬杆&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;()</dd>
                                <dd align="center">落杆&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;()</dd>
                                <br><br><dt align="center">栏杆状态<dt/><br>
                                <dd align="center" style="color:green">抬杆状态</dd>
                                <dd align="center">落杆状态</dd>
                            </dl>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-green">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">雨棚灯</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <dl>
                                <dt align="center"><i class="fa fa-fw fa-arrow-down fa-5x" ></i></dt>
                                <dt><p align="center">DO:K &nbsp;&nbsp;()&nbsp;&nbsp;电压&nbsp;&nbsp;&nbsp;&nbsp;V&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电流&nbsp;&nbsp;&nbsp;&nbsp;A</p></dt>
                                <br><br><dt align="center"><i class="fa fa-fw fa-close fa-5x"></i></dt>
                                <dt><p align="center">DO:K &nbsp;&nbsp;()&nbsp;&nbsp;电压&nbsp;&nbsp;&nbsp;&nbsp;V&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电流&nbsp;&nbsp;&nbsp;&nbsp;A</p></dt>
                            </dl>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-aqua">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">通行灯</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <dl>
                                <dt align="center"><i class="fa fa-fw fa-arrow-down fa-5x" style="color: #00e765"></i></dt>
                                <dt><p align="center">DO:K &nbsp;&nbsp;()</p></dt>
                                <br><br><dt align="center"><i class="fa fa-fw fa-close fa-5x" style="color: #b92c28"></i></dt>
                                <dt><p align="center">DO:K &nbsp;&nbsp;()</p></dt>
                            </dl>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-red">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">温控</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <dl>
                                <h4>散热</h4><br>
                                <div class="form-group">
                                    <label>
                                        <input type="radio" name="r1" class="minimal" checked>
                                        开启
                                    </label>
                                    <label>
                                        <input type="radio" name="r1" class="minimal">
                                        关闭
                                    </label>
                                    <label>
                                        <input type="radio" name="r1" class="minimal">
                                        自动
                                    </label>
                                </div><br><br>
                                <h4>加热</h4><br>
                                <div class="form-group">
                                    <label>
                                        <input type="radio" name="r2" class="minimal" checked>
                                        开启
                                    </label>
                                    <label>
                                        <input type="radio" name="r2" class="minimal">
                                        关闭
                                    </label>
                                    <label>
                                        <input type="radio" name="r2" class="minimal">
                                        自动
                                    </label>
                                </div>
                            </dl>
                        </div>
                    </div>
                </div>
                <!-- /.widget-user -->
            </div>
            <div class="row">
                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-yellow">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">设备工作模式</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <div class="form-group" align="center">
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="optionsRadios"  value="option1" checked="">
                                        MTC车道
                                    </label>
                                </div>
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="optionsRadios"  value="option2">
                                        ETC车道
                                    </label>
                                </div>
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="optionsRadios"  value="option3" >
                                        混合车道
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-green">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">DI输入</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">MTC车道
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di1" value="option1" checked="">
                                    0路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di2" value="option2">
                                    1路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di3" value="option3" >
                                    2路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di4" value="option1">
                                    3路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di5" value="option2">
                                    4路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di6" value="option3" >
                                    5路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di7" value="option2">
                                    6路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios1" id="di8" value="option3" >
                                    7路DI输入&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="box box-widget widget-user-2">
                        <div class="widget-user-header bg-aqua">
                            <div class="widget-user-image">

                            </div>
                            <h3 class="widget-user-username">DO输出</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">ETC车道
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option1" checked="">
                                    正向雨棚红灯&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option2">
                                    正向雨棚绿灯&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option3" >
                                    通行信号红灯&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option1">
                                    通行信号绿灯&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option2">
                                    自动栏杆抬起&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option3" >
                                    自动栏杆落下&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios2"  value="option2">
                                    黄闪声光报警&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(0/1)
                                </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-red">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">温控设置</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            35°C
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3" id="sanre" value="option1" checked="">
                                    散热
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3" id="jiare" value="option1" checked="">
                                    加热
                                </label>
                            </div>


                            <table class="table table-bordered">
                                <tr>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">常&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开</button>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">自&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;动</button>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">温度设置</button>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-info">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>



                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-yellow">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">网络</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">ETC车道
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option1" checked="">
                                    网&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;关&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option2">
                                    摄像机1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option3" >
                                    摄像机2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option1">
                                    摄像机3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option2">
                                    字符叠加器&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option3" >
                                    计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios3"  value="option2">
                                    费&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;显&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;192.168.255.255
                                </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-green">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">时间</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <dl align="center">
                                <h3 id="timeStr"></h3>
                                <h4 id="dateStr"></h4><br>
                                <h4>模式</h4>
                                <div class="form-group">
                                    <label>
                                        <input type="radio" name="modal" class="minimal" checked>
                                        24小时
                                    </label>
                                    <label>
                                        <input type="radio" name="modal" class="minimal">
                                        12小时
                                    </label>
                                </div>
                                <%--<button class="btn btn-default" >设置1</button>--%>
                                <%--<button class="btn btn-default" >设置2</button>--%>
                            </dl>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="box box-widget  widget-user-2">
                        <div class="widget-user-header bg-aqua">
                            <h3 class="widget-user-username">人员日志</h3>
                            <h5 class="widget-user-desc">Note Managerment</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="tab-content">
                                <div class="box-body">
                                    <div class="row">
                                        <div class="col-sm-4 border-right">
                                            <div class="description-block">
                                                <h5>登录时间</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-4 border-right">
                                            <div class="description-block">
                                                <h5>工号</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="description-block">
                                                <h5>退出时间</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="box box-widget  widget-user-2">
                        <div class="widget-user-header bg-red">
                            <h3 class="widget-user-username">温湿日志</h3>
                            <h5 class="widget-user-desc">Note Managerment</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="box-body">
                                <div class="row">
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5>日期</h5>
                                        </div>
                                    </div>
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5>温度</h5>
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="description-block">
                                            <h5>湿度</h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="box box-widget  widget-user-2">
                        <div class="widget-user-header bg-yellow">
                            <h3 class="widget-user-username">故障日志</h3>
                            <h5 class="widget-user-desc">Note Managerment</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="tab-content">
                                <div class="box-body">
                                    <div class="row">
                                        <div class="col-sm-4 border-right">
                                            <div class="description-block">
                                                <h5>故障时间</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-4 border-right">
                                            <div class="description-block">
                                                <h5>故障名称</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="description-block">
                                                <h5>恢复时间</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="box box-widget  widget-user-2">
                        <div class="widget-user-header bg-green">
                            <h3 class="widget-user-username">维护日志</h3>
                            <h5 class="widget-user-desc">Note Managerment</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="tab-content">
                                <div class="box-body">
                                    <div class="row">
                                        <div class="col-sm-3 border-right">
                                            <div class="description-block">
                                                <h5>日期</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-3 border-right">
                                            <div class="description-block">
                                                <h5>工号</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="description-block">
                                                <h5>设备名称</h5>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="description-block">
                                                <h5>状态</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="box box-widget  widget-user-2">
                        <div class="widget-user-header bg-aqua">
                            <h3 class="widget-user-username">车辆日志</h3>
                            <h5 class="widget-user-desc">Note Managerment</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="box-body">
                                <div class="row">
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5>日期</h5>
                                        </div>
                                    </div>
                                    <div class="col-sm-4 border-right">
                                        <div class="description-block">
                                            <h5>24h/辆</h5>
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="description-block">
                                            <h5>12h/辆</h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <!-- Widget: user widget style 1 -->
                    <div class="box box-widget widget-user-2">
                        <!-- Add the bg color to the header using any of the bg-* classes -->
                        <div class="widget-user-header bg-red">
                            <div class="widget-user-image">
                                <%--<img class="img-circle" src="../dist/img/user7-128x128.jpg" alt="User Avatar">--%>
                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">环境</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" style="height: 350px">
                            <div class="box-body">
                                <dl class="dl-horizontal">
                                    <dt>环境温度</dt>
                                    <dd>°C</dd><br>
                                    <dt>相对湿度</dt>
                                    <dd>%</dd><br>
                                    <dt>二氧化碳</dt>
                                    <dd>ppm</dd><br>
                                    <dt>PM2.5</dt>
                                    <dd>ug/m3</dd><br>
                                    <dt>PM 10</dt>
                                    <dd>ug/m3</dd><br>
                                    <dt>噪音</dt>
                                    <dd>dB</dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </section>
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



<!-- /.modal -->
<div id="outerdiv" style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;">
    <div id="innerdiv" style="position:absolute;">
        <img id="bigimg" style="border:5px solid #fff;" src="" />
    </div>
</div>

<input type="hidden" id="id" value="${id}">
<!-- Modal -->
<input type="hidden" id="flag" value="${flag}">
</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
    /*$('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
     checkboxClass: 'icheckbox_minimal-blue',
     radioClass   : 'iradio_minimal-blue'
     })
     $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
     checkboxClass: 'icheckbox_minimal-red',
     radioClass   : 'iradio_minimal-red'
     })
     $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
     checkboxClass: 'icheckbox_flat-green',
     radioClass   : 'iradio_flat-green'
     })*/

    var int=self.setInterval("aaa()",1000);

    function aaa(){
        var myDate = new Date();
        myDate.getYear(); //获取当前年份(2位)
        var year = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
        var month = myDate.getMonth()+1; //获取当前月份(0-11,0代表1月)
        var date = myDate.getDate(); //获取当前日(1-31)
        var day = myDate.getDay(); //获取当前星期X(0-6,0代表星期天)
        var hours = myDate.getHours(); //获取当前小时数(0-23)
        var minutes = myDate.getMinutes(); //获取当前分钟数(0-59)
        if(minutes<10){
            minutes = "0" + minutes;
        }
        var mytime=myDate.toLocaleTimeString(); //获取当前时间
        var currentTime = myDate.toLocaleString( ); //获取日期与时间
        if(day==0){
            day="日"
        }else if(day==1){
            day="一"
        }else if(day==2){
            day="二"
        }else if(day==3){
            day="三"
        }else if(day==4){
            day="四"
        }else if(day==5){
            day="五"
        }else if(day==6){
            day="六"
        }
        var dateStr = year + "年" + month + "月"+ date + "日" + "  周" + day ;
        var timeStr = hours + ":" + minutes;
        $("#dateStr").text(dateStr);
        $("#timeStr").text(timeStr);
    }


    var flag = $("#flag").val();
    addbutton(flag);
    //车道节点进入页面，添加返回按钮
    function addbutton(flag){
        if (flag=="true"){
            var button = '<button onclick="backtolode()" type="button" class="btn bg-purple btn-flat margin">'+'返回车道'+'</button>'
            $("#title").append(button);
        }
    }

    function backtolode(){
        location.href="ITDm";
    }
</script>

</html>
