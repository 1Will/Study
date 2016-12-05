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
long start=session.getCreationTime();
long end=session.getLastAccessedTime();
long time =(end-start)/1000;
if(session.isNew()){
%>
<h3>欢迎新用户！</h3>
<%
} else{
%>
<h3>老用户！</h3>

<%
}
%>
<p>您已停留了<%=time %>秒！</p>

</body>
</html>