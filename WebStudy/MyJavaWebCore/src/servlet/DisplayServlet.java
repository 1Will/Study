package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/servlet/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	/*public static String fromRequest="fromRequest";
	public static String fromSession="fromSession";
	public static String fromContext="fromContext";*/
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1=(String)request.getAttribute("fromRequest");
		HttpSession session =request.getSession();
		String str2=(String)session.getAttribute("fromSession");
		ServletContext context =getServletConfig().getServletContext();
		String str3=(String)context.getAttribute("fromContext");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>输出范围属性有关信息</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>request的值："+str1+"</H3>");
		out.println("<H3>session的值："+str2+"</H3>");
		out.println("<H3>application的值："+str3+"</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
