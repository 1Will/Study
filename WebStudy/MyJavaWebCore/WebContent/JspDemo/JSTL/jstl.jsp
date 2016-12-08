<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="Book.BookBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="阿黑" scope="page"/>
<c:set var="name1" scope="page">value="阿黑"</c:set>
${name}<br/>
${name1}
<hr/>
<%
BookBean book=new BookBean();
request.setAttribute("book1",book);
%>
<c:set target="${book1}" property="bookName" value="Java从入门到"></c:set>
${book1.bookName}
<br/>

</body>
</html>