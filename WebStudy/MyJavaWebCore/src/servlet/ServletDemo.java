package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;Charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<body>");
		out.println("<H2>Servlet编程</H2>");
		out.println("<H3>现在时间是："+new Date()+"</H3>");
		
		out.println("<form mothed='post'>");
		out.println("<input type='text'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</HTML>");
		out.close();
	}
}


