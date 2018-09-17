<%--
  Created by IntelliJ IDEA.
  User: wangbl
  Date: 2017/12/13
  Time: 下午1:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 新增加部分 -->
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="static/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="static/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="static/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="static/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="static/skins/_all-skins.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="static/skins/_all-skins.min.css">
<!-- Morris chart -->
<link rel="stylesheet" href="static/morris.js/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="static/jvectormap/jquery-jvectormap.css">
<!-- Date Picker -->
<link rel="stylesheet" href="static/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="static/bootstrap-daterangepicker/daterangepicker.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/jstree/css/style.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/dataTables.tableTools.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/my.css">

<script language="javascript" src="${pageContext.request.contextPath}/static/jquery/jquery-1.12.4.min.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/js/jquery.base64.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="static/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="static/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="static/raphael/raphael.min.js"></script>
<script src="static/morris.js/morris.min.js"></script>
<!-- Sparkline -->
<script src="static/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="static/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="static/moment/min/moment.min.js"></script>
<script src="static/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="static/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="static/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="static/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="static/dist/js/adminlte.min.js"></script>

<!-- AdminLTE for demo purposes -->
<script src="static/dist/js/demo.js"></script>

<!-- AdminLTE for demo purposes -->
<script src="static/dist/js/demo.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/js/html5shiv.min.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/jstree/js/jstree.min.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/js/respond.min.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>

<link rel="stylesheet" href="static/css/jquery.bigautocomplete.css">
<script src="static/js/jquery.bigautocomplete.js"></script>
<!-- highcharts -->
<script src="static/highcharts/highcharts.js"></script>



<!-- 新增加部分 -->
<!-- Bootstrap 3.3.7 -->
<%--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" >
<!-- Font Awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.4.3/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="http://adminlte.la998.com/dist/css/skins/_all-skins.min.css">
<!-- Morris chart -->
<link href="http://adminlte.la998.com/plugins/morris/morris.css" rel="stylesheet" >
<!-- jvectormap -->
<link href="http://adminlte.la998.com/plugins/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet">
<!-- Date Picker -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap-datepicker/1.8.0/css/bootstrap-datepicker.min.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="http://adminlte.la998.com/plugins/daterangepicker/daterangepicker.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="http://adminlte.la998.com/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap-datetimepicker.min.css">
<!-- jstree -->
<link href="https://cdn.bootcss.com/jstree/3.3.5/themes/default/style.min.css" rel="stylesheet">

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/my.css">

<script language="javascript" src="http://adminlte.la998.com/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="https://cdn.bootcss.com/Base64/1.0.1/base64.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="http://adminlte.la998.com/dist/js/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="http://adminlte.la998.com/dist/js/raphael-min.js"></script>
<script src="http://adminlte.la998.com/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="http://adminlte.la998.com/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="http://adminlte.la998.com/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="http://adminlte.la998.com/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="http://adminlte.la998.com/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="http://adminlte.la998.com/dist/js/moment.min.js"></script>
<script src="http://adminlte.la998.com/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="https://cdn.bootcss.com/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="http://adminlte.la998.com/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="http://adminlte.la998.com/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="http://adminlte.la998.com/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.4.3/js/adminlte.js"></script>

<!-- AdminLTE for demo purposes -->
<script src="http://adminlte.la998.com/dist/js/demo.js"></script>


<script src="https://cdn.bootcss.com/html5shiv/r29/html5.min.js"></script>
<script src="https://cdn.bootcss.com/jstree/3.3.5/jstree.min.js"></script>
<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>--%>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>


<link rel="stylesheet" href="static/css/jquery.bigautocomplete.css">
<script src="static/js/jquery.bigautocomplete.js"></script>
<!-- highcharts -->
<%--<script src="http://code.highcharts.com/highcharts.js"></script>--%>


