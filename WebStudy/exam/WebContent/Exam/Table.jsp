<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩表</title>
<link type="text/css" href="table.css" rel="stylesheet">
</head>
<body>

	<%
		ArrayList<Students> ta = (ArrayList<Students>) session.getAttribute("table");
	%>

	<center>
		<h3>学生成绩表</h3>

		<input id="tbBn" type="button" neme="addValue" value="Add"
			onclick="add()">&nbsp;&nbsp;
		<input id="tbBn" type="button"
			neme="updateValue" value="Update" onclick="update()">&nbsp;&nbsp; 
		<input
			id="tbBn" type="button" neme="deleteValue" value="Delete"
			onclick="del()">&nbsp;&nbsp;
		<input id="tbBn" type="button"
			neme="selectValue" value="Select" onclick="window.location.reload()">
		<hr>

		<form name="change" method="post">

			<table border='1' align='center' cellspacing='0' cellpadding='0'>
				<tr>
					<td>请选择</td>
					<td>序号</td>
					<td>姓名</td>
					<td>班级</td>
					<td>课程</td>
					<td>分数</td>
				</tr>
				<%
					if (ta != null) {
						for (int i = 0; i < ta.size(); i++) {
				%>
				<tr>
					<td><input type="checkbox" name="box" value=<%=i%>></td>
					<td><%=i + 1%></td>
					<td><%=ta.get(i).getName()%></td>
					<td><%=ta.get(i).getClas()%></td>
					<td><%=ta.get(i).getCourse()%></td>
					<td><%=ta.get(i).getGrade()%></td>
				</tr>

				<%
					}
					}
				%>
			</table>

		</form>

		<script type="text/javascript">
			function add() {
				window.open("add.jsp");
			}
			function update() {
				document.change.action = "update.jsp"
				document.change.submit();
				/* window.open("update.jsp"); */
			}
			function del() {
				document.change.action = "../servlet/Student";
				document.change.submit();
			}
		</script>
	</center>
</body>
</html>