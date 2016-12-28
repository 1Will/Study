<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Book.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function add(){
	window.open("add.jsp");
}
function update(){
	window.open("update.jsp");
}
</script>
</head>
<body>


<%ArrayList<Students> ta = (ArrayList<Students>) session.getAttribute("table"); %>
<%= ta.get(1).getName()%>


<h3>学生成绩表</h3>

<input type="button" neme="addValue" value="Add" onclick="add()">&nbsp;
<input type="button" neme="updateValue" value="Update" onclick="update()">&nbsp;
<input type="button" neme="deleteValue" value="Delete">&nbsp;
<input type="button" neme="selectValue" value="Select">
<hr>

<%-- 	<table>
		<tr>
			<td>&nbsp;</td>
			<td>姓名</td>
			<td>班级</td>
			<td>课程</td>
			<td>分数</td>
		</tr>
		<%
		for(int i=0;i<=20;i++){
		%>
		<tr>
			<td><%= i %></td>
			<td><%=ta %></td>
			<td>班级</td>
			<td>课程</td>
			<td>分数</td>
		</tr>
		
		<% 
		}
		%>
		
		
		</table> --%>

</body>
</html>