<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application1</title>
</head>
<body>

<%
/* application.removeAttribute("name");
application.removeAttribute("date"); */
String username =(String)application.getAttribute("name");
Date userdate =(Date)application.getAttribute("date");
%>

<h2>姓名：<%=username %></h2>
<h2>日期：<%=userdate %></h2>
</body>
</html>