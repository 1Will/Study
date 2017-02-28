<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--

  -->
<title>添加</title>
</head>
<body>
	<center>
		<h3>添加页面</h3>
	</center>
	<!-- <form action="insert2.do" method="post"> -->
	<center>
	<table border='1' align='center' cellspacing='0' cellpadding='0'>

		<tr>
			<td>Shop_NO</td>
			<td>Shop_Name</td>
			<td>Shop_Type</td>
			<td>Shop_Password</td>
			<td>Note</td>
		</tr>
		<tr>
			<td><input name="shopNo" id="shopNo" type="text" ></td>
			<td><input name="shopName" id="shopName" type="text" ></td>
			<td><input name="shopType" id="shopType" type="text" ></td>
			<td><input name="shopPassword" id="shopPassword" type="text"/></td>
			<td><input name="note" id="note" type="text"></td>
		</tr>
	</table>
	<br>
	<input type="submit" value="添加" onclick="insert()">
	</center>
	<!-- </form> -->
	<script src="pages/script/jquery.min.js" type="text/javascript"></script>
	<script src="pages/script/insert.js" type="text/javascript"></script>
</body>
</html>