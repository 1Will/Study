<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Collection</title>
</head>
<body>

<%
List<String> all =new ArrayList<String>();
all.add("张三");
all.add("30");
all.add("试试水");
request.setAttribute("allinfo", all);
%>
<p>开始输出</p>
<h3>第一个元素：${allinfo[0]}</h3>
<h3>第二个元素：${allinfo[1]}</h3>
<h3>第三个元素：${allinfo[2]}</h3>

</body>
</html>