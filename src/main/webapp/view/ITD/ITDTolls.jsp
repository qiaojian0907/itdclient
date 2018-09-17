<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ include file="/view/pub/base.jsp" %>
    <%@ include file="/view/pub/dataTables.jsp" %>
    <title>运维系统</title>
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
<body class="hold-transition skin-blue sidebar-mini">
<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">收费站</h3>
    </div>
    <!-- Main content -->
    <div class="box-body">
        <div class="row">
            <div class="col-lg-3 col-xs-6" >
                <!-- small box -->
                <div class="small-box bg-gray" id="railingMachine">
                    <div class="inner">
                        <h4>郑州站</h4>
                        <p><i class="fa fa-bank fa-3x"></i></p>
                    </div>
                </div>
            </div>
            <!-- ./col -->
            <div class="col-lg-3 col-xs-6" >
                <!-- small box -->
                <div class="small-box bg-gray" id="railingMachine1">
                    <div class="inner">
                        <h4>其他收费站</h4>
                        <p><i class="fa fa-bank fa-3x"></i></p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-xs-6" >
                <!-- small box -->
                <div class="small-box bg-gray" id="railingMachine2">
                    <div class="inner">
                        <h4>其他收费站</h4>
                        <p><i class="fa fa-bank fa-3x"></i></p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-xs-6" >
                <!-- small box -->
                <div class="small-box bg-gray" id="railingMachine3">
                    <div class="inner">
                        <h4>其他收费站</h4>
                        <p><i class="fa fa-bank fa-3x"></i></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<input type="hidden" id="login_no" value="${login_no}">
<input type="hidden" id="login_name" value="${login_name}">
</body>
<script type="text/javascript">
    //进入栏杆机页面
    $("#railingMachine").on("click",function () {
        location.href="itdtoll";
    });
    //进入雨棚灯
    $("#canopylight").on("click",function () {
        location.href="cpl?StatusCanopy="+1;
    });
    //進入通行灯界面
    $("#passagelight").on("click",function () {
        location.href="psl?StatusPassage="+1;
    });
    //进入温控界面
    $("#temperatureControl").on("click",function () {
        location.href="ttc?StatusTemperature="+1;
    });



</script>
</html>
