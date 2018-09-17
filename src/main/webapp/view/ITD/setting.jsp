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
                <div class="col-md-6">
                    <div class="nav-tabs-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#tab_1" data-toggle="tab">模式</a></li>
                            <li><a href="#tab_2" data-toggle="tab">DI输入</a></li>
                            <li><a href="#tab_3" data-toggle="tab">DO输出</a></li>
                            <li><a href="#tab_4" data-toggle="tab">网络</a></li>
                            <li><a href="#tab_5" data-toggle="tab">时间</a></li>
                            <li><a href="#tab_6" data-toggle="tab">温控</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_1">
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
                                                        <input type="radio" name="optionsRadios" disabled>
                                                        ETC车道
                                                    </label>
                                                </div>
                                                <div class="radio">
                                                    <label>
                                                        <input type="radio" name="optionsRadios" disabled>
                                                        MTC车道
                                                    </label>
                                                </div>

                                                <div class="radio">
                                                    <label>
                                                        <input type="radio" name="optionsRadios" disabled>
                                                        混合车道
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_2">
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
                                            <span id="workMode"></span>
                                            <div class="radio">
                                                <label>
                                                    0路DI输入&nbsp;&nbsp;<span id="k0"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv0"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open0">开启</button>
                                                        <button type="button"  id="close0">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    1路DI输入&nbsp;&nbsp;<span id="k1"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv1"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open1">开启</button>
                                                        <button type="button"  id="close1">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    2路DI输入&nbsp;&nbsp;<span id="k2"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv2"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open2">开启</button>
                                                        <button type="button"  id="close2">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    3路DI输入&nbsp;&nbsp;<span id="k3"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv3"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open3">开启</button>
                                                        <button type="button"  id="close3">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    4路DI输入&nbsp;&nbsp;<span id="k4"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv4"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open4">开启</button>
                                                        <button type="button"  id="close4">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    5路DI输入&nbsp;&nbsp;<span id="k5"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv5"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open5">开启</button>
                                                        <button type="button"  id="close5">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    6路DI输入&nbsp;&nbsp;<span id="k6"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv6"></span>&nbsp;&nbsp;

                                                    <div class="btn-group">
                                                        <button type="button"  id="open6">开启</button>
                                                        <button type="button"  id="close6">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    7路DI输入&nbsp;&nbsp;<span id="k7"></span>&nbsp;&nbsp;高/低&nbsp;&nbsp;<span id="kv7"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="open7">开启</button>
                                                        <button type="button"  id="close7">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_3">
                                <div class="col-md-3">
                                    <div class="box box-widget widget-user-2">
                                        <div class="widget-user-header bg-aqua">
                                            <div class="widget-user-image">

                                            </div>
                                            <h3 class="widget-user-username">DO输出</h3>
                                            <h5 class="widget-user-desc">Lead Developer</h5>
                                        </div>
                                        <div class="box-footer no-padding" align="center" style="height: 350px">
                                            <span id="workMode1"></span>
                                            <div class="radio">
                                                <label>
                                                    正向雨棚绿灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok0"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv0"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo0">开启</button>
                                                        <button type="button"  id="closedo0">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    正向雨棚红灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok1"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv1"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo1">开启</button>
                                                        <button type="button"  id="closedo1">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    通行信号绿灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok2"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv2"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo2">开启</button>
                                                        <button type="button"  id="closedo2">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    通行信号红灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok3"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv3"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo3">开启</button>
                                                        <button type="button"  id="closedo3">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    自动栏杆抬起&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok4"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv4"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo4">开启</button>
                                                        <button type="button"  id="closedo4">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    自动栏杆落下&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok5"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv5"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo5">开启</button>
                                                        <button type="button"  id="closedo5">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    黄闪声光报警&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok6"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv6"></span>&nbsp;&nbsp;
                                                    <div class="btn-group">
                                                        <button type="button"  id="opendo6">开启</button>
                                                        <button type="button"  id="closedo6">关闭</button>
                                                    </div>
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_4">
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
                                            <span id="workMode2"></span>
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

                            <div class="tab-pane" id="tab_5">
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
                                            </dl>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="tab-pane" id="tab_6">
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
            var work_mode = data.work_mode;
            $("input[name=optionsRadios]").each(function(i){
                var mode = i+"";
                if(mode==work_mode){
                    $(this).attr("checked",'checked');
                    if(work_mode=="1"){
                        $("#workMode").text("MTC车道");
                        $("#workMode1").text("MTC车道");
                        $("#workMode2").text("MTC车道");
                    }else if(work_mode=="0"){
                        $("#workMode").text("ETC车道");
                        $("#workMode1").text("ETC车道");
                        $("#workMode2").text("ETC车道");
                    }else if(work_mode=="2"){
                        $("#workMode").text("混合车道");
                        $("#workMode1").text("混合车道");
                        $("#workMode2").text("混合车道");
                    }
                }
            });

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


            var dok0 = data.do_idx0;
            var dok1 = data.do_idx1;
            var dok2 = data.do_idx2;
            var dok3 = data.do_idx3;
            var dok4 = data.do_idx4;
            var dok5 = data.do_idx5;
            var dok6 = data.do_idx6;
            $("#dok0").text(dok0);
            $("#dok1").text(dok1);
            $("#dok2").text(dok2);
            $("#dok3").text(dok3);
            $("#dok4").text(dok4);
            $("#dok5").text(dok5);
            $("#dok6").text(dok6);

            var do0_flag = data.do0_flag;
            var do1_flag = data.do1_flag;
            var do2_flag = data.do2_flag;
            var do3_flag = data.do3_flag;
            var do4_flag = data.do4_flag;
            var do5_flag = data.do5_flag;
            var do6_flag = data.do6_flag;
            if(do0_flag=="0"){
                $("#opendo0").removeClass();
                $("#closedo0").removeClass();
                $("#opendo0").addClass("btn btn-default btn-xs");
                $("#closedo0").addClass("btn btn-success btn-xs");
            }else if(do0_flag=="1"){
                $("#opendo0").removeClass();
                $("#closedo0").removeClass();
                $("#opendo0").addClass("btn btn-success btn-xs");
                $("#closedo0").addClass("btn btn-default btn-xs");
            }
            if(do1_flag=="0"){
                $("#opendo1").removeClass();
                $("#closedo1").removeClass();
                $("#opendo1").addClass("btn btn-default btn-xs");
                $("#closedo1").addClass("btn btn-success btn-xs");
            }else if(do1_flag=="1"){
                $("#opendo1").removeClass();
                $("#closedo1").removeClass();
                $("#opendo1").addClass("btn btn-success btn-xs");
                $("#closedo1").addClass("btn btn-default btn-xs");
            }
            if(do2_flag=="0"){
                $("#opendo2").removeClass();
                $("#closedo2").removeClass();
                $("#opendo2").addClass("btn btn-default btn-xs");
                $("#closedo2").addClass("btn btn-success btn-xs");
            }else if(do2_flag=="1"){
                $("#opendo2").removeClass();
                $("#closedo2").removeClass();
                $("#opendo2").addClass("btn btn-success btn-xs");
                $("#closedo2").addClass("btn btn-default btn-xs");
            }
            if(do3_flag=="0"){
                $("#opendo3").removeClass();
                $("#closedo3").removeClass();
                $("#opendo3").addClass("btn btn-default btn-xs");
                $("#closedo3").addClass("btn btn-success btn-xs");
            }else if(do3_flag=="1"){
                $("#opendo3").removeClass();
                $("#closedo3").removeClass();
                $("#opendo3").addClass("btn btn-success btn-xs");
                $("#closedo3").addClass("btn btn-default btn-xs");
            }
            if(do4_flag=="0"){
                $("#opendo4").removeClass();
                $("#closedo4").removeClass();
                $("#opendo4").addClass("btn btn-default btn-xs");
                $("#closedo4").addClass("btn btn-success btn-xs");
            }else if(do4_flag=="1"){
                $("#opendo4").removeClass();
                $("#closedo4").removeClass();
                $("#opendo4").addClass("btn btn-success btn-xs");
                $("#closedo4").addClass("btn btn-default btn-xs");
            }
            if(do5_flag=="0"){
                $("#opendo5").removeClass();
                $("#closedo5").removeClass();
                $("#opendo5").addClass("btn btn-default btn-xs");
                $("#closedo5").addClass("btn btn-success btn-xs");
            }else if(do5_flag=="1"){
                $("#opendo5").removeClass();
                $("#closedo5").removeClass();
                $("#opendo5").addClass("btn btn-success btn-xs");
                $("#closedo5").addClass("btn btn-default btn-xs");
            }
            if(do6_flag=="0"){
                $("#opendo6").removeClass();
                $("#closedo6").removeClass();
                $("#opendo6").addClass("btn btn-default btn-xs");
                $("#closedo6").addClass("btn btn-success btn-xs");
            }else if(do6_flag=="1"){
                $("#opendo6").removeClass();
                $("#closedo6").removeClass();
                $("#opendo6").addClass("btn btn-success btn-xs");
                $("#closedo6").addClass("btn btn-default btn-xs");
            }

            var pcdo_0 = data.pcdo_0;
            var pcdo_1 = data.pcdo_1;
            var pcdo_2 = data.pcdo_2;
            var pcdo_3 = data.pcdo_3;
            var pcdo_4 = data.pcdo_4;
            var pcdo_5 = data.pcdo_5;
            var pcdo_6 = data.pcdo_6;
            $("#dokv0").text(pcdo_0);
            $("#dokv1").text(pcdo_1);
            $("#dokv2").text(pcdo_2);
            $("#dokv3").text(pcdo_3);
            $("#dokv4").text(pcdo_4);
            $("#dokv5").text(pcdo_5);
            $("#dokv6").text(pcdo_5);

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
