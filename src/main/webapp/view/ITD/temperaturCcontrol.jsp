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
                        <div class="widget-user-header bg-red">
                            <div class="widget-user-image">

                            </div>
                            <!-- /.widget-user-image -->
                            <h3 class="widget-user-username">温控</h3>
                            <h5 class="widget-user-desc">Lead Developer</h5>
                        </div>
                        <div class="box-footer no-padding" align="center" style="height: 350px">
                            <dl>
                                <h4>散热</h4><br>
                                <div class="form-group">
                                    <label>
                                        <input type="radio" name="r1" class="minimal" checked>
                                        开启
                                    </label>
                                    <label>
                                        <input type="radio" name="r1" class="minimal">
                                        关闭
                                    </label>
                                    <label>
                                        <input type="radio" name="r1" class="minimal">
                                        自动
                                    </label>
                                </div><br><br>
                                <h4>加热</h4><br>
                                <div class="form-group">
                                    <label>
                                        <input type="radio" name="r2" class="minimal" checked>
                                        开启
                                    </label>
                                    <label>
                                        <input type="radio" name="r2" class="minimal">
                                        关闭
                                    </label>
                                    <label>
                                        <input type="radio" name="r2" class="minimal">
                                        自动
                                    </label>
                                </div>
                            </dl>
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
</script>

</html>
