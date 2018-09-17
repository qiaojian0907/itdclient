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
                    <div class="box box-widget widget-user-2">
                        <div class="widget-user-header bg-aqua">
                            <div class="widget-user-image">

                            </div>
                            <h3 class="widget-user-username">DO输出</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <div class="radio">
                                <label>
                                    正向雨棚绿灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok0"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv0"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    正向雨棚红灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok1"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv1"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    通行信号绿灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok2"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv2"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    通行信号红灯&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok3"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv3"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    自动栏杆抬起&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok4"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv4"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    自动栏杆落下&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok5"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv5"></span>&nbsp;&nbsp;
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    黄闪声光报警&nbsp;&nbsp;&nbsp;&nbsp;K&nbsp;<span id="dok6"></span>&nbsp;&nbsp;高/低&nbsp;<span id="dokv6"></span>&nbsp;&nbsp;
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
            var kv0 = data.di_idx0;
            var kv1 = data.di_idx1;
            var kv2 = data.di_idx2;
            var kv3 = data.di_idx3;
            var kv4 = data.di_idx4;
            var kv5 = data.di_idx5;
            var kv6 = data.di_idx6;
            var kv7 = data.di_idx7;


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
            $("#dokv6").text(pcdo_6);

            /* $("#k5").text(k5);
             $("#kv4").text(kv4);
             $("#kv5").text(kv5);*/
        });
    }
</script>

</html>
