<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试Tomcat数据源</title>
</head>
<body>
<%
Context ctx =new InitialContext();
DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/jndi");
Connection conn =ds.getConnection();
Statement stmt =conn.createStatement();
ResultSet rs = stmt.executeQuery("select * from us");
while(rs.next()){
	out.println(rs.getString(2)+"-->"+rs.getString(3));
	%>
	<br>
	<%
}

%>


</body>
</html>