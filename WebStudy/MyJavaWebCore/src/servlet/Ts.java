package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "life", urlPatterns = { "/servlet/Ts" },loadOnStartup=1)
public class Ts extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ts(){
		super();
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		System.out.println("**2、Servlet服务-->doGet()");
	}
}
