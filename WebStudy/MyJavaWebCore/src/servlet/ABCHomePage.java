package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class ABCHomePage
 */
@WebServlet("/servlet/ABCHomePage")
public class ABCHomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABCHomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ABC公司</title>");
		out.println("</head>");
		out.println("<body>");
		ServletContext context =getServletContext();
		
		RequestDispatcher rd = context.getRequestDispatcher("/servlet/HeaderServlet");
		rd.include(request, response);
		//rd.forward(request, response);
		
		out.println("<font size=4 color='#000099'>");
		out.println("&nbsp;&nbsp;公司简介<br><br>");
		out.println("俺们公司牛逼啊<br><br>");
		out.println("牛逼！<br><br>");
		rd=context.getRequestDispatcher("/ServletDemo/Footer.html");
		
		rd.include(request, response);
		//rd.forward(request, response);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
