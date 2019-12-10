<%--
  Created by IntelliJ IDEA.
  User: 廖孟昊
  Date: 2019/12/9
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>寝室管理</title>
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
<%
    String floorIds = request.getParameter("floorId");
    int floorId = Integer.parseInt(floorIds);
    System.out.println("宿舍ID" + floorId);
%>
<!-- 楼栋修改的模态框 -->
<div class="modal fade" id="dormitoryUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">寝室名修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">楼栋名</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="floorName_update_static"></p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">寝室名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="dormitoryName" id="dormitoryName_update_input" placeholder="dormitoryName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="dormitory_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>
<!-- 寝室添加的模态框 -->
<div class="modal fade" id="dormitoryAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">寝室添加</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">寝室名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="dormitoryName" id="dormitoryName_add_input" placeholder="dormitoryName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="dormitory_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>
<%--搭建显示页面--%>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-7">
            <h1 align="center">寝室管理</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-6">
            <button class="btn btn-primary" id="dormitory_add_modal_btn">新增</button>
            <button class="btn btn-danger" id="dormitory_delete_all_btn">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-8">
            <table class="table table-hover" id="dormitory_table">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all"/>
                    </th>
                    <th>寝室ID</th>
                    <th>寝室名</th>
                    <th>楼栋</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <%--显示分页信息--%>
    <div class="row">
        <%--分页文字信息--%>
        <div class="col-md-6" id="page_info_area">
        </div>
        <%--分页条信息--%>
        <div class="col-md-6" id="page_nav_area">
        </div>
    </div>
    <script type="text/javascript">
        var floorId=<%=floorId%>;
        var totalRecord, currentPage;

        //1.页面加载完成以后，直接去发送一个Ajax请求，要到分页数据
        $(function () {
            //去首页
            to_page(1,floorId);
        });

        function to_page(pn,floorId) {
            $.ajax({
                url: "${APP_PATH}/dormitory/getDormitory/"+floorId,
                data: "pn=" + pn,
                type: "GET",
                success: function (result) {
                    //console.log(result);
                    /*1、解析并显示楼栋数据*/
                    build_dormitory_table(result);
                    /*  2、解析显示分页信息*/
                    build_page_info(result);
                    /* 3、解析显示分页条数据*/
                    build_page_nav(result);
                }
            });
        }

        function build_dormitory_table(result) {
            //清空table表格
            $("#dormitory_table tbody").empty();
            var floors = result.extend.pageInfo.list;
            $.each(floors, function (index, item) {
                //alert(item.subscriberName);
                var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
                var dormitoryIdTd = $("<td></td>").append(item.dormitoryId);
                var dormitoryNameTd = $("<td></td>").append(item.dormitoryName);
                var floorNameTd = $("<td></td>").append(item.floor.floorName);
                var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                    .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
                //为编辑按钮添加一个自定义的属性，来表示当前楼栋ID
                editBtn.attr("edit-id", item.dormitoryId);
                var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                    .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
                //为删除按钮添加一个自定义的属性来表示当前删除的用户Id
                delBtn.attr("del-id", item.dormitoryId);
                var btnTd = $("<td></td>").append(editBtn).append("  ").append(delBtn);
                //append方法执行完成以后还是返回原来的元素
                $("<tr></tr>").append(checkBoxTd)
                    .append(dormitoryIdTd)
                    .append(dormitoryNameTd)
                    .append(floorNameTd)
                    .append(btnTd)
                    .appendTo("#dormitory_table tbody");
            });
        }

        //显示分页信息
        function build_page_info(result) {
            $("#page_info_area").empty();
            $("#page_info_area").append("当前")
                .append(result.extend.pageInfo.pageNum)
                .append("页, 总")
                .append(result.extend.pageInfo.pages)
                .append("页, 总")
                .append(result.extend.pageInfo.total)
                .append("条记录");/*+"页, 总"+"页, 总"+"条记录");*/
            totalRecord = result.extend.pageInfo.total;
            //alert(result.extend.pageInfo.total);
            currentPage = result.extend.pageInfo.pageNum;
            //alert(result.extend.pageInfo.pageNum);
        }

        //解析显示分页
        function build_page_nav(result) {
            //page_nav_area
            $("#page_nav_area").empty();
            var ul = $("<ul></ul>").addClass("pagination");

            //构建元素
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
            var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
            if (result.extend.pageInfo.hasPreviousPage == false) {
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            } else {
                //为元素添加点击翻页的事件
                firstPageLi.click(function () {
                    to_page(1,floorId);
                });
                prePageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum - 1,floorId);
                });
            }

            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
            if (result.extend.pageInfo.hasNextPage == false) {
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            } else {
                nextPageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum + 1,floorId);
                });
                lastPageLi.click(function () {
                    to_page(result.extend.pageInfo.pages,floorId);
                });
            }

            //添加首页和前一页的提示
            ul.append(firstPageLi).append(prePageLi);
            //1,2,3遍历给ul添加页码提示
            $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {

                var numLi = $("<li></li>").append($("<a></a>").append(item));
                if (result.extend.pageInfo.pageNum == item) {
                    numLi.addClass("active");
                }
                numLi.click(function () {
                    to_page(item,floorId);
                });
                ul.append(numLi);
            });
            //添加后一页和末页的提示
            ul.append(nextPageLi).append(lastPageLi);

            //把ul加入到nav
            var navEle = $("<nav></nav>").append(ul);
            navEle.appendTo("#page_nav_area");
        }
        //清空表单样式及内容
        function reset_from(ele){
            $(ele)[0].reset();
            //清空表单样式
            $(ele).find("*").removeClass("has-error has-success");
            $(ele).find(".help-block").text("");
        }
        //点击新增按钮弹出模态框
        $("#dormitory_add_modal_btn").click(function () {
            //清除表单数据(表单完整重置（表单的数据，表单的样式）)
            reset_from("#dormitoryAddModal form");
            //弹出模态框
            $("#dormitoryAddModal").modal({
                backdrop:"static"
            });
        });
        //显示校验结果的提示信息
        function show_validate_msg(ele,status,msg){
            //清除当前元素的校验状态
            $(ele).parent().removeClass("has-success has-error");
            $(ele).next("span").text("");
            if ("success" == status){
                $(ele).parent().addClass("has-success");
                $(ele).next("span").text(msg);
            }else if("error" == status){
                $(ele).parent().addClass("has-error");
                $(ele).next("span").text(msg);
            }
        }
        $("#dormitoryName_add_input").change(function () {
            //发送Ajax请求校验用户名是否可用
            var dormitoryName=this.value;
            $.ajax({
                url:"${APP_PATH}/dormitory/checkDormitoryName",
                data:{
                    "dormitoryName":dormitoryName,
                    "floorId":floorId
                },
                type:"POST",
                success:function (result) {
                    if (result.code==100){
                        show_validate_msg("#dormitoryName_add_input","success","用户名可用");
                        $("#dormitory_save_btn").attr("ajax-va","success");
                    }else {
                        show_validate_msg("#dormitoryName_add_input","error",result.extend.va_msg);
                        $("#dormitory_save_btn").attr("ajax-va","error");
                    }
                }
            });
        });
        //点击保存，保存楼栋
        $("#dormitory_save_btn").click(function () {
            //1、模态框中填写的表单数据提交个服务器进行保存
            //1、判断之前的Ajax用户名校验是否成功。如果成功往下继续
            if ($(this).attr("ajax-va")=="error"){
                return  false;
            }
            var dormitoryName=$("#dormitoryName_add_input").val();
            $.ajax({
                url:'${APP_PATH}/dormitory/saveDormitory',
                type:"POST",
                data:{
                    "dormitoryName":dormitoryName,
                    "floorId":floorId
                },
                success:function (result) {
                    //alert(result.msg);
                    if (result.code == 100){
                        //1、关闭模态框
                        $("#dormitoryAddModal").modal('hide');
                        //2、来到最后一页，显示刚才保存的数据
                        to_page(totalRecord,floorId);
                    }else {
                        //显示失败信息
                        //console.log();
                        //有哪个字段的错误信息就显示哪个字段
                        if (undefined != result.extend.errorFields.dormitoryName){
                            show_validate_msg("#dormitoryName_add_input","error",result.extend.errorFields.dormitoryName);
                        }
                    }
                }
            });
        });
        //1、我们是按钮创建之前就绑定了click，所以绑定不上
        //1）、可以在创建按钮的时候绑定. 2）、绑定点击.live()
        //jQuery新版没有live，使用on进行替代
        $(document).on("click",".edit_btn",function () {
            //alert("edit");
            //1、查出寝室信息，并显示
            getDormitory($(this).attr("edit-id"));
            //3、把用户的id传递给模态框的更新按钮
            $("#dormitory_update_btn").attr("edit-id",$(this).attr("edit-id"));
            $("#dormitoryUpdateModal").modal({
                backdrop:"static"
            });
        });

        /**
         * 根据ID查询寝室信息
         * @param dormitoryId
         */
        function getDormitory(dormitoryId) {
            //$("#dormitory_update_select").empty();
            $.ajax({
                url:"${APP_PATH}/dormitory/getUpdateDormitory/"+dormitoryId,
                type:"GET",
                success:function (result) {
                    //console.log(result);
                    var dormitoryData = result.extend.dormitory;
                    $("#floorName_update_static").text(dormitoryData.floor.floorName);
                    $("#dormitoryName_update_input").val(dormitoryData.dormitoryName);
                }
            });
        }

        /**
         * 检查修改后的寝室名是否可用
         */
        $("#dormitoryName_update_input").change(function () {
            //发送Ajax请求校验用户名是否可用
            var dormitoryName=this.value;
            $.ajax({
                url:"${APP_PATH}/dormitory/checkDormitoryName",
                data:{
                    "dormitoryName":dormitoryName,
                    "floorId":floorId
                },
                type:"POST",
                success:function (result) {
                    if (result.code==100){
                        show_validate_msg("#dormitoryName_update_input","success","寝室名可用");
                        $("#dormitory_save_btn").attr("ajax-va","success");
                    }else {
                        show_validate_msg("#dormitoryName_update_input","error",result.extend.va_msg);
                        $("#dormitory_save_btn").attr("ajax-va","error");
                    }
                }
            });
        });
        //点击更新，更新楼栋信息
        $("#dormitory_update_btn").click(function () {
            //验证楼栋是否可用
            if ($(this).attr("ajax-va")=="error"){
                return  false;
            }
            var dormitoryName=$("#dormitoryName_update_input").val();
            //2、发送Ajax请求保存更新的用户数据
            $.ajax({
                url:"${APP_PATH}/dormitory/updateDormitory/"+$(this).attr("edit-id"),
                type:"PUT",
                data:"dormitoryName="+dormitoryName,

                success:function (result) {
                    if (result.code == 100){
                        //1、关闭模态框
                        $("#dormitoryUpdateModal").modal('hide');
                        //2、来到最后一页，显示刚才保存的数据
                        to_page(currentPage,floorId);
                    }else {
                        //显示失败信息
                        //console.log();
                        //有哪个字段的错误信息就显示哪个字段
                        if (undefined != result.extend.errorFields.floorName){
                            show_validate_msg("#dormitoryName_updata_input","error",result.extend.errorFields.floorName);
                        }
                    }
                }
            });
        });
        /**
         * 单个删除
         */
        $(document).on("click",".delete_btn",function () {
            //1、弹出确认删除对话框
            var dormitoryName = $(this).parents("tr").find("td:eq(2)").text();
            var dormitoryId = $(this).attr("del-id");
            //alert($(this).parents("tr").find("td:eq(1)").text());
            if (confirm("确认删除【"+dormitoryName+"】吗？")){
                //确认，发送Ajax请求删除即可
                $.ajax({
                    url:"${APP_PATH}/dormitory/deleteDormitory/"+dormitoryId,
                    type:"DELETE",
                    success:function (result) {
                        alert(result.msg);
                        //回到本页
                        to_page(currentPage,floorId);
                    }
                });
            }
        });
        //完成全选/全不选功能
        $("#check_all").click(function () {
            //attr获取checked时undefined
            //我们这些dom原生的属性；attr获取自定义属性的值
            //prop修改和读取dom原生属性的值
            //alert($(this).prop("checked"));
            $(this).prop("checked");
            $(".check_item").prop("checked",$(this).prop("checked"));
        });
        //check_item
        $(document).on("click",".check_item",function () {
            //判断当前选中的元素是否是5个
            var flag = $(".check_item:checked").length==$(".check_item").length;
            $("#check_all").prop("checked",flag);
        });
        //点击全部删除就批量删除
        $("#dormitory_delete_all_btn").click(function () {
            var dormitoryName = "";
            var del_dormitoryIdstr = "";
            alert($(this).parents("tr").find("td:eq(1)").text());
            $.each($(".check_item:checked"),function () {
                //this
                dormitoryName += $(this).parents("tr").find("td:eq(2)").text()+",";
                //组装用户id字符串
                del_dormitoryIdstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
            });
            //去除subscriberName多余的,
            dormitoryName = dormitoryName.substring(0,dormitoryName.length-1);
            //去除删除用户Id的短横线‘-"
            del_dormitoryIdstr = del_dormitoryIdstr.substring(0,del_dormitoryIdstr.length-1);
            if (confirm("确认删除【"+dormitoryName+"】吗")){
                //发送Ajax请求删除
                $.ajax({
                    url:"${APP_PATH}/dormitory/deleteDormitory/"+del_dormitoryIdstr,
                    type:"DELETE",
                    success:function (result) {
                        alert(result.msg);
                        to_page(currentPage,floorId);

                    }
                });
            }
        });
    </script>
</body>
</html>