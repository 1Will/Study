<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎光临！</title>
</head>
<body>
<center style="color: blue;">
<%
Date today=new Date();
int hours = today.getHours();
int minute = today.getMinutes();
if(hours>=0&&hours<=12){
	out.println("早上好！");
}else if(hours>=12&&hours<=19){
	out.println("下午好！");
}else{
	out.println("晚上好！");
}
%>
</center>
</body>
</html>