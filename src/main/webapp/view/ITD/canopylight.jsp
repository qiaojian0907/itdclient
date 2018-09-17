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
                            <h3 class="widget-user-username">雨棚灯</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding">
                            <dl>
                                <br>
                                <dt align="center"><i class="fa fa-fw fa-arrow-down fa-5x" id="cpl-1"></i></dt>
                                <dt id="gzdt"><p align="center">DO:K<span id="k0"></span> &nbsp;&nbsp;(<span id="kv0"></span>)&nbsp;&nbsp;电压&nbsp;&nbsp;<span id="v1"></span>&nbsp;&nbsp;V&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电流&nbsp;&nbsp;<span id="a1"></span>&nbsp;&nbsp;A</p></dt>
                                <br><br><dt align="center"><i class="fa fa-fw fa-close fa-5x" id="cpl-2"></i></dt>
                                <dt><p align="center">DO:K<span id="k1"></span> &nbsp;&nbsp;(<span id="kv1"></span>)&nbsp;&nbsp;电压&nbsp;&nbsp;<span id="v2"></span>&nbsp;&nbsp;V&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电流&nbsp;&nbsp;<span id="a2"></span>&nbsp;&nbsp;A</p></dt>
                                <dt id="faultName"><%--<p align="center" style="color: red">雨棚灯故障</p>--%></dt>
                            </dl>
                        </div>
                    </div>
                </div>
            </div>
    </div>
</div>
<!-- ./wrapper -->



<input type="hidden" id="id" value="${id}">
<!-- Modal -->
<input type="hidden" id="flag" value="${flag}">
</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
    qryInfo();
    setInterval("qryInfo()",1000);
    var faultStatus = "1";
    var fault_name_str = "";
    var afaultName = "";
    //var aaa;
    var int;
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
            var v1 = data.canopy_lamp_V1;
            var v2 = data.canopy_lamp_V2;
            var a1 = data.canopy_lamp_I1;
            var a2 = data.canopy_lamp_I2;
            var k0 = data.do_idx0;
            var k1 = data.do_idx1;
            var kv0 = data.pcdo_0;
            var kv1 = data.pcdo_1;

            var clStatus1 = data.f103DO_4;//正向绿
            var clStatus2 = data.f103DO_5;//反向红
            /*$("#v1").text(v1);
            $("#v2").text(v2);*/
            //$("#a1").text(a1/1000);
            //$("#a2").text(a2/1000);
            $("#k0").text(k0);
            $("#k1").text(k1);
            $("#kv0").text(kv0);
            $("#kv1").text(kv1);
            if(clStatus1=="0"){
                $("#cpl-1").css("color","black");
                $("#cpl-2").css("color","red");
                $("#a1").text(a2/1000);
                $("#a2").text(a1/1000);
                $("#v2").text(v1);
                $("#v1").text("");
            }else if(clStatus1=="1"){
                $("#cpl-1").css("color","green");
                $("#cpl-2").css("color","black");
                $("#a1").text(a1/1000);
                $("#a2").text(a2/1000);
                $("#v1").text(v1);
                $("#v2").text("");
            }
            /*if(clStatus2=="0"){
                $("#cpl-2").css("color","black");
            }else if(clStatus2=="1"){
                $("#cpl-2").css("color","red");
            }*/
            faultStatus = data.canopy_lamp_faultstatus;
            var faultName = "";
            $("#faultName").empty();
            for(var n=0;n<faultStatus.length;n++){
                if(faultStatus[n]=="1"){
                    faultName = "1";
                    getFaultName(n);
                }
            }
            if(faultName=="1"){
                clearInterval(int);
                $("#cpl-1").removeClass("hidden");
                $("#cpl-1").addClass("hidden");
                $("#gzdt").hide();
                int = setInterval(function(){
                    //var style1 = $("#cpl-1").css("color")+"";


                    var style2 = $("#cpl-2").css("color")+"";
                    /*if(style1=="rgb(0, 0, 0)"){
                        $("#cpl-1").css("color","red");
                    }else{
                        $("#cpl-1").css("color","black");
                    }*/
                    if(style2=="rgb(0, 0, 0)"){
                        $("#cpl-2").css("color","red");
                    }else{
                        $("#cpl-2").css("color","black");
                    }
                },300);

            }else{
                $("#cpl-1").removeClass("hidden");
                $("#gzdt").show();
                clearInterval(int);
            }
        });
    }


    function getFaultName(code){
//        alert($("#id").val());
        $.ajax({
            url:'/itdFaultInfoQry',
            type:'post',
            data:{
                "equipment_type":"1",
                "fault_code":code
            }
        }).then(function (data) {
            afaultName = "<p align=\"center\" style=\"color: red\">"+data[0].fault_name+"</p>";
            console.log(afaultName)
            $("#faultName").append(afaultName);
            //console.log(afaultName);
        })
    }
</script>

</html>
