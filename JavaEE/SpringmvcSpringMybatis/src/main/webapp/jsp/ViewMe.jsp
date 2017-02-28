<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--

  -->
<title>显示</title>
</head>
<body>
	<center>
		<h3>显示</h3>
	</center>
	<table border='1' align='center' cellspacing='0' cellpadding='0'>

		<tr>
			<td>ID</td>
			<td>Shop_NO</td>
			<td>Shop_Name</td>
			<td>Shop_Type</td>
			<td>Shop_Password</td>
			<td>Note</td>
		</tr>

		<tr>
			<td>${vo.id}</td>
			<td>${vo.shopNo}</td>
			<td>${vo.shopName}</td>
			<td>${vo.shopType}</td>
			<td>${vo.shopPassword}</td>
			<td>${vo.note}</td>
		</tr>
	</table>
	<br>
	<br>
	<center>
		<a href="viewAll.do">查看所有</a>
	</center>
</body>
</html>