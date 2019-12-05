<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Flat Registration Form Template</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="static/font-awesome/css/font-awesome.min.css">
       	<link rel="stylesheet" type="text/css" href="static/css/form-elements.css">
		<link rel="stylesheet" type="text/css" href="static/css/styl.css">
        

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="static/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="static/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="static/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="static/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="static/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>

		<!-- Top menu -->
		<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.html">Bootstrap Flat Registration Form Template</a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
						<li>
							<span class="li-text">
								
							</span> 
							<a href="#"><strong></strong></a> 
							<span class="li-text">
								 
							</span> 
							<span class="li-social">
								<a href="#"><i class="fa fa-facebook"></i></a> 
								<a href="#"><i class="fa fa-twitter"></i></a> 
								<a href="#"><i class="fa fa-envelope"></i></a> 
								<a href="#"><i class="fa fa-skype"></i></a>
							</span>
						</li>
					</ul>
				</div>
			</div>
		</nav>

        <!-- Top content -->
        <div class="top-content">
        	<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" ></a></div>
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-7 text">
                            <h1><strong>金橙</strong> 宿舍管理系统</h1>
                            <div class="description">
                            	<p>
	                            	打通大学生的宿舍通知通道，你与宿管只差一个金橙.
	                            	下载手机端 <a href="#"><strong>金橙.</strong></a>我们希望能更方便于你!
                            	</p>
                            </div>
                            <div class="top-big-link">
                            	<a class="btn btn-link-1" href="#">注册</a>
                            	<a class="btn btn-link-2" href="#">更多</a>
                            </div>
                        </div>
                        <div class="col-sm-5 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Sign up NOW</h3>
                            		<p>    查看目前的宿舍通知状态，快人一步</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
                        		<div class="form-top-divider"></div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="${pageContext.request.contextPath}/loginController/login" method="post" class="registration-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-first-name">用户名</label>
			                        	<input type="text" name="subscriberName" placeholder="用户名..." class="form-first-name form-control" id="form-first-name">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-last-name">密码</label>
			                        	<input type="text" name="subscriberPassword" placeholder="密码..." class="form-last-name form-control" id="form-last-name">
			                        </div>
			                       <!-- <div class="form-group">
			                        	<label class="sr-only" for="form-email">手机号</label>
			                        	<input type="text" name="form-email" placeholder="手机号..." class="form-email form-control" id="form-email">
			                        </div>-->
			                        
			                        <button type="submit" class="btn">立即登录！</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>

		<script src="static/js/jquery-3.4.1.js"></script>
        <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
        <script src="static/js/retina-1.1.0.min.js"></script>
		<script src="static/js/scripts.js"></script>
		<script src="static/js/jquery.backstretch.js"></script>
      

    </body>

</html>