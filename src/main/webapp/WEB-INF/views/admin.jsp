<%--
  Created by IntelliJ IDEA.
  User: 廖孟昊
  Date: 2019/11/21
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成员列表</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
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
    <%--用户修改模态框--%>
    <div class="modal fade" id="emfUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document" id="modal-recharge">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">用户修改</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="contentForm">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-10">
                                <p class="form-control-static" id="SubscriberName_update_static"></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" name="SubscriberPassword" id="SubscriberPassword_update_input" placeholder="123456">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户级别</label>
                            <div class="col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission1_update_input" value="1" checked="checked"> 普通用户
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission2_update_input" value="2"> 宿管
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission3_update_input" value="3"> 管理员
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">所在楼栋</label>
                            <div class="col-sm-4">
                                <%--楼栋提交楼栋ID即可--%>
                                <select class="form-control" name="floorId" id="floor_update_select">
                                </select>
                            </div>
                            <label class="col-sm-2 control-label">所在寝室</label>
                            <div class="col-sm-4">
                                <%--寝室提交寝室ID即可--%>
                                <select class="form-control" name="dormitoryId" id="dormitory_update_select">

                                </select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="emf_update_btn">更新</button>
                </div>
            </div>
        </div>
    </div>
    <!-- 用户添加的模态框 -->
    <div class="modal fade" id="emfAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">用户添加</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="SubscriberName" id="SubscriberName_add_input" placeholder="SubscriberName">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" name="SubscriberPassword" id="SubscriberPassword_add_input" placeholder="123456">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户级别</label>
                            <div class="col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission1_add_input" value="1" checked="checked"> 普通用户
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission2_add_input" value="2"> 宿管
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="subscriberPermission" id="subscriberPermission3_add_input" value="3"> 管理员
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">所在楼栋</label>
                            <div class="col-sm-4">
                                <%--楼栋提交楼栋ID即可--%>
                                <select class="form-control" name="floorId" id="floor_add_select">
                                </select>
                            </div>
                            <label class="col-sm-2 control-label">所在寝室</label>
                            <div class="col-sm-4">
                                <%--寝室提交寝室ID即可--%>
                                <select class="form-control" name="dormitoryId" id="dormitory_add_select">

                                </select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="emf_save_btn">保存</button>
                </div>
            </div>
        </div>
    </div>

    <%--搭建显示页面--%>
    <div class="container">
        <%--标题--%>
        <div class="row">
            <div class="col-md-12">
                <h1 align="center">用户管理</h1>
            </div>
        </div>
        <%--按钮--%>
        <div class="row">
            <div class="col-md-4 col-md-offset-10">
                <button class="btn btn-primary" id="emf_add_modal_btn">新增</button>
                <button class="btn btn-danger" id="emf_delete_all_btn">删除</button>
            </div>
        </div>
        <%--显示表格数据--%>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover" id="emfs_table">
                    <thead>
                        <tr>
                            <th>
                                <input type="checkbox" id="check_all"/>
                            </th>
                            <th>#</th>
                            <th>用户名</th>
                            <th>用户级别</th>
                            <th>宿舍楼栋</th>
                            <th>宿舍房间</th>
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

    </div>
    <script type="text/javascript">

        var  totalRecord,currentPage;
        //1.页面加载完成以后，直接去发送一个Ajax请求，要到分页数据
        $(function(){
            //去首页
           to_page(1);
        });
        function to_page(pn) {
            $.ajax({
                url:"${APP_PATH}/loginController/emfs",
                data:"pn="+pn,
                type:"GET",
                success:function (result) {
                    //console.log(result);
                    /*1、解析并显示员工数据*/
                    build_emfs_table(result);
                    /*  2、解析显示分页信息*/
                    build_page_info(result);
                    /* 3、解析显示分页条数据*/
                    build_page_nav(result);
                }
            });
        }
        function build_emfs_table(result) {
            //清空table表格
            $("#emfs_table tbody").empty();
            var emfs = result.extend.pageInfo.list;
            $.each(emfs,function (index,item) {
                //alert(item.subscriberName);
                var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
                var subscriberIdTd = $("<td></td>").append(item.subscriberId);
                var subscriberNameTd = $("<td></td>").append(item.subscriberName);
                var subscriberPermissionTd = $("<td></td>").append(item.subscriberPermission);
                var dormitoryNameTd = $("<td></td>").append(item.dormitory.dormitoryName);
                var floorNameTd = $("<td></td>").append(item.dormitory.floor.floorName);
                var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                    .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
                //为编辑按钮添加一个自定义的属性，来表示当前用户ID
                editBtn.attr("edit-id",item.subscriberId);
                editBtn.attr("edit-dormitoryId",item.dormitory.dormitoryId);
                editBtn.attr("edit-floorId",item.dormitory.floor.floorId)
                var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                    .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
                //为删除按钮添加一个自定义的属性来表示当前删除的用户Id
                delBtn.attr("del-id",item.subscriberId);
                var btnTd = $("<td></td>").append(editBtn).append("  ").append(delBtn);
                //append方法执行完成以后还是返回原来的元素
                $("<tr></tr>").append(checkBoxTd)
                    .append(subscriberIdTd)
                    .append(subscriberNameTd)
                    .append(subscriberPermissionTd)
                    .append(floorNameTd)
                    .append(dormitoryNameTd)
                    .append(btnTd)
                    .appendTo("#emfs_table tbody");
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
            currentPage = result.extend.pageInfo.pageNum;
        }
        //解析显示分页
        function build_page_nav(result) {
            //page_nav_area
            $("#page_nav_area").empty();
            var ul = $("<ul></ul>").addClass("pagination");

            //构建元素
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
            var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
            if (result.extend.pageInfo.hasPreviousPage == false){
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            }else{
                //为元素添加点击翻页的事件
                firstPageLi.click(function () {
                    to_page(1);
                });
                prePageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum -1);
                });
            }

            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
            if (result.extend.pageInfo.hasNextPage == false){
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            }else {
                nextPageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum +1);
                });
                lastPageLi.click(function () {
                    to_page(result.extend.pageInfo.pages);
                });
            }

            //添加首页和前一页的提示
            ul.append(firstPageLi).append(prePageLi);
            //1,2,3遍历给ul添加页码提示
            $.each(result.extend.pageInfo.navigatepageNums,function (index,item) {

                var numLi =$("<li></li>").append($("<a></a>").append(item));
                if (result.extend.pageInfo.pageNum == item){
                    numLi.addClass("active");
                }
                numLi.click(function () {
                    to_page(item);
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
        $("#emf_add_modal_btn").click(function () {
            //清除表单数据(表单完整重置（表单的数据，表单的样式）)
            reset_from("#emfAddModal form");
            //发送Ajax请求，查出部门信息，显示在下拉列表中
            getDepts("#floor_add_select","#dormitory_add_select");
            selectDormitory("#dormitory_add_select","#floor_add_select");
            //弹出模态框
            $("#emfAddModal").modal({
                backdrop:"static"
            });
        });
        //查出所有的楼栋信息并显示在下拉列表中
        function getDepts(ele,eles) {
            $(ele).empty();
            //$(eles).empty();
            $.ajax({
                url:'${APP_PATH}/dormitory/getFloor',
                type:"GET",
                success:function (result) {
                    if(ele=="#floor_add_select"){
                        var optionEle2 = $("<option></option>").append("----请选择----").attr("value",0);
                        optionEle2.appendTo(ele);
                    }
                    if(eles=="#dormitory_add_select"){
                        var optionEle2 = $("<option></option>").append("----请选择----").attr("value",0);
                        optionEle2.appendTo(eles);
                    }
                    //console.log(result);
                    //显示部门信息在下拉列表中 dormitory_add_select
                    //$("#dormitory_add_select").append("")
                    $.each(result.extend.floor,function () {
                        var optionEle1 = $("<option></option>").append(this.floorName).attr("value", this.floorId);
                        optionEle1.appendTo(ele);
                    });
                }
            });
        }
        //查询寝室
        function selectDormitory(ele,eles) {
            $(ele).empty();
            $(eles).change(function () {
                $(ele).empty();
                var floorId=$(eles).val();
                if (floorId==0){
                    return false;
                }
                $.ajax({
                    url:"${APP_PATH}/dormitory/getDormitory",
                    data:"floorId="+floorId,
                    type:"GET",
                    success:function (result) {
                        //console.log(result);
                        // var optionEle2 = $("<option></option>").append("----请选择----").attr("value", 0);
                        // optionEle2.appendTo("#dormitory_add_select");
                        $.each(result.extend.dormitory,function () {
                            var optionEle1 = $("<option></option>").append(this.dormitoryName).attr("value", this.dormitoryId);
                            optionEle1.appendTo(ele);
                        });
                    }
                });
            })

        }
        //校验表单数据
        function validate_add_from(){
            //1、拿到要校验的数据，使用正则表达式
            var subscriberName = $("#SubscriberName_add_input").val();
            var regName = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
            if(!regName.test(subscriberName)){
                //alert("用户名可以是2-5位中文或者4-16位英文、数字、下划线");
                show_validate_msg("#SubscriberName_add_input","error","用户名可以是2-5位中文或者4-16位英文、数字、下划线");
                /*$("#SubscriberName_add_input").parent().addClass("has-error");
                $("#SubscriberName_add_input").next("span").text("用户名可以是2-5位中文或者4-16位英文、数字、下划线");*/
                return false;
            }else {
                show_validate_msg("#SubscriberName_add_input","success","");
                /*$("#SubscriberName_add_input").parent().addClass("has-success");
                $("#SubscriberName_add_input").next("span").text("");*/
            }
            //2、校验密码信息
            var subscriberPassword = $("#SubscriberPassword_add_input").val();
            var regPassword = /^[a-z0-9_-]{6,18}$/;
            if (!regPassword.test(subscriberPassword)){
                //alert("密码是6-18位英文、数字、下划线");
                show_validate_msg("#SubscriberPassword_add_input","error","密码是6-18位英文、数字、下划线");
                /*$("#SubscriberPassword_add_input").parent().addClass("has-error");
                $("#SubscriberPassword_add_input").next("span").text("密码是6-18位英文、数字、下划线");*/
                return false;
            }else{
                show_validate_msg("#SubscriberPassword_add_input","success","");
                /*$("#SubscriberPassword_add_input").parent().addClass("has-success");
                $("#SubscriberPassword_add_input").next("span").text("");*/
            }
            return true;
        }
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
        $("#SubscriberName_add_input").change(function () {
            //发送Ajax请求校验用户名是否可用
            var subscriberName=this.value;
            $.ajax({
                url:"${APP_PATH}/loginController/checkUser",
                data:"subscriberName="+subscriberName,
                type:"POST",
                success:function (result) {
                    if (result.code==100){
                        show_validate_msg("#SubscriberName_add_input","success","用户名可用");
                        $("#emf_save_btn").attr("ajax-va","success");
                    }else {
                        show_validate_msg("#SubscriberName_add_input","error",result.extend.va_msg);
                        $("#emf_save_btn").attr("ajax-va","error");
                    }
                }
            });
        });
        //点击保存，保存用户
        $("#emf_save_btn").click(function () {
            //1、模态框中填写的表单数据提交个服务器进行保存
            //1、先对提交给服务器的数据进行校验
            var floorId=$("#floor_add_select").val();
            if(!validate_add_from()){
                return false;
            };
            //1、判断之前的Ajax用户名校验是否成功。如果成功往下继续
            if ($(this).attr("ajax-va")=="error"){
                return  false;
            }
            if (floorId==0){
                return false;
            }
            //2、发送Ajax请求保存用户

            $.ajax({
                url:'${APP_PATH}/loginController/emf',
                type:"POST",
                data:$("#emfAddModal form").serialize(),
                success:function (result) {
                    //alert(result.msg);
                    if (result.code == 100){
                        //1、关闭模态框
                        $("#emfAddModal").modal('hide');
                        //2、来到最后一页，显示刚才保存的数据
                        to_page(totalRecord);
                    }else {
                        //显示失败信息
                        //console.log();
                        //有哪个字段的错误信息就显示哪个字段
                        if (undefined != result.extend.errorFields.subscriberName){
                            show_validate_msg("#SubscriberName_add_input","error",result.extend.errorFields.subscriberName);
                        }
                        if (undefined != result.extend.errorFields.subscriberPassword){
                            show_validate_msg("#SubscriberPassword_add_input","error",result.extend.errorFields.subscriberPassword);
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
            //0、查出用户信息，显示用户信息

            //1、查出楼栋信息，并显示楼栋列表
            getFloor("#floor_update_select","#dormitory_update_select");
            //updateDormitory("#dormitory_update_select","#floor_update_select",$(this).attr("edit-floorId"));
            //updateDormitory("#dormitory_update_select",floorId);
            //2、查询用户信息
            getSubscriber($(this).attr("edit-id"));
            getSubscribers($(this).attr("edit-id"));

            //3、把用户的id传递给模态框的更新按钮
            $("#emf_update_btn").attr("edit-id",$(this).attr("edit-id"));
            $("#emfUpdateModal").modal({
                backdrop:"static"
            });
        });
        function getSubscriber(subscriberId) {
            $("#dormitory_update_select").empty();
            $.ajax({
                url:"${APP_PATH}/loginController/getSubscriber/"+subscriberId,
                type:"GET",
                success:function (result) {
                    //console.log(result);
                    var subscriberData = result.extend.subscriber;
                    $("#emfUpdateModal select[name=floorId]").val([subscriberData.dormitory.floorId]);
                    updateDormitory("#dormitory_update_select","#floor_update_select",subscriberData.dormitory.floorId);
                    $("#SubscriberName_update_static").text(subscriberData.subscriberName);
                    $("#SubscriberPassword_update_input").val(subscriberData.subscriberPassword);
                    $("#emfUpdateModal input[name=subscriberPermission]").val([subscriberData.subscriberPermission]);
                    $("#dormitory_update_select").val([subscriberData.dormitoryId]);
                    //getSubscribers(subscriberId);
                }
            });
        }
        function getSubscribers(subscriberId) {
            $.ajax({
                url:"${APP_PATH}/loginController/getSubscriber/"+subscriberId,
                type:"GET",
                success:function (result) {
                    //console.log(result);
                    var subscriberData = result.extend.subscriber;
                    $("#emfUpdateModal select[name=dormitoryId]").val([subscriberData.dormitoryId]);
                    //getSubscribers($(this).attr("edit-id"));
                }
            });
        }
        //修改用户时对楼栋查询
        function getFloor(ele,eles) {
            $(ele).empty();
            $(eles).empty();
            $.ajax({
                url:'${APP_PATH}/dormitory/getFloor',
                type:"POST",
                success:function (result) {
                    //console.log(result);
                    //显示部门信息在下拉列表中 dormitory_add_select
                    //$("#dormitory_add_select").append("")
                    $.each(result.extend.floor,function () {
                        var optionEle1 = $("<option></option>").append(this.floorName).attr("value", this.floorId);
                        optionEle1.appendTo(ele);

                    });
                }
            });
        }
        //修改用户时对寝室查询
        function updateDormitory(ele,eles,floorId) {
            $(ele).empty();
            $(eles).change(function () {
                $(ele).empty();
                var floorId=$(eles).val();
                if (floorId==0){
                    return false;
                }
                $.ajax({
                    url:"${APP_PATH}/dormitory/getDormitory",
                    data:"floorId="+floorId,
                    type:"GET",
                    success:function (result) {
                        //console.log(result);
                        $(ele).empty();
                        // var optionEle2 = $("<option></option>").append("----请选择----").attr("value", 0);
                        // optionEle2.appendTo("#dormitory_add_select");
                        $.each(result.extend.dormitory,function () {
                            var optionEle1 = $("<option></option>").append(this.dormitoryName).attr("value", this.dormitoryId);
                            optionEle1.appendTo(ele);
                        });
                    }
                });
                return false;
            })
            $(ele).empty();
            $.ajax({
                url:"${APP_PATH}/dormitory/getDormitories/"+floorId,
                type:"GET",
                success:function (result) {
                    //console.log(result);
                    // var optionEle2 = $("<option></option>").append("----请选择----").attr("value", 0);
                    // optionEle2.appendTo("#dormitory_add_select");
                    $.each(result.extend.dormitory,function () {
                        var optionEle1 = $("<option></option>").append(this.dormitoryName).attr("value", this.dormitoryId);
                        optionEle1.appendTo(ele);
                    });
                }
            });
        }
        //清除模态框数据
        $('#emfUpdateModal').on('hidden.bs.modal', function (){
            document.getElementById("contentForm").reset();
        });
        //点击更新，更新用户信息
        $("#emf_update_btn").click(function () {
            //验证密码是否合法
            var subscriberPassword = $("#SubscriberPassword_update_input").val();
            var regPassword = /^[a-zA-Z0-9_-]{6,18}$/;
            if (!regPassword.test(subscriberPassword)){
                //alert("密码是6-18位英文、数字、下划线");
                show_validate_msg("#SubscriberPassword_update_input","error","密码是6-18位英文、数字、下划线");
                return false;
            }else{
                show_validate_msg("#SubscriberPassword_update_input","success","");
            }
            //2、发送Ajax请求保存更新的用户数据
            $.ajax({
                url:"${APP_PATH}/subscriber/saveSubscriber/"+$(this).attr("edit-id"),
                type:"PUT",
                data:$("#emfUpdateModal form").serialize(),
                success:function (result) {
                    //alert(result.msg);
                    //1、关闭对话框
                    $("#emfUpdateModal").modal("hide");
                    // 2、回到本页面
                    to_page(currentPage);
                }
            });
        });
        /**
         * 单个删除
         */
        $(document).on("click",".delete_btn",function () {
            //1、弹出确认删除对话框
            var subscriberName = $(this).parents("tr").find("td:eq(2)").text();
            var subscriberId = $(this).attr("del-id");
            //alert($(this).parents("tr").find("td:eq(1)").text());
            if (confirm("确认删除【"+subscriberName+"】吗？")){
                //确认，发送Ajax请求删除即可
                $.ajax({
                    url:"${APP_PATH}/subscriber/deleteSubscriber/"+subscriberId,
                    type:"DELETE",
                    success:function (result) {
                        alert(result.msg);
                        //回到本页
                        to_page(currentPage);
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
        $("#emf_delete_all_btn").click(function () {
            var subscriberName = "";
            var del_subscriberIdstr = "";
            $.each($(".check_item:checked"),function () {
                //this
                subscriberName+=$(this).parents("tr").find("td:eq(2)").text()+",";
                //组装用户id字符串
                del_subscriberIdstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
            });
            //去除subscriberName多余的,
            subscriberName = subscriberName.substring(0,subscriberName.length-1);
            //去除删除用户Id的短横线‘-"
            del_subscriberIdstr = del_subscriberIdstr.substring(0,del_subscriberIdstr.length-1);
            if (confirm("确认删除【"+subscriberName+"】吗")){
                //发送Ajax请求删除
                $.ajax({
                    url:"${APP_PATH}/subscriber/deleteSubscriber/"+del_subscriberIdstr,
                    type:"DELETE",
                    success:function (result) {
                        alert(result.msg);
                        to_page(currentPage);
                    }
                });
            }
        });
    </script>
</body>
</html>
