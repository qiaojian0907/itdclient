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
        <h3 class="box-title">郑州站</h3>
    </div>
    <!-- Main content -->
    <div class="box-body">
        <div class="row">
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box" id="tollInfo">
                    <span class="info-box-icon bg-purple"><i class="fa fa-car"></i></span>
                    <div class="info-box-content">
                        <span class="info-box-text">郑州站</span>
                        <span class="info-box-number">1号车道出口</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box" id="tollInfo1">
                    <span class="info-box-icon bg-purple"><i class="fa fa-car"></i></span>
                    <div class="info-box-content">
                        <span class="info-box-text">郑州站</span>
                        <span class="info-box-number">其他车道</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box" id="tollInfo2">
                    <span class="info-box-icon bg-purple"><i class="fa fa-car"></i></span>
                    <div class="info-box-content">
                        <span class="info-box-text">郑州站</span>
                        <span class="info-box-number">其他车道</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box" id="tollInfo3">
                    <span class="info-box-icon bg-purple"><i class="fa fa-car"></i></span>
                    <div class="info-box-content">
                        <span class="info-box-text">郑州站</span>
                        <span class="info-box-number">其他车道</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    //进入栏杆机页面
    $("#tollInfo").on("click",function () {
        location.href="ITDm";
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
