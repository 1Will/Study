<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<script type="text/javascript" src="JS/jquery.min.js"></script>
<link href="CSS/Css.css" type="text/css" rel="stylesheet">
<link rel="shortcut  icon" type="image/x-icon" href="Images/Computer.ico" media="screen">
</head>
<body class="body2">
<h5><a href="Index.jsp">返回首页</a></h5>
	<!-- 首页动画 -->
	<div id="divv">
		<h2 id="h2h">欢迎登录！</h2>
	</div>
	<!-- 登陆框 -->
	<div id="body">

		<div id="left1">
			<div id="div2">
				<form id="form1" method="post" action="servlet/Submit">
					<!-- action="Index.jsp" -->
					<span>用户名:</span> <input id="name" name="name" type="text"
						title="请输入用户名"><br /> <br /> <span>密&nbsp;&nbsp;&nbsp;码:</span>
					<input id="password" name="password" type="password" title="请输入密码"><br />
					<p>
						<input id="load" class="button" type="submit" value="登录">
					</p>
					<p>
						<input class="button" type="reset" value="取消">
					</p>
				</form>
			</div>
		</div>
		<div id="right1">
			<div id="div1">
				<p>请输入用户名和密码！</p>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="JS/js.js"></script>
</body>
</html>