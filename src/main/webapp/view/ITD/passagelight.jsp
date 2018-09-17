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
                            <h3 class="widget-user-username">通行灯</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding">
                            <dl>
                                <dt align="center"><i class="fa fa-arrow-circle-right fa-5x" id="psl-1"></i></dt>
                                <dt id="gzdt"><p align="center">DO:K<span id="k2"></span> &nbsp;&nbsp;(<span id="kv2"></span>)&nbsp;&nbsp;<span id="v1"></span>V</p></dt>
                                <br><br><dt align="center"><i class="fa fa-fw fa-close fa-5x" id="psl-2"></i></dt>
                                <dt><p align="center">DO:K<span id="k3"></span> &nbsp;&nbsp;(<span id="kv3"></span>)&nbsp;&nbsp;<span id="v2"></span>V</p></dt>
                                <dt id="faultName"></dt>
                            </dl>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </div>
    <!-- /.content-wrapper -->
    <!-- Control Sidebar -->

</div>



<input type="hidden" id="id" value="${id}">
<!-- Modal -->
<input type="hidden" id="flag" value="${flag}">
</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
    qryInfo();
    setInterval("qryInfo()",1000);
    var faultStatus = 1;
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
            var v1 = data.traffic_light_V1;
            var v2 = data.traffic_light_V2;
            var k2 = data.do_idx2;
            var k3 = data.do_idx3;
            var kv2 = data.pcdo_2;
            var kv3 = data.pcdo_3;
            /*$("#v1").text(v1);
            $("#v2").text(v2);*/
            $("#k2").text(k2);
            $("#k3").text(k3);
            $("#kv2").text(kv2);
            $("#kv3").text(kv3);
            var psStatus1 = data.f103DO_2;//绿 0关 1开
            var psStatus2 = data.f103DO_3;//红 0关 1开
            if(psStatus1=="0"){
                $("#psl-1").css("color","black");
                $("#psl-2").css("color","red");
                $("#v2").text(v1);
                $("#v1").text("");
            }else if(psStatus1=="1"){
                $("#psl-1").css("color","green");
                $("#psl-2").css("color","black");
                $("#v1").text(v1);
                $("#v2").text("");
            }
            /*if(psStatus2=="0"){
                $("#psl-2").css("color","black");
            }else if(psStatus2=="1"){
                $("#psl-2").css("color","red");
            }*/

            faultStatus = data.traffic_light_faultstatus;
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
                $("#psl-1").removeClass("hidden");
                $("#psl-1").addClass("hidden");
                $("#gzdt").hide();
                int = setInterval(function(){
                    //var style1 = $("#psl-1").css("color")+"";
                    var style2 = $("#psl-2").css("color")+"";
                    /*if(style1=="rgb(0, 0, 0)"){
                        $("#psl-1").css("color","red");
                    }else{
                        $("#psl-1").css("color","black");
                    }*/
                    if(style2=="rgb(0, 0, 0)"){
                        $("#psl-2").css("color","red");
                    }else{
                        $("#psl-2").css("color","black");
                    }
                },300);

            }else{
                clearInterval(int);
                $("#gzdt").show();
                $("#psl-1").removeClass("hidden");
            }
        });
    }

    function getFaultName(code){
//        alert($("#id").val());
        $.ajax({
            url:'/itdFaultInfoQry',
            type:'post',
            data:{
                "equipment_type":"2",
                "fault_code":code
            }
        }).then(function (data) {
            var afaultName = "<p align=\"center\" style=\"color: red\">"+data[0].fault_name+"</p>";
            console.log(afaultName)
            $("#faultName").append(afaultName);
            //console.log(afaultName);
        })
    }

</script>

</html>
