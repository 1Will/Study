<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="table.css" rel="stylesheet">
<title>修改</title>
</head>
<center>
	<body>
		<%
			ArrayList<Integer> id = new ArrayList<Integer>();
			String[] va = request.getParameterValues("box");
			if (va == null) {
		%>
		<%="<script language='javascript'>alert('请选择！！！')</script>"%>
		<%
			/* response.sendRedirect("Table.jsp"); */
				response.setHeader("refresh", "1 ; URL=Table.jsp");
			} else {
				for (int i = 0; i < va.length; i++) {
					id.add(Integer.parseInt(va[i]));
				}
				session.setAttribute("ids", id);
				ArrayList<Students> ta = (ArrayList<Students>) session.getAttribute("table");
		%>


		<h3>学生成绩表</h3>

		<hr>

		<form action="../servlet/Student" method="post">
			<table border='1' align='center' cellspacing='0' cellpadding='0'>
				<tr>
					<td>&nbsp;</td>
					<td>序号</td>
					<td>姓名</td>
					<td>班级</td>
					<td>课程</td>
					<td>分数</td>
				</tr>
				<%
					if (ta != null && id != null) {
							for (int i = 0; i < id.size(); i++) {
								String na1 = "nu" + i + "1";
								String na2 = "nu" + i + "2";
								String na3 = "nu" + i + "3";
								String na4 = "nu" + i + "4";
				%>
				<tr>
					<td>&nbsp;</td>
					<td><%=i + 1%></td>
					<td><input name=<%=na1%> type="text"
						value="<%=ta.get(id.get(i)).getName()%>"></td>
					<td><input name=<%=na2%> type="text"
						value="<%=ta.get(id.get(i)).getClas()%>"></td>
					<td><input name=<%=na3%> type="text"
						value="<%=ta.get(id.get(i)).getCourse()%>"></td>
					<td><input name=<%=na4%> type="text"
						value="<%=ta.get(id.get(i)).getGrade()%>"></td>
				</tr>

				<%
					}
						}
					}
				%>
			</table>
			<br> <br> <br> <input id="updateBn" type="submit"
				value="提交" onclick="window.open('Table.jsp')">
		</form>
</center>
</body>
</html>