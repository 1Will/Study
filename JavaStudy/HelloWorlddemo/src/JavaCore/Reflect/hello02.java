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
	            per=(Person)demo.newInstance();
	        } catch (InstantiationException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IllegalAccessException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        per.setName("Rollen");
	        per.setAge(20);
	        System.out.println(per);
	    }
}
