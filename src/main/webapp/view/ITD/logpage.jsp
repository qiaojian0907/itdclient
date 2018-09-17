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
                            <li  class="active"><a href="#tab_3" data-toggle="tab">故障日志</a></li>
                            <li><a href="#tab_1" data-toggle="tab">温湿日志</a></li>
                            <li><a href="#tab_2" data-toggle="tab">人员日志</a></li>
                            <li><a href="#tab_4" data-toggle="tab">维护日志</a></li>
                            <li><a href="#tab_5" data-toggle="tab">车辆日志</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_3">
                                <div class="box box-widget  widget-user-2">
                                    <div class="widget-user-header bg-yellow">
                                        <h3 class="widget-user-username">故障日志</h3>
                                        <h5 class="widget-user-desc">Note Managerment</h5>
                                    </div>
                                    <div class="box-footer no-padding">
                                        <div class="tab-content">
                                            <div class="box-body">
                                                <table class="table table-striped">
                                                    <tbody id="gztr">
                                                        <tr>
                                                            <th>故障时间</th>
                                                            <th>故障描述</th>
                                                            <th>恢复时间</th>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="tab-pane" id="tab_1">
                                <div class="box box-widget  widget-user-2">
                                        <div class="widget-user-header bg-red">
                                            <h3 class="widget-user-username">温湿日志</h3>
                                            <h5 class="widget-user-desc">Note Managerment</h5>
                                        </div>
                                        <div class="box-footer no-padding">
                                            <div class="box-body">
                                                <table class="table table-striped">
                                                    <tbody id="wstr"><tr>
                                                        <th>日期</th>
                                                        <th>温度</th>
                                                        <th>湿度</th>
                                                    </tr>

                                                    </tbody></table>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            <div class="tab-pane" id="tab_2">
                                <div class="box box-widget  widget-user-2">
                                        <div class="widget-user-header bg-aqua">
                                            <h3 class="widget-user-username">人员日志</h3>
                                            <h5 class="widget-user-desc">Note Managerment</h5>
                                        </div>
                                        <div class="box-footer no-padding">
                                            <div class="tab-content">
                                                <div class="box-body">
                                                    <table class="table table-striped">
                                                        <tbody id="dltr"><tr>
                                                            <th>登录时间</th>
                                                            <th>工号</th>
                                                            <th>退出时间</th>
                                                        </tr>

                                                        </tbody></table>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            <div class="tab-pane" id="tab_4">
                                <div class="box box-widget  widget-user-2">
                                    <div class="widget-user-header bg-green">
                                        <h3 class="widget-user-username">维护日志</h3>
                                        <h5 class="widget-user-desc">Note Managerment</h5>
                                    </div>
                                    <div class="box-footer no-padding">
                                        <div class="tab-content">
                                            <div class="box-body">
                                                <table class="table table-striped">
                                                    <tbody><tr>
                                                        <th>日期</th>
                                                        <th>工号</th>
                                                        <th>设备名称</th>
                                                        <th>状态</th>
                                                    </tr>

                                                    </tbody></table>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_5">
                                <div class="box box-widget  widget-user-2">
                                        <div class="widget-user-header bg-aqua">
                                            <h3 class="widget-user-username">车辆日志</h3>
                                            <h5 class="widget-user-desc">Note Managerment</h5>
                                        </div>
                                        <div class="box-footer no-padding">
                                            <div class="box-body">
                                                <table class="table table-striped">
                                                    <tbody><tr>
                                                        <th>日期</th>
                                                        <th>24h/辆</th>
                                                        <th>12h/辆</th>
                                                    </tr>

                                                    </tbody></table>
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

    equipmentInfo()
    //查询故障日志
    function equipmentInfo(){
//        alert($("#id").val());
        $.ajax({
            url:'/qryFaultLogInfo',
            type:'post',
            data:{

            }
        }).then(function (data) {
            console.log(data);
            //$("#backlogUl").empty();
            $.each(data,function (index,item) {
                var end_time_str = "";
                if(item.end_time_str==null){
                    end_time_str = "";
                }else{
                    end_time_str = item.end_time_str;
                }
                    var tr = "<tr>" +
                        "<td>"+item.start_time_str+"</td>" +
                        "<td>"+item.problem_description+"</td>" +
                        "<td>"+end_time_str+"</td>" +
                        "</tr>"
                    console.log(tr)
                    $("#gztr").append(tr);

            });
        });
    }

    loginLogQry()
    function loginLogQry(){
//        alert($("#id").val());
        $.ajax({
            url:'/loginLogQry',
            type:'post',
            data:{
            }
        }).then(function (data) {
            console.log(data);
            //$("#backlogUl").empty();
            $.each(data,function (index,item) {

                    var tr = "<tr>" +
                        "<td>"+item.login_time+"</td>" +
                        "<td>"+item.login_no+"</td>" +
                        "<td>"+item.logout_time+"</td>" +
                        "</tr>"
                    console.log(tr)
                    $("#dltr").append(tr);

            });
        });
    }
    tempAndHumLogLogQry()
    function tempAndHumLogLogQry(){
//        alert($("#id").val());
        $.ajax({
            url:'/tempAndHumLogLogQry',
            type:'post',
            data:{
            }
        }).then(function (data) {
            console.log(data);
            //$("#backlogUl").empty();
            $.each(data,function (index,item) {

                var tr = "<tr>" +
                    "<td>"+item.date+"时</td>" +
                    "<td>"+item.temp+"°C</td>" +
                    "<td>"+item.humidity+"%</td>" +
                    "</tr>"
                console.log(tr)
                $("#wstr").append(tr);

            });
        });
    }
</script>

</html>
