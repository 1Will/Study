package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextAttributeListenDemo
 *
 */
//@WebListener
public class ServletContextAttributeListenDemo implements ServletContextAttributeListener, ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextAttributeListenDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
    	System.out.println("Application增加属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Application移除属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Application替换属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
    }

	@Override
	public void contextInitialized(ServletContextEvent paramServletContextEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent paramServletContextEvent) {
		// TODO Auto-generated method stub
		
	}

	
}
