<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext1</title>
</head>
<body>
<%-- <% 
pageContext.setAttribute("name","张三");
pageContext.setAttribute("date",new Date());
%> --%>

<%
String username =(String)pageContext.getAttribute("name");
Date userage =(Date)pageContext.getAttribute("date");
%>

<h2>姓名：<%=username %></h2>
<h2>日期：<%=userage %></h2>
</body>
</html>