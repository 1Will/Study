<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String info="窝!爱;吃!饭;唱,歌";
pageContext.setAttribute("str",info);
String inf="窝爱p吃饭p唱歌";
pageContext.setAttribute("st",inf);
%>
<h3>
拆分结果1：
<c:forTokens items="${str}" delims=",;!" var="con">
${con}&nbsp;
</c:forTokens>
</h3>

<h3>
拆分结果2：
<c:forTokens items="${str}" delims=";" var="co">
${co}&nbsp;
</c:forTokens>

<h3>
拆分结果3：
<c:forTokens items="${st}" delims="p" var="co">
${co}&nbsp;
</c:forTokens>
</h3>
<hr/>


</body>
</html>