<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="testOnline.jsp" method="post">
		姓名：<input type="text" name="namee"> <input type="submit">


		<%
			String name = request.getParameter("namee");
			if ( !(name == null || "".equals(name))) {
				session.setAttribute("name", name);
				response.sendRedirect("list.jsp");
			}else{
				out.println("输入不合法!");
			}
		%>
	</form>
</body>
</html>