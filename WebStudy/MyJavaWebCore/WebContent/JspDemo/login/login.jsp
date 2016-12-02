<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background=#50BCFB>
	<center>
		<form id="login" action="loginReceive.jsp" method="post">
			<span>用户名:</span><input type="text" name="userName" title="请输入姓名"><br />
			<br /> <span>密&nbsp;码:</span><input type="password" name="password"
				title="请输入密码"><br />
			<br /> <input type="submit" name="submit" value="登录" title="开始登陆" >
			<input type="reset" name="reset" value="重置" title="重新填写">
		</form>
	</center>
</body>
</html>