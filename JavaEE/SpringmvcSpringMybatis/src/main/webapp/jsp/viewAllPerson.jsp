<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--

  -->
<title>显示所有</title>
</head>
<body>
	<center>
		<h3>显示所有</h3>
	</center>
	<form name="form" method="post">
	<table border='1' align='center' cellspacing='0' cellpadding='0'>

		<tr>
			<td>序号</td>
			<td>选择</td>
			<td>name</td>
			<td>sex</td>
			<td>操作</td>
		</tr>

		<% int i=1; %>
		<c:forEach var="vo" items="${perVos}">
		<tr>
			<td><%=i++ %></td>
			<td><input id="box" name="box" type="checkbox" value="${vo.id}"></td>
			<td>${vo.name}</td>
			<td>${vo.sex}</td>
			<td>
			<a href="updatePerson.do?id=${vo.id}">修改</a>
			<a href="deletePerson.do?id=${vo.id}">删除</a>
			</td>
		</tr>
		</c:forEach>
				<tr>
			<td></td>
			<td></td>
			<td><button onclick="updateName()">批量修改</button></td>
			<td><button onclick="updateSex()">批量修改</button></td>
			<td></td>
		</tr>
	</table>
	</form>
	<center><a href="insertPerson.do">添加用户</a></center>
	<script type="text/javascript">
	function updateName(){
		document.form.action = "updateName.do"
		document.form.submit();
	}
	function updateSex(){
		document.form.action = "updateSex.do"
		document.form.submit();
	}
	</script>
</body>
</html>