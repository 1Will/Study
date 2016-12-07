<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>基本运算</p>
<span>1+1:</span>${1+1}<hr/>
<span>1-1:</span>${1-1}<hr/>
<span>1*1:</span>${1*1}<hr/>
<span>1/1:</span>${1/1}<hr/>
<span>1%1:</span>${1%1}<hr/>
<p>关系运算</p>
<span>2&gt;1:</span>${2>1}<hr/>
<span>2&lt;1:</span>${2<1}<hr/>
<span>1&ge;1:</span>${1>=1}<hr/>
<span>2&le;1:</span>${2<=1}<hr/>
<span>2==1:</span>${2==1}<hr/>
<p>逻辑运算</p>
<span>true && false:</span>${true && false}<hr/>
<span>true and false:</span>${true and false}<hr/>
<span>true||false:</span>${true || false}<hr/>
<span>true or false:</span>${true or false}<hr/>
<span>!false:</span>${!false}<hr/>

</body>
</html>