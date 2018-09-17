<%--
  Created by IntelliJ IDEA.
  User: wangbl
  Date: 2018/5/18
  Time: 下午6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<body class="hold-transition skin-blue sidebar-mini">




        <!-- Content Header (Page header) -->
        <%--<section class="content-header">
            <h1>
                故障报修待办
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 故障报修</a></li>
                <li class="active">故障报修待办</li>
            </ol>
        </section>--%>
        <!-- Main content -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">故障报修派单</h3>
                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body">
                    <ul class="products-list product-list-in-box" id="backlogUl"></ul>
                </div>
                <!-- /.box-body -->
                <%--<div class="box-footer text-center">
                    <a href="javascript:void(0)" class="uppercase">View All Products</a>
                </div>--%>
                <!-- /.box-footer -->
            </div>
        <!--/.col (right) -->
</body>

<script type="text/javascript">
    $("#queryBackLogInfo").click(function () {
        queryBackLogInfo();
        $("#backlogQuery").show();
//            $("#equipmentDetail").empty();
    });

    equipmentInfo()
    function equipmentInfo(){
//        alert($("#id").val());
        $.ajax({
            url:'/qryFaultLogInfo',
            type:'post',
            data:{
                "status":"0"
            }
        }).then(function (data) {
            console.log(data);
            $("#backlogUl").empty();
            $.each(data,function (index,item) {
                if(item.status =="0"){
                    var li = "<li class=\"item\">"
                                +"<a href=\"javascript:void(0)\" class=\"product-title\" onclick=\"contract('"+item.id+"','"+item.fault_name+"','"+item.fault_equipment+"','"+item.problem_description+"')\">"+item.fault_name+"<span class=\"pull-right\"><i class=\"fa fa-pencil-square-o fa-2x\"></i></span></a>"
                                +"<span class=\"product-description\">故障设备："+item.fault_equipment+"</span>"
                                +"<span class=\"product-description\">故障时间："+item.start_time_str+"</span>"
                            +"</li>";
                    console.log(li)
                    $("#backlogUl").append(li);
                }
            });
        });
    }





    function contract(id,faultName,faultEquipment,problemDescription){
        var urla = "itdamr";
        //alert(actId)
        //window.open(""+urla+"?rn="+repairNo+"&pi="+procInstId+"&ti="+taskId+"&ai="+actId, "newwindow", "height=1000, width=1800, top=0,left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no,status=no");
        window.location.href = urla + "?id="+id+"&faultName="+faultName+"&faultEquipment="+faultEquipment+"&problemDescription="+problemDescription;
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


</script>

</html>
