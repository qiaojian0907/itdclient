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
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">故障报修派单</h3>
        </div>
        <!-- Content Header (Page header) -->
        <div class="box-body">
            <form class="form-horizontal" id="info-form">
                <div class="box-body">
                    <input type="hidden" name="oper_no" value="${login_no}">
                    <input type="hidden" name="oper_name" value="${login_name}">
                    <input type="hidden" id="id" name="id" value="${id}">
                    <input type="hidden" id="status" name="status" value="1">
                    <input type="hidden" id="oper_date" name="oper_date" value="1">
                    <%--
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">工单编号</font>
                            </font>
                        </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control form-control-mid" id="repair_no" name="repair_no" value="TJ201800001" readonly="readonly">
                        </div>
                    </div>
                    --%>
                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">工单类型</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <select class="form-control select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true" id="repair_type" name="repair_type" onchange="changeRepairName()">
                                <option value="">请选择</option>
                                <option value="1001">津富高速故障报修</option>
                                <option value="1002">京津高速故障报修</option>
                                <option value="1003">京沪高速故障报修</option>
                            </select>
                        </div>
                    </div>--%>
                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">工单名称</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="repair_name" name="repair_name" placeholder="工单名称">
                        </div>
                    </div>--%>

                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">设备编号</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="equipment_no" name="equipment_no" placeholder="设备编号">
                        </div>
                    </div>--%>

                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">设备名称</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="equipment_name" name="equipment_name" placeholder="设备名称">
                        </div>
                    </div>--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">故障名称</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="repair_name" name="repair_name" value="${faultName}" disabled>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">设备名称</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="equipment_name" name="equipment_name" disabled value="${faultEquipment}">
                        </div>
                    </div>

                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">设备型号</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="equipment_model" name="equipment_model" placeholder="设备型号">
                        </div>
                    </div>--%>


                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">设备位置</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="fault_location" name="fault_location" placeholder="设备位置">
                        </div>
                    </div>--%>
                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">故障类型</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <select class="form-control select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true" id="fault_type" name="fault_type">
                                <option value="">请选择</option>
                                <option value="1">蓝屏</option>
                                <option value="2">其他</option>
                            </select>
                        </div>
                    </div>--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">故障描述</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <textarea class="form-control" rows="3" id="problem_description" name="problem_description" disabled >${problemDescription}</textarea>
                        </div>
                    </div>
                    <%--<div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">影响程度</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <select class="form-control select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true" id="incidence" name="incidence">
                                <option value="">请选择</option>
                                <option value="1">一般</option>
                                <option value="2">严重</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">紧急程度</font>
                            </font>
                        </label>
                        <div class="col-sm-5">
                            <select class="form-control select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true" id="urgency_level" name="urgency_level">
                                <option value="">请选择</option>
                                <option value="1">一级</option>
                                <option value="2">二级</option>
                                <option value="3">三级</option>
                            </select>
                        </div>
                    </div>--%>

                    <div class="form-group ">
                        <label class="col-sm-2 control-label hidden">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">下一环节</font>
                            </font>
                        </label>
                        <div class="col-sm-2 hidden">
                            <input type="text" class="form-control" value="接单" readonly="readonly">
                        </div>
                        <label class="col-sm-1 control-label">
                            <font style="vertical-align: inherit;">
                                <font style="vertical-align: inherit;">接单人</font>
                            </font>
                        </label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" id="assignee" name="assignee">
                        </div>
                        <div class="col-sm-4">
                        </div>
                    </div>
                    <div class="form-group">

                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                        </label>
                        <div class="col-sm-10">
                            <button type="button" class="btn btn-primary margin" id="submitBtn">
                                <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit;">提&nbsp;&nbsp;交</font>
                                </font>
                            </button>
                        </div>
                    </div>
                </div>
                <!-- /.box-body -->
                <%--<div class="box-footer">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                        </label>
                        <div class="col-sm-10">
                            <button type="button" class="btn btn-primary margin" id="submitBtn">
                                <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit;">提&nbsp;&nbsp;交</font>
                                </font>
                            </button>
                        </div>
                    </div>
                </div>--%>
                <!-- /.box-footer -->
            </form>
        <!-- Main content -->
        </div>
    </div>
    <!-- /.content-wrapper -->

    <!-- Control Sidebar -->



<!-- ./wrapper -->


<%--弹出页面--%>
<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" id="myModal">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">提示信息</h4>
            </div>
            <div class="modal-body">
                <p id="message_modal"></p>
            </div>
            <div class="modal-footer">
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->



</body>
<script src="static/js/jquery.form.js"></script>
<script type="text/javascript">
    /**
     * 提交保修单
     */
    $("#submitBtn").click(function(){
        $("#info-form").ajaxSubmit({//重点：使用ajaxSubmit()提交表单。
            url:"/updateFaultLogInfo",
            type:"POST", //提交的类型必需是post
            data:{},
            dateType:"json",
            success:function(data){
                //$("#message_modal").text("提交成功！工单编号"+data);
                //$('#myModal').modal('show');
                alert("提交成功！");
                window.location.href = "ITDm";
            },
            error:function(data){
                alert("提交失败！！！");
//            $("#fault").modal('show');
            }
        });
    })




    /**
     *
     * 获取当前时间
     */
    function p(s) {
        return s < 10 ? '0' + s: s;
    }

    function currentTime(){
        var myDate = new Date();
        //获取当前年
        var year=myDate.getFullYear();
        //获取当前月
        var month=myDate.getMonth()+1;
        //获取当前日
        var date=myDate.getDate();
        var h=myDate.getHours();       //获取当前小时数(0-23)
        var m=myDate.getMinutes();     //获取当前分钟数(0-59)
        var s=myDate.getSeconds();

        var now = year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
        return now;
    }

</script>

</html>
