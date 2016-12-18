<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的主页</title>
<link href="../CSS/Css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="../JS/jquery.min.js"></script>
<script>setInterval("time.innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",1000);
</script>
</head>
<body class="body1">
	<%-- <%
		if (session.getAttribute("user") != null) {
	%> --%>
	<p id="h3h" >
		点击此处--><a id="logout" href="../JSP/logout.jsp">退出</a>
	</p>
	<div id="time"></div>
	<marquee>
		欢迎<%=session.getAttribute("user")%>进入系统！
	</marquee>
	<hr>
	<h2 id="title">个人网站</h2>

	<div id="navbar">

		<div id="left">

			<ul class="ul1">
				<li><div ><p class="nav">导航栏</p></div></li>
				<!-- <li><a href="../HTML/myIntroduction.html"><img id="li1"
						src="../Images/1.jpg" /></a></li> 
				<li id="li2"><a href="../HTML/study.html"><img id="li2"
						src="../Images/2.jpg" /></a></li>
				<li id="li3"><a href="../HTML/exercise.html"><img id="li3"
						src="../Images/3.jpg" /></a></li>
				<li id="li4"><a href="../HTML/works.html"><img id="li4"
						src="../Images/4.jpg" /></a></li>
				<li id="li5"><a href="../HTML/game.html"><img id="li5"
						src="../Images/5.jpg" /></a></li>-->
				<li><div id="li1" class="nav"><a href="../HTML/myIntroduction.html">自我介绍</a></div></li>
				<li><div id="li2" class="nav"><a href="../HTML/study.html">学习内容</a></div></li>
				<li><div id="li3" class="nav"><a href="../HTML/exercise.html">项目经验</a></div></li>
				<li><div id="li4" class="nav"><a href="../HTML/works.html">作品展示</a></div></li>
				<li><div id="li5" class="nav"><a href="../HTML/game.html"">休闲一下</a></div></li>
			</ul>

		</div>

		<div id="right">
			<div id="ad1" style="display: none;">
				<p>这个是自我介绍</p>
				<p>打开链接有惊喜哦！</p>
				<p>打开链接有惊喜哦！</p>
			</div>
			<div id="ad2" style="display: none;">
				<p>这个是学习内容</p>
				<p>打开链接有惊喜哦！</p>
				<p>打开链接有惊喜哦！</p>

			</div>
			<div id="ad3" style="display: none;">
				<p>这个是项目经验</p>
				<p>打开链接有惊喜哦！</p>
				<p>打开链接有惊喜哦！</p>

			</div>
			<div id="ad4" style="display: none;">
				<p>这个是作品展示</p>
				<p>打开链接有惊喜哦！</p>
				<p>打开链接有惊喜哦！</p>
			</div>

			<div id="ad5" style="display: none;">
				<p>游戏！</p>
				<p>打开链接有惊喜哦！</p>
				<p>打开链接有惊喜哦！</p>
			</div>

		</div>
		
		<div></div>
		
	</div>

	<%-- <%
		} else {
	%>
	<h3>
		请先进行系统的<a href="../Index.jsp">登录</a>！
	</h3> 
	<%
		}
	%>--%>
	<script type="text/javascript" src="../JS/js.js"></script>
</body>
</html>
