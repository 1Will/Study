<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.lxh.smart.*"%>
<%@ page import="cn.mldn.lxh.util.*"%>
<html>
<head><title>提交</title></head>
<body>
<%
	request.setCharacterEncoding("UTF-8") ;
%>
<%
	SmartUpload smart = new SmartUpload() ;
	smart.initialize(pageContext) ;	// 初始化上传操作
	smart.upload() ;			// 上传准备
	String name = smart.getRequest().getParameter("uname") ;
	IPTimeStamp its = new IPTimeStamp(request.getRemoteAddr()) ;	// 取得客户端的IP地址
	String ext = smart.getFiles().getFile(0).getFileExt() ;	// 扩展名称
	String fileName = its.getIPTimeRand() + "." + ext ;
	out.print(this.getServletContext().getRealPath("/")+"\\JspDemo\\upload"+java.io.File.separator + fileName);
	smart.getFiles().getFile(0).saveAs(this.getServletContext().getRealPath("/")+"\\JspDemo\\upload"+java.io.File.separator + fileName) ;
%>
<%=smart.getFiles().getFile(0).getFileName().matches("^\\w+.(jpg|gif)$")%>
<h2>姓名：<%=name%></h2>
<img src="upload/<%=fileName%>">
</body>
</html>