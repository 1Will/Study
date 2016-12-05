<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session2</title>
</head>
<body>
<% 
session.setAttribute("name","张三");
session.setAttribute("date",new Date());
%>

<%-- <jsp:forward page="request1.jsp"/> --%>
<!-- 网页跳转！OK   新开浏览器 NG -->
<a href="session1.jsp">跳转</a>  
</body> 
</html>