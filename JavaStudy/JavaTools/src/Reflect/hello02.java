package Reflect;
/*通过无参构造实例化对象 */
public class hello02 {
	    public static void main(String[] args) {
	        Class<?> demo=null;
	        try{
	            demo=Class.forName("Reflect.Person"); 
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        Person per=null;
	        try {
	        	/*
	        	 * newInstance()创建此 Class 对象所表示的类的一个新实例。
	        	 * 如同用一个带有一个空参数列表的 new 表达式实例化该类。如果该类尚未初始化，则初始化这个类.
	        	*/
	            per=(Person)demo.newInstance();   
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	        }
	        per.setName("Rollen");
	        per.setAge(20);
	        System.out.println(per);
	    }
}
