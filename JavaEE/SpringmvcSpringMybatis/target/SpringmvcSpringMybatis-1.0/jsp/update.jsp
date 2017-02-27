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
		<h3>修改</h3>
	</center>
	<form action="update2.do" method="post">
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
			<td ><input name="id" id="id" type="text" value="${vo.id}"></td>
			<td><input name="shopNo" id="shopNo" type="text" value="${vo.shopNo}"></td>
			<td><input name="shopName" id="shopName" type="text" value="${vo.shopName}"></td>
			<td><input name="shopType" id="shopType" type="text" value="${vo.shopType}"></td>
			<td><input name="shopPassword" id="shopPassword" type="text" value="${vo.shopPassword}"/></td>
			<td><input name="note" id="note" type="text" value="${vo.note}"></td>
		</tr>
	</table>
	<input type="submit" value="提交">
	</form>
</body>
</html>