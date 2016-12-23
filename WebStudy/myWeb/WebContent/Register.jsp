<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册用户</title>
</head>
<body>
<div>
<form action="/servlet/Rgister" method="post">
输入姓名：<input id="setName" name='name' type="text"><br><br>
输入密码：<input id="setPw" name='passwd' type="password"><br><br>
确认密码：<input id="setPw2" name='passwd2' type="password"><br><br>

</form>
</div>
</body>
</html>