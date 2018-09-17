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
            <h3 class="box-title">郑州站1号车道出口</h3>
        </div>
        <!-- Main content -->
        <div class="box-body">
        <section class="content">
            <div class="row">
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-gray" id="railingMachine">
                        <div class="inner">
                            <h4>栏杆机</h4>
                            <p><i class="fa fa-minus-circle fa-3x" id="railingMachine-i"></i>
                                <i class="fa fa-fw fa-external-link-square fa-3x hidden" id="railingMachine-j"></i>
                            </p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-yellow" id="canopylight">
                        <div class="inner">
                            <h4>雨棚灯</h4>
                            <p>
                                <i class="fa fa-fw fa-close fa-3x" id="canopylight-i"></i>
                                <i class="fa fa-fw fa-arrow-down fa-3x hidden" id="canopylight-j" style="color: #00e765"></i>
                            </p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-green" id="passagelight">
                        <div class="inner">
                            <h4>通行灯</h4>
                            <p><i class="fa fa-fw fa-close fa-3x" id="passagelight-i"></i>
                                <i class="fa fa-arrow-circle-right fa-3x hidden" style="color: #00e765" id="passagelight-j"></i>
                            </p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-red" id="temperatureControl">
                        <div class="inner">
                            <h4>温控</h4>
                            <p><i class="fa fa-fw fa-certificate fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
            </div>
            <div class="row">
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-aqua" id="surroundings">
                        <div class="inner">
                            <h4>环境</h4>
                            <p><i class="fa fa-fw fa-globe fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-navy" id="setting">
                        <div class="inner">
                            <h4>设置</h4>
                            <p><i class="ion ion-ios-gear-outline fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-maroon" id="logpage">
                        <div class="inner">
                            <h4>日志</h4>
                            <p><i class="fa fa-fw fa-file-text-o fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-purple" id="lanp">
                        <div class="inner">
                            <h4>LAN</h4>
                            <p><i class="fa fa-fw fa-rss fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
            </div>
            <div class="row">
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-fuchsia" id="dop">
                        <div class="inner">
                            <h4>DO</h4>
                            <p><i class="fa fa-google-plus fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6" >
                    <!-- small box -->
                    <div class="small-box bg-teal" id="dip">
                        <div class="inner">
                            <h4>DI</h4>
                            <p><i class="fa fa-google-plus fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->

                <div class="col-lg-3 col-xs-6" id="pd-div">
                    <!-- small box -->
                    <div class="small-box bg-orange" id="sendOrder">
                        <div class="inner">
                            <h4>派单</h4>
                            <p><i class="fa fa-pencil-square-o fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-xs-6" id="jd-div">
                    <!-- small box -->
                    <div class="small-box bg-black" id="reOrder">
                        <div class="inner">
                            <h4>接单</h4>
                            <p><i class="glyphicon glyphicon-wrench fa-3x"></i></p>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <!-- ./col -->
            </div>
        </section>
        </div>
    </div>
