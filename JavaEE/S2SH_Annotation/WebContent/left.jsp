<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>图书信息管理</div>
	<dl>
		<dd><a href="${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage=1" target="centerFrm">图书信息维护</a></dd>
		<dd><a href="###">添加图书信息</a></dd>
	</dl>
	
	<div>图书类型信息管理</div>
	<dl>
		<dd><a href="###">图书类型信息维护</a></dd>
		<dd><a href="###">添加图书类型信息</a></dd>
	</dl>
</body>
</html>