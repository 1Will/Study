<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
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
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("filename");
		String content = request.getParameter("filecontent");
		String fileName = this.getServletContext().getRealPath("/") + "note" + File.separator + name;
		File file = new File(fileName);
		out.print(fileName);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(file));
		ps.println(content);
		ps.close();
	%>

	<%
		Scanner sc = new Scanner(new FileInputStream(file));
		sc.useDelimiter("\n");
		StringBuffer buf = new StringBuffer();
		while (sc.hasNext()) {
			buf.append(sc.next()).append("<br>");
		}
		sc.close();
	%>
	<%=buf%>
</body>
</html>