<input type="hidden" id="login_no" value="${login_no}">
</body>
<script type="text/javascript">
    var int1;
    var int2;
    var int3;
    //进入栏杆机页面
    $("#railingMachine").on("click",function () {
        location.href="rmc?StatusRailing="+1;
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
    //进入环境页面
    $("#surroundings").on("click",function () {
        location.href="srd?StatusSurroundings="+1;
    });
    //进入设置页面
    $("#setting").on("click",function () {
        location.href="set?StatusSetting="+1;
    });
    //进入日志页面
    $("#logpage").on("click",function () {
        location.href="lgp?StatusLog="+1;
    });
    //进入DO页面
    $("#dop").on("click",function () {
        location.href="dop?StatusDO="+1;
    });
    //进入DI页面
    $("#dip").on("click",function () {
        location.href="dip?StatusDI="+1;
    });
    //进入网络页面
    $("#lanp").on("click",function () {
        location.href="lap?Statuslan="+1;
    });
    //进入派单页面
    $("#sendOrder").on("click",function () {
        location.href="fll";
    });
    //进入接单页面
    $("#reOrder").on("click",function () {
        location.href="itdrbq";
    });
    if($("#login_no").val()=="1000"){
        $("#jd-div").hide();
    }else{
        $("#pd-div").hide();
    }

    qryInfo();
    setInterval("qryInfo()",5000);
    function qryInfo(){
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
            var faultStatus1 = data.railing_faultstatus;
            var faultStatus2 = data.canopy_lamp_faultstatus;
            var faultStatus3 = data.traffic_light_faultstatus;
            var status1 = 0;
            var status2 = 0;
            var status3 = 0;
            var clStatus1 = data.f103DO_4;//雨棚灯正向绿
            var clStatus2 = data.f103DO_5;//雨棚灯反向红
            var rmStatus1 = data.f103DO_6;//绿 0关 1开
            var rmStatus2 = data.f103DO_7;//红 0关 1开
            var psStatus1 = data.f103DO_2;//绿 0关 1开
            var psStatus2 = data.f103DO_3;//红 0关 1开
            for(var i=0;i<faultStatus1.length;i++){
                if(faultStatus1[i]=="1"){
                    status1 = 1;
                }
            }
            for(var j=0;j<faultStatus2.length;j++){
                if(faultStatus2[j]=="1"){
                    status2 = 1;
                }
            }
            for(var k=0;k<faultStatus3.length;k++){
                if(faultStatus3[k]=="1"){
                    status3 = 1;
                }
            }

            if(status1==1){
                clearInterval(int1);
                $("#railingMachine-i").removeClass("hidden");
                $("#railingMachine-j").addClass("hidden");
                int1 = setInterval(function(){
                    var style0 = $("#railingMachine-i").css("color")+"";
                    if(style0=="rgb(255, 255, 255)"){
                        $("#railingMachine-i").css("color","red");
                    }else{
                        $("#railingMachine-i").css("color","white");
                    }
                },200);
            }else{
                clearInterval(int1);
                $("#railingMachine-i").css("color","white");
                if(rmStatus1=="1"){
                    $("#railingMachine-i").addClass("hidden");
                    $("#railingMachine-j").removeClass("hidden");
                }
                /*$("#railingMachine-i").addClass("hidden");
                $("#railingMachine-j").removeClass("hidden");*/

                if(rmStatus1=="0"){
                    $("#railingMachine-j").addClass("hidden");
                    $("#railingMachine-i").removeClass("hidden");
                }

            }

            if(status2==1){
                clearInterval(int2);
                $("#canopylight-i").removeClass("hidden");
                $("#canopylight-j").addClass("hidden");
                //$("#canopylight-i").addClass("fa fa-fw fa-close fa-3x");
                int2 = setInterval(function(){
                    var style1 = $("#canopylight-i").css("color")+"";
                    if(style1=="rgb(255, 255, 255)"){
                        $("#canopylight-i").css("color","red");
                    }else{
                        $("#canopylight-i").css("color","white");
                    }
                },200);
            }else{
                clearInterval(int2);
                //$("#canopylight-i").css("color","white");
                //$("#canopylight-i").addClass("hidden");
                //$("#canopylight-j").removeClass("hidden");
                $("#canopylight-i").css("color","white");
                if(clStatus1=="1"){
                    $("#canopylight-i").addClass("hidden");
                    $("#canopylight-j").removeClass("hidden");
                }
                if(clStatus1=="0"){
                    $("#canopylight-j").addClass("hidden");
                    $("#canopylight-i").removeClass("hidden");
                    $("#canopylight-i").css("color","red");
                }
            }

            if(status3==1){
                clearInterval(int3);
                $("#passagelight-i").removeClass("hidden");
                $("#passagelight-j").addClass("hidden");
                int3 = setInterval(function(){
                    var style2 = $("#passagelight-i").css("color")+"";
                    if(style2=="rgb(255, 255, 255)"){
                        $("#passagelight-i").css("color","red");
                    }else{
                        $("#passagelight-i").css("color","white");
                    }
                },200);

            }else{
                clearInterval(int3);
               // $("#passagelight-i").css("color","white");
                $("#passagelight-i").css("color","white");
                if(psStatus1=="1"){
                    $("#passagelight-i").addClass("hidden");
                    $("#passagelight-j").removeClass("hidden");
                }
                if(psStatus1=="0"){
                    $("#passagelight-j").addClass("hidden");
                    $("#passagelight-i").removeClass("hidden");
                    $("#passagelight-i").css("color","red");
                }
            }
        });
    }





    //setInterval("changeStatus()",100);
    //changeStatus()
    function changeStatus(){
        //$("#canopylight-i").css("color","red");
        var style1 = $("#canopylight-i").css("color")+"";
        if(style1=="rgb(255, 255, 255)"){
            $("#canopylight-i").css("color","red");
        }else{
            $("#canopylight-i").css("color","white");
        }

        var style2 = $("#passagelight-i").css("color")+"";
        if(style2=="rgb(255, 255, 255)"){
            $("#passagelight-i").css("color","red");
        }else{
            $("#passagelight-i").css("color","white");
        }

        var style0 = $("#railingMachine-i").css("color")+"";
        if(style0=="rgb(255, 255, 255)"){
            $("#railingMachine-i").css("color","red");
        }else{
            $("#railingMachine-i").css("color","white");
        }
    }
</script>
</html>
