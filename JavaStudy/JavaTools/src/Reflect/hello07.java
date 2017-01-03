package Reflect;
/*获取修饰符 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class hello07 {
	    public static void main(String[] args) {
	        Class<?> demo=null;
	        try{
	            demo=Class.forName("Reflect.Person");
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        Constructor<?>cons[]=demo.getConstructors();  //取得所有构造方法
	        for (int i = 0; i < cons.length; i++) {
	        	/*按照声明顺序返回一组 Class 对象，
	        	 * 这些对象表示此 Constructor 对象所表示构造方法的形参类型。
	        	 * 如果底层构造方法不带任何参数，则返回一个长度为 0 的数组。*/
	            Class<?> p[]=cons[i].getParameterTypes();
	            System.out.print("构造方法：  ");
	            /*以整数形式返回此 Constructor 对象所表示构造方法的 Java语言修饰符。
	             * 应该使用 Modifier 类对这些修饰符进行解码。*/
	            int mo=cons[i].getModifiers();
	            System.out.print(Modifier.toString(mo)+" ");
	            
	            System.out.print(cons[i].getName());
	            System.out.print("(");
	            
	            for(int j=0;j<p.length;++j){
	                System.out.print(p[j].getName()+" arg"+i);
	                if(j<p.length-1){
	                    System.out.print(",");
	                }
	            }
	            System.out.println("){}");
	        }
	    }
	}
