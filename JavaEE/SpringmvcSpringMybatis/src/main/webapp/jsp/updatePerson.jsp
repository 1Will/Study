<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--

  -->
<title>修改</title>
</head>
<body>
	<center>
		<h3>修改页面</h3>
	</center>
	<!-- <form action="update2.do" method="post"> -->
	<center>
	<table border='1' align='center' cellspacing='0' cellpadding='0'>

		<tr>
			<td>name</td>
			<td>sex</td>
		</tr>
		<tr>
			<td><input name="id" id="id" type="hidden" value="${pVo.id}"></td>
			<td><input name="name" id="name" type="text" value="${pVo.name}"></td>
			<td><input name="sex" id="sex" type="text" value="${pVo.sex}"></td>
		</tr>
	</table>
	<br>
	<input type="submit" value="修改" onclick="updatePerson()">
	</center>
	<!-- </form> -->
	<script src="pages/script/jquery.min.js" type="text/javascript"></script>
	<script src="pages/script/update.js" type="text/javascript"></script>
</body>
</html>