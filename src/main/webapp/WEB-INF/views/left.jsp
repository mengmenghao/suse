<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题文档</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <!-- Bootstrap -->
    <%--引入jQuery--%>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.js"></script>
    <%--引入样式--%>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
<ul class="nav nav-pills nav-stacked">
    <li role="presentation" class="active"><a href="main" target="mainFrame">首页</a></li>
    <li role="presentation"><a href="admin" target="mainFrame">用户</a></li>
    <li role="presentation"><a href="floor" target="mainFrame">楼栋</a></li>
    <li role="presentation" class="dropdown" id="floor_table" onclick="to_page()">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">寝室<span class="caret"></span></a>
        <ul class="dropdown-menu" id="floor">
            <%--<li><a href="#">Action</a></li>
            <li role="separator" class="divider"></li>--%>
        </ul>
    </li>
</ul>
<script type="text/javascript">
    function to_page() {
        $.ajax({
            url:"${APP_PATH}/floor/getFloors",
            type:"GET",
            success:function (result) {
                //console.log(result);
                /*1、解析并显示楼栋数据*/
                build_floors_table(result);
            }
        });
    }
    function build_floors_table(result) {
        $("#floor_table ul").empty();
        var floors = result.extend.pageInfo;
        $.each(floors,function (index,item) {
            var floorNameTd = "<li>"+"<a target='mainFrame' href='dormitory?floorId="+item.floorId+"'>"+item.floorName+"</a></li>";
            //append方法执行完成以后还是返回原来的元素
            $("<ul></ul>").append(floorNameTd)
                .appendTo("#floor");
        });
    }
</script>
</body>
</html>
