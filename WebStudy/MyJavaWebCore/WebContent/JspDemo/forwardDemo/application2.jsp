<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application2</title>
</head>
<body>
<% 
application.setAttribute("name","张三");
application.setAttribute("date",new Date());
%>

<%-- <jsp:forward page="request1.jsp"/> --%>
<!-- 网页跳转！OK   新开浏览器 OK 服务器重启 NG！-->
<a href="application1.jsp">跳转</a>  
</body> 
</html>