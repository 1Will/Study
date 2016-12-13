package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TJservlet
 */
/*@WebServlet(urlPatterns = { "/Tservlet" } , loadOnStartup = 1)*/


public class Tservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><title>servlet测试get/post</title></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用doGet()方法</H2>");
		out.println("<H2>用户输入信息如下</H2>");
		//request.setCharacterEncoding("UTF-8");
		String username =request.getParameter("username");
		//username= new String(username.getBytes("ISO8859_1"),"UTF-8");
		ServletConfig config =getServletConfig();
		String abc = config.getInitParameter("abc");
		
		if(username==null||username==""){
			username="未输入";
		}
		String passwd=request.getParameter("passwd");
		if(passwd==null||passwd==""){
			passwd="未输入密码";
		}
		out.println("<H2>用户名："+username+"<H2>");
		out.println("<H2>密码："+passwd+"<H2>");
		out.println("<H2>abc="+abc+"<H2>");
		out.println("</BODY>");
		out.println("</HTMl>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
