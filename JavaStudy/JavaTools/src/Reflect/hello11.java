package Reflect;
/*通过反射操作属性*/
import java.lang.reflect.Field;

public class hello11 {
	    public static void main(String[] args) throws Exception {
	        Class<?> demo = null;
	        Object obj = null;
	 
	        demo = Class.forName("Reflect.Person1");
	        obj = demo.newInstance();
	        
	        /*返回 Field 对象的一个数组，
	         * 这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
	         * 包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段。
	         * 返回数组中的元素没有排序，也没有任何特定的顺序。
	         * 如果该类或接口不声明任何字段，或者此 Class 对象表示一个基本类型、一个数组类或 void，则此方法返回一个长度为 0 的数组。*/
	        Field field = demo.getDeclaredField("sex");
	        field.setAccessible(true);
	        field.set(obj, "男");
	        System.out.println(field.get(obj));
	}// end class
}
