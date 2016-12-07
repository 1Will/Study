<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="JS/jquery.min.js"></script>
<link href="CSS/Css.css" type="text/css" rel="stylesheet">
</head>
<body class="body2">
<!-- 首页动画 -->
	<div id="divv">
		<h2 id="h2h">欢迎登录！</h2>
	</div>
	
	<!-- 登陆框 -->
	<div id="div1">
		<form id="form1"  method="post"><!-- action="Index.jsp" -->
			<span>用户名:</span> <input name="name" type="text" title="请输入用户名"><br />
			<br /> <span>密&nbsp;&nbsp;&nbsp;码:</span> <input name="password"
				type="password" title="请输入密码"><br />
			<p>
				<input id="load" class="button" type="submit"
					value="&nbsp;&nbsp;&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;&nbsp;&nbsp;">
			</p>
			<p>
				<input class="button" type="reset"
					value="&nbsp;&nbsp;&nbsp;重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置&nbsp;&nbsp;&nbsp;">
			</p>
		</form>
		<h4 id="h4h1" style="display: none;" dir="ltr" align="center">请输入用户名和密码!</h4><!-- 此处需调试 -->
	</div>
<!-- 验证部分 -->
	<%
		String nm = request.getParameter("name");
		String pw = request.getParameter("password");
		if (!(nm == null || "".equals(nm) || pw == null || "".equals(pw))) {
			if ("abc".equals(nm) && "123".equals(pw)) {
				response.setHeader("refresh", "0.1;URL=HTML/Index2.jsp");
				session.setAttribute("user", nm);
	%>
	<%
		} else {
	%>
	<h4 id="h4h">错误的用户名或密码！</h4>
	
	<%
		}
		}
	%>

	<script type="text/javascript" src="JS/js.js"></script>
</body>
</html>