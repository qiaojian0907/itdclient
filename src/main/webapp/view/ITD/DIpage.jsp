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
                        <div class="widget-user-header bg-green">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">DI输入</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <div class="radio">
                                <label>
                                    0路DI输入&nbsp;&nbsp;<span id="k0"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv0"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    1路DI输入&nbsp;&nbsp;<span id="k1"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv1"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    2路DI输入&nbsp;&nbsp;<span id="k2"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv2"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    3路DI输入&nbsp;&nbsp;<span id="k3"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv3"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    4路DI输入&nbsp;&nbsp;<span id="k4"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv4"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    5路DI输入&nbsp;&nbsp;<span id="k5"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv5"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    6路DI输入&nbsp;&nbsp;<span id="k6"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv6"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    7路DI输入&nbsp;&nbsp;<span id="k7"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv7"></span>&nbsp;&nbsp;
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

            var k0 = data.di_idx0;
            var k1 = data.di_idx1;
            var k2 = data.di_idx2;
            var k3 = data.di_idx3;
            var k4 = data.di_idx4;
            var k5 = data.di_idx5;
            var k6 = data.di_idx6;
            var k7 = data.di_idx7;
            $("#k0").text(k0);
            $("#k1").text(k1);
            $("#k2").text(k2);
            $("#k3").text(k3);
            $("#k4").text(k4);
            $("#k5").text(k5);
            $("#k6").text(k6);
            $("#k7").text(k7);
            var di0_flag = data.di0_flag;
            var di1_flag = data.di1_flag;
            var di2_flag = data.di2_flag;
            var di3_flag = data.di3_flag;
            var di4_flag = data.di4_flag;
            var di5_flag = data.di5_flag;
            var di6_flag = data.di6_flag;
            var di7_flag = data.di7_flag;
            if(di0_flag=="0"){
                $("#open0").removeClass();
                $("#close0").removeClass();
                $("#open0").addClass("btn btn-default btn-xs");
                $("#close0").addClass("btn btn-success btn-xs");
            }else if(di0_flag=="1"){
                $("#open0").removeClass();
                $("#close0").removeClass();
                $("#open0").addClass("btn btn-success btn-xs");
                $("#close0").addClass("btn btn-default btn-xs");
            }
            if(di1_flag=="0"){
                $("#open1").removeClass();
                $("#close1").removeClass();
                $("#open1").addClass("btn btn-default btn-xs");
                $("#close1").addClass("btn btn-success btn-xs");
            }else if(di1_flag=="1"){
                $("#open1").removeClass();
                $("#close1").removeClass();
                $("#open1").addClass("btn btn-success btn-xs");
                $("#close1").addClass("btn btn-default btn-xs");
            }
            if(di2_flag=="0"){
                $("#open2").removeClass();
                $("#close2").removeClass();
                $("#open2").addClass("btn btn-default btn-xs");
                $("#close2").addClass("btn btn-success btn-xs");
            }else if(di2_flag=="1"){
                $("#open2").removeClass();
                $("#close2").removeClass();
                $("#open2").addClass("btn btn-success btn-xs");
                $("#close2").addClass("btn btn-default btn-xs");
            }
            if(di3_flag=="0"){
                $("#open3").removeClass();
                $("#close3").removeClass();
                $("#open3").addClass("btn btn-default btn-xs");
                $("#close3").addClass("btn btn-success btn-xs");
            }else if(di3_flag=="1"){
                $("#open3").removeClass();
                $("#close3").removeClass();
                $("#open3").addClass("btn btn-success btn-xs");
                $("#close3").addClass("btn btn-default btn-xs");
            }
            if(di4_flag=="0"){
                $("#open4").removeClass();
                $("#close4").removeClass();
                $("#open4").addClass("btn btn-default btn-xs");
                $("#close4").addClass("btn btn-success btn-xs");
            }else if(di4_flag=="1"){
                $("#open4").removeClass();
                $("#close4").removeClass();
                $("#open4").addClass("btn btn-success btn-xs");
                $("#close4").addClass("btn btn-default btn-xs");
            }
            if(di5_flag=="0"){
                $("#open5").removeClass();
                $("#close5").removeClass();
                $("#open5").addClass("btn btn-default btn-xs");
                $("#close5").addClass("btn btn-success btn-xs");
            }else if(di5_flag=="1"){
                $("#open5").removeClass();
                $("#close5").removeClass();
                $("#open5").addClass("btn btn-success btn-xs");
                $("#close5").addClass("btn btn-default btn-xs");
            }
            if(di6_flag=="0"){
                $("#open6").removeClass();
                $("#close6").removeClass();
                $("#open6").addClass("btn btn-default btn-xs");
                $("#close6").addClass("btn btn-success btn-xs");
            }else if(di6_flag=="1"){
                $("#open6").removeClass();
                $("#close6").removeClass();
                $("#open6").addClass("btn btn-success btn-xs");
                $("#close6").addClass("btn btn-default btn-xs");
            }

            if(di7_flag=="0"){
                $("#open7").removeClass();
                $("#close7").removeClass();
                $("#open7").addClass("btn btn-default btn-xs");
                $("#close7").addClass("btn btn-success btn-xs");
            }else if(di7_flag=="1"){
                $("#open7").removeClass();
                $("#close7").removeClass();
                $("#open7").addClass("btn btn-success btn-xs");
                $("#close7").addClass("btn btn-default btn-xs");
            }

            var kv0 = data.pcdi_0;
            var kv1 = data.pcdi_1;
            var kv2 = data.pcdi_2;
            var kv3 = data.pcdi_3;
            var kv4 = data.pcdi_4;
            var kv5 = data.pcdi_5;
            var kv6 = data.pcdi_6;
            var kv7 = data.pcdi_7;
            $("#kv0").text(kv0);
            $("#kv1").text(kv1);
            $("#kv2").text(kv2);
            $("#kv3").text(kv3);
            $("#kv4").text(kv4);
            $("#kv5").text(kv5);
            $("#kv6").text(kv6);
            $("#kv7").text(kv7);

            /* $("#k5").text(k5);
             $("#kv4").text(kv4);
             $("#kv5").text(kv5);*/
        });
    }
</script>

</html>
