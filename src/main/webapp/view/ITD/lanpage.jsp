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
                        <div class="widget-user-header bg-yellow">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">网络</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <div class="radio">
                                <label>
                                    网&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;关&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip1"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    摄像机1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip2"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    摄像机2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip3"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    摄像机3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip4"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    字符叠加器&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip5"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip6"></span>
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    费&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;显&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="ip7"></span>
                                </label>
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
            $("#ip1").text(data.ip1);
            $("#ip2").text(data.ip2);
            $("#ip3").text(data.ip3);
            $("#ip4").text(data.ip4);
            $("#ip5").text(data.ip5);
            $("#ip6").text(data.ip6);
            $("#ip7").text(data.ip7);

            /* $("#k5").text(k5);
             $("#kv4").text(kv4);
             $("#kv5").text(kv5);*/
        });
    }
</script>

</html>
