
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<%--     <base href="<%=basePath%>"> --%>
    
    <title>SmartUpload</title>
    
  </head>
  
  <body>
    <form action="doupload.jsp" method="post" enctype="multipart/form-data">
        姓名:<input type="text" name="username" /><br/>
        密码:<input type="text" name="pwd" /><br/>
        文件1:<input type="file" name="file1" /><br/>
        文件2:<input type="file" name="file2" /><br/>
        文件3:<input type="file" name="file3" /><br/>
        文件4:<input type="file" name="file4" /><br/>
        文件5:<input type="file" name="file5" /><br/>
        文件6:<input type="file" name="file6" /><br/>
        文件7:<input type="file" name="file7" /><br/>
        <input type="submit" />
    </form>
  </body>
</html>