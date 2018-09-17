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
                    <div class="box box-widget widget-user-2">
                        <div class="widget-user-header bg-yellow">
                            <div class="widget-user-image">
                            </div>
                            <h3 class="widget-user-username">栏杆机</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding">
                            <dl><br>
                                <dt align="center">栏杆控制<dt/><br>
                                <dd align="center">抬杆&nbsp;&nbsp;&nbsp;&nbsp;K<span id="k4"></span>&nbsp;&nbsp;&nbsp;&nbsp;(<span id="kv4"></span>)</dd>
                                <dd align="center">落杆&nbsp;&nbsp;&nbsp;&nbsp;K<span id="k5"></span>&nbsp;&nbsp;&nbsp;&nbsp;(<span id="kv5"></span>)</dd>
                                <br><br><dt align="center">栏杆状态<dt/><br>
                                <dd align="center" id="rms1"><i class="fa fa-fw fa-external-link-square fa-3x" id="rmc-1"></i>&nbsp;&nbsp;&nbsp;&nbsp;<h2>栏杆抬起</h2></dd>
                                <dd align="center" id="rms2"><i class="fa fa-minus-circle fa-3x" id="rmc-2"></i>&nbsp;&nbsp;&nbsp;&nbsp;<h2>栏杆落下</h2></dd>
                                <dt id="faultName"></dt>
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
    var int ;
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
            var railing_status = data.railing_status;
            var k4 = data.do_idx4;
            var k5 = data.do_idx5;
            var kv4 = data.pcdo_4;
            var kv5 = data.pcdo_5;
            $("#k4").text(k4);
            $("#k5").text(k5);
            $("#kv4").text(kv4);
            $("#kv5").text(kv5);
            var rmStatus1 = data.f103DO_6;//绿 0关 1开
            var rmStatus2 = data.f103DO_7;//红 0关 1开
            if(rmStatus1=="0"){
                $("#rmc-1").css("color","black");
                $("#rms1").hide();
                $("#rms2").show();
            }else if(rmStatus1=="1"){
                $("#rmc-1").css("color","green");
                $("#rms1").show();
                $("#rms2").hide();
            }
            /*if(rmStatus2=="0"){
                $("#rmc-2").css("color","black");
            }else if(rmStatus2=="1"){
                $("#rmc-2").css("color","red");
                $("#rms1").hide();
                $("#rms2").show();
            }*/

            faultStatus = data.railing_faultstatus;
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
                $("#rms1").hide();
                $("#rms2").show();
                int = setInterval(function(){
                    //var style1 = $("#rmc-1").css("color")+"";
                    var style2 = $("#rmc-2").css("color")+"";
                    /*if(style1=="rgb(0, 0, 0)"){
                        $("#rmc-1").css("color","red");
                    }else{
                        $("#rmc-1").css("color","black");
                    }*/
                    if(style2=="rgb(0, 0, 0)"){
                        $("#rmc-2").css("color","red");
                    }else{
                        $("#rmc-2").css("color","black");
                    }
                },300);

            }else{
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
                "equipment_type":"3",
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
