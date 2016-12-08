<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>原始网</title>
</head>
<body>
<c:url value="http://www.baidu.com" var="urll">
<c:param name="author" value="wo"/>
<c:param name="color" value="yellow"/>
</c:url>
<!--生成的新地址是https://www.baidu.com/?author=wo&color=yellow -->
<a href="${urll}">新地址</a>
</body>
</html>