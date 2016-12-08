<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>我的主页</title>
<link href="../CSS/Css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="../JS/jquery.min.js"></script>
</head>
<body class="body1">
	<%
		if (session.getAttribute("user") != null) {
	%>
	<p id="h3h">
		欢迎<%=session.getAttribute("user")%>进入系统！点击此处<a href="logout.jsp">退出</a>
	</p>

	<div id="top" class="aa"></div>
	
	<h1 align="center">个人网站</h1>
	
	<div id="navbar">

		<div id="left">
			<p class="p1">导航栏</p>

			<ul class="ul1">
				<li><a href="myIntroduction.html"><img id="li1"
						src="../Images/1.jpg" /></a></li>
				<li id="li2"><a href="study.html"><img id="li2"
						src="../Images/2.jpg" /></a></li>
				<li id="li3"><a href="exercise.html"><img id="li3"
						src="../Images/3.jpg" /></a></li>
				<li id="li4"><a href="works.html"><img id="li4"
						src="../Images/4.jpg" /></a></li>
			</ul>

		</div>

		<div id="right">
			<div id="ad1" style="display: none;">这个是自我介绍</div>
			<div id="ad2" style="display: none;">这个是学习内容</div>
			<div id="ad3" style="display: none;">这个是项目经验</div>
			<div id="ad4" style="display: none;">这个是作品展示</div>
		</div>

	</div>


	<div></div>
	<%
		} else {
	%>
	<h3>
		请先进行系统的<a href="../Index.jsp">登录</a>！
	</h3>
	<%
		}
	%>
	<script type="text/javascript" src="../JS/js.js"></script>
</body>
</html>
