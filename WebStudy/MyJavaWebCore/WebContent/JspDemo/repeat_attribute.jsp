<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("a1", "张三");
%>
<h3>a1的内容为：${pageScope.a1}</h3>

<h3>IP:${pageContext.request.remoteAddr}</h3>
<h3>SESSION ID: ${pageContext.session.id}</h3>
<%-- <h3>是否更新session: ${pageContext.session.new}</h3> --%>
</body>
</html>