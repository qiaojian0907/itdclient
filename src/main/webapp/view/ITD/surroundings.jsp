<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ include file="/view/pub/base.jsp" %>
    <%@ include file="/view/pub/dataTables.jsp" %>
    <title>运维系统</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
</head>
<body class="hold-transition skin-blue sidebar-mini autocomplete-div">

<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">郑州站1号车道出口</h3>
    </div>
    <!-- Main content -->
    <div class="box-body">
            <div class="row">
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
                                <div style="text-align: left;">
                                    <p><strong>环境温度:</strong>&nbsp;&nbsp;<span id="wd"></span>&nbsp;&nbsp;°C</p>
                                    <p><strong>相对湿度:</strong>&nbsp;&nbsp;<span id="sd"></span>&nbsp;&nbsp;%</p>
                                    <p><strong>二氧化碳:</strong>&nbsp;&nbsp;<span></span>&nbsp;&nbsp;ppm</p>
                                    <p><strong>PM2.5&nbsp;&nbsp;&nbsp;&nbsp;:</strong>&nbsp;&nbsp;<span></span>&nbsp;&nbsp;ug/m3</p>
                                    <p><strong>PM 10&nbsp;&nbsp;&nbsp;&nbsp;:</strong>&nbsp;&nbsp;<span></span>&nbsp;&nbsp;ug/m3</p>
                                    <p><strong>噪音&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</strong>&nbsp;&nbsp;<span></span>&nbsp;&nbsp;dB</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </div>

<input type="hidden" id="id" value="${id}">
<!-- Modal -->
<input type="hidden" id="flag" value="${flag}">
</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
    qryInfo();
    setInterval("qryInfo()",1000);
    function qryInfo(){
//        alert($("#id").val());
        $.ajax({
            url:'/qryHoldModbusData',
            type:'post',
            data:{
                "ip":"127.0.0.1",
                "slaveId":"1",
                "start":"16",
                "len":"10"
            }
        }).then(function (data) {
            console.log(data);
            var wd = data.temp;
            var sd = data.humidity;
            $("#wd").text(wd);
            $("#sd").text(sd);
        });
    }
</script>

</html>
