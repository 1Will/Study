<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@page import="java.io.*" %>
    <%@page import="java.math.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! BigInteger count=null;%>
<%!
public BigInteger load(File file){
	BigInteger count =null;
	try{
		if(file.exists()){
			Scanner sc=null;
			sc=new Scanner(new FileInputStream(file));
			if(sc.hasNext()){
				count=new BigInteger(sc.next());
			}
			sc.close();
		}else{
			count=new BigInteger("0");
			save(file,count);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return count;
}

public void save(File f,BigInteger count){
	try{
		PrintStream ps=null;
		ps = new PrintStream(new FileOutputStream(f));
		ps.println(count);
		ps.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>
<%
String fileName =this.getServletContext().getRealPath("/")+"count.txt";
File file =new File(fileName);
if(session.isNew()){
	synchronized(this){
		count=load(file);
		count=count.add(new BigInteger("1"));
		save(file,count);
	}
}
%>
<h2>您是第<%=count==null?0:count %>位访客！</h2><%--输出内容 --%>
</body>
</html>