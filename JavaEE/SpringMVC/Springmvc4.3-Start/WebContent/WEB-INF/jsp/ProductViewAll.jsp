<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
		<h5>所有产品:</h5>
		<table border='1' align='center' cellspacing='0' cellpadding='0'>
		<tr>
		<td>ID：</td>
		<td>名字:</td>
		<td>描述:</td>
		<td>价格:</td>
		<td>重量:</td>
		<td>尺寸:</td>
		<td>操作：</td>
		</tr>
		<c:forEach var="p" items="${products}"> 
		<tr>
		<td>${p.value.id}</td>
		<td>${p.value.name}</td>
		<td>${p.value.description}</td>
		<td>${p.value.price}</td>
		<td>${p.value.weight}</td>
		<td>${p.value.size}</td>
		<td>
		<form action="product_update.action" method="post">
		<input type="hidden" name="id" value="${p.value.id}">
		<input type="submit" value="修改">
		</form>
		<form action="product_delete.action" method="post">
		<input type="hidden" name="id" value="${p.value.id}">
		<input type="submit" value="删除">
		</form>
		</td>
		</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>