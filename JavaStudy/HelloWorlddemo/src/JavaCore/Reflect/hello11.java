package Reflect;
/*通过反射操作属性*/
import java.lang.reflect.Field;

public class hello11 {
	    public static void main(String[] args) throws Exception {
	        Class<?> demo = null;
	        Object obj = null;
	 
	        demo = Class.forName("Reflect.Person1");
	        obj = demo.newInstance();
	 
	        Field field = demo.getDeclaredField("sex");
	        field.setAccessible(true);
	        field.set(obj, "男");
	        System.out.println(field.get(obj));
	}// end class
}
