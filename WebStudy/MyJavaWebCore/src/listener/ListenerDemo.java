package listener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sun.glass.ui.Pixels.Format;

/**
 * Application Lifecycle Listener implementation class ListenerDemo
 *
 *
 *
 */
//@WebListener
public class ListenerDemo implements ServletContextListener {
	
	public static void write() throws FileNotFoundException{
		File f=new File("D:\\log.txt");
		PrintStream out = new PrintStream(f);
		System.setOut(out);
		
	}
	
	public static void dt(){
		Date date =new Date();
    	SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd--hh:mm-ss");
    	String da=f.format(date);
    	System.out.print(da);
	}
    /**
     * Default constructor. 
     */
    public ListenerDemo() {
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	dt();
    	System.out.println("  listener1销毁！");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  {
         // TODO Auto-generated method stub
    	dt();
    	System.out.println("  listener1初始化！");
    	
    }
	
}
