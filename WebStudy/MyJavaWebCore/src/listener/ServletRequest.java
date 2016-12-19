package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequest
 *
 */
//@WebListener
public class ServletRequest implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ServletRequest() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("request销毁"+arg0.getServletRequest().getRemoteAddr()+arg0.getServletContext().getContextPath());

    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("request初始化"+arg0.getServletRequest().getRemoteAddr()+arg0.getServletContext().getContextPath());

    }
	
}
