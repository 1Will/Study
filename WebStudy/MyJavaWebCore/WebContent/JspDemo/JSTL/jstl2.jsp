<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="info" value="Hello" scope="request"></c:set>
	<p>清除前：${info}</p>
	<c:remove var="info" scope="request" />
	<p>清除后：${info}</p>
	<hr />



	<c:catch var="err">
		<%
			int re = 10 / 0;
		%>
	</c:catch>
	<h3>异常:${err}</h3>
	<hr />



	<c:if test="${param.ref==10}" var="res1" scope="page">
		<h3>欢迎${param.ref}</h3>
	</c:if>
	<c:if test="${10<30}" var="res2">
		<h3>对的！${res2}</h3>
	</c:if>
	<hr />



	<%
		session.setAttribute("a", "10");
	%>
	<c:choose>
		<c:when test="${a==10}">
			<h4>a为10</h4>
		</c:when>
		<c:when test="${a==20}">
			<h4>a为20</h4>
		</c:when>
		<c:otherwise>
			<h4>a不知道是什么鬼</h4>
		</c:otherwise>
	</c:choose>
	<hr />



	<%
		String b[] = { "123", "九点", "abc","是的","呵呵"};
		pageContext.setAttribute("ref", b);
	%>
	<h3>
		数组输出1：
		<c:forEach items="${ref}" var="men">
${men}&nbsp;
</c:forEach>
	</h3>


<h3>
		数组输出2：
		<c:forEach items="${ref}" var="mem" step="2">
		${mem}&nbsp;
		</c:forEach>
		</h3>
		
		<h3>
		数组输出1-3：
		<c:forEach items="${ref}" var="nb" begin="1" end="3">
		${nb}&nbsp;
		</c:forEach>
		</h3>
		<hr/>
		
		
		<%
		List<String> all=new ArrayList<String>();
		all.add("111");
		all.add("1aa1");
		all.add("一一一");
		all.add("一a1");
		all.add("333");
		pageContext.setAttribute("list",all);
		Map m=new HashMap();
		m.put("姓名", "张三");
		m.put("年龄", "3");
		m.put("爱好", "嫦娥");
		pageContext.setAttribute("map",m);
		%>
		<h3>输出集合：
		<c:forEach items="${list}" var="re" >
		${re}&nbsp;
		</c:forEach>
		</h3>
		
		
		<h3>输出Map:
		<c:forEach items="${map}" var="mp" >
		${mp.key}-->${mp.value}&nbsp;
		</c:forEach>
		</h3>
</body>
</html>