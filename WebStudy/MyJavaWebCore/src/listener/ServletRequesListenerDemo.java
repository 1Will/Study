package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class ServletRequesListenerDemo
 *
 */
//@WebListener
public class ServletRequesListenerDemo implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletRequesListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Request移除属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Request添加属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
    }

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent paramServletRequestAttributeEvent) {
		// TODO Auto-generated method stub
		System.out.println("Request添加属性！-->属性名："+paramServletRequestAttributeEvent.getName()+"属性值："+paramServletRequestAttributeEvent.getValue());
		//得到新赋值
		System.out.println("Request替换属性！-->新属性值："+paramServletRequestAttributeEvent.getServletRequest().getAttribute(paramServletRequestAttributeEvent.getName()));
	}
	

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
}
