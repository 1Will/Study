<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%@ page import="java.io.*" %>
	<%@ page import="java.net.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String htmpath = null;
		BufferedReader in = null;
		InputStreamReader isr = null;
		InputStream is = null;
		PrintWriter pw = null;
		HttpURLConnection huc = null;
		try {
			htmpath = "http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/2014/04.07.json";
			URL url = new URL(""); //创建 URL
			huc = (HttpURLConnection) url.openConnection();
			is = huc.getInputStream();
			isr = new InputStreamReader(is);
			in = new BufferedReader(isr);
			String line = null;
			while (((line = in.readLine()) != null)) {
				if (line.length() == 0)
					continue;
				pw.println(line);
				out.print(line);
			}

		}

		catch (Exception e) {
			System.err.println(e);
		} finally { //无论如何都要关闭流
			try {
				is.close();
				isr.close();
				in.close();
				huc.disconnect();
				pw.close();
			} catch (Exception e) {
			}
		}
	%>


</body>
</html>