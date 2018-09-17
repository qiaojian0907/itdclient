<%--
  Created by IntelliJ IDEA.
  User: liuxiao
  Date: 2018/6/14
  Time: 下午14:18
  To change this template use File | Settings | File Templates.
--%>
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
<!-- Content Wrapper. Contains page content -->
    <!-- Content Header (Page header) -->
    <!-- Main content -->
        <div class="box box-primary">
            <div class="box-header with-border">
                <h3 class="box-title">故障报修接单</h3>

                <div class="box-tools pull-right">
                    <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                    </button>
                </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <dl class="dl-horizontal" id="box-body-dl">
                </dl>
                <div class="form-group">
                    <label class="col-sm-2 control-label">
                    </label>
                    <div class="col-sm-10">
                        <button type="button" class="btn btn-primary" id="submitBtn">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">接&nbsp;&nbsp;单</font>
                            </font>
                        </button>
                    </div>
                </div>
            </div>
            <!-- /.box-body -->
            <%--<div class="box-footer text-center">
                <a href="javascript:void(0)" class="uppercase">View All Products</a>
            </div>--%>
            <!-- /.box-footer -->
        </div>
        <!-- Horizontal Form -->
<!-- ./wrapper -->
<!-- /.modal -->

<input type="hidden" id="id" value="${id}">

</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
   // alert($("#repairNo").val()+"&"+$("#procId").val()+"&"+$("#taskId").val()+"&"+$("#actId").val());

    $(function(){
        var id = $("#id").val();
        getRepairInfo();
    })



    function getRepairInfo(){
        $.ajax({
            url: "/qryFaultLogInfo",
            type: 'POST',
            data: {"id":$("#id").val()},
            error: function(data){
                if(data.status=="404")
                {
                    alert( "文件不存在!");
                }else if (data.status=="500")
                {
                    alert("文件编译错误!");
                }else{
                    alert("系统错误!");
                }
            },
            success: function(data){
                console.log("aaa==="+data);
                //$("#box-body-dl").empty();
                   /*"<dt>工单编号</dt><dd>"+data[0].repair_no+"</dd>" +
                            "<dt>工单类型</dt><dd>"+data[0].repair_type+"</dd>" +
                            "<dt>工单名称</dt><dd>"+data[0].repair_name+"</dd>" +
                            "<dt>登记人员</dt><dd>"+data[0].oper_name+"</dd>" +
                            "<dt>登记时间</dt><dd>"+data[0].operDate+"</dd>" +
                            "<dt>设备编号</dt><dd>"+data[0].equipment_no+"</dd>" +
                            "<dt>设备名称</dt><dd>"+data[0].equipment_name+"</dd>" +
                            "<dt>设备类型</dt><dd>"+data[0].equipment_type+"</dd>" +
                            "<dt>设备型号</dt><dd>"+data[0].equipment_model+"</dd>" +
                            "<dt>设备位置</dt><dd>"+data[0].fault_location+"</dd>" +
                            "<dt>故障类型</dt><dd>"+data[0].fault_type+"</dd>" +
                            "<dt>故障描述</dt><dd>"+data[0].problem_description+"</dd>" +
                            "<dt>影响程度</dt><dd>"+data[0].incidence+"</dd>" +
                            "<dt>紧急程度</dt><dd>"+data[0].urgency_level+"</dd>"*/
                 /*"<p><strong>工单编号:</strong>&nbsp;&nbsp;"+data[0].repair_no+"</p>" +*/
                var dl = "<p><strong>故障信息名称:</strong>&nbsp;&nbsp;"+data[0].fault_name+"</p>" +
                        "<p><strong>派单人员:</strong>&nbsp;&nbsp;"+data[0].oper_name+"</p>" +
                        "<p><strong>派单时间:</strong>&nbsp;&nbsp;"+data[0].oper_date+"</p>" +

                        "<p><strong>设备名称:</strong>&nbsp;&nbsp;"+data[0].fault_equipment+"</p>" +

                        "<p><strong>故障描述:</strong>&nbsp;&nbsp;"+data[0].problem_description+"</p>" ;
                $("#box-body-dl").append(dl);
            }
        });
    }



    Date.prototype.format = function(format) {
        var date = {
            "M+": this.getMonth() + 1,
            "d+": this.getDate(),
            "h+": this.getHours(),
            "m+": this.getMinutes(),
            "s+": this.getSeconds(),
            "q+": Math.floor((this.getMonth() + 3) / 3),
            "S+": this.getMilliseconds()
        };
        if (/(y+)/i.test(format)) {
            format = format.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
        }
        for (var k in date) {
            if (new RegExp("(" + k + ")").test(format)) {
                format = format.replace(RegExp.$1, RegExp.$1.length == 1
                    ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
            }
        }
        return format;
    }



    $("#submitBtn").click(function(){
        $.ajax({
            url: "/updateFaultLogInfo",
            type: 'POST',
            data: {"id":$("#id").val(),
                "status":"2",
                "recept_time":"1",
            },
            error: function(data){
                if(data.status=="404")
                {
                    alert( "文件不存在!");
                }else if (data.status=="500")
                {
                    alert("文件编译错误!");
                }else{
                    alert("系统错误!");
                }
            },
            success: function(data){
                console.log(data);
                    alert("提交成功");
                    window.location.href = "itdrbq";
            }
        });
    })








</script>

</html>
