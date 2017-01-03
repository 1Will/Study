package Reflect;
/*带异常的获取*/
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class hello08 {
	    public static void main(String[] args) {
	        Class<?> demo=null;
	        try{
	            demo=Class.forName("Reflect.Person");
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        /*返回一个 Method 对象，
	         * 它反映此 Class 对象所表示的类或接口的指定公共成员方法。*/
	        Method method[]=demo.getMethods();
	        for(int i=0;i<method.length;++i){
	            Class<?> returnType=method[i].getReturnType();
	            Class<?> para[]=method[i].getParameterTypes();
	            /*以整数形式返回此 Method 对象所表示方法的 Java 语言修饰符。应该使用 Modifier 类对修饰符进行解码。*/
	            int temp=method[i].getModifiers();
	            System.out.print(Modifier.toString(temp)+" ");
	            System.out.print(returnType.getName()+"  ");
	            System.out.print(method[i].getName()+" ");
	            System.out.print("(");
	            for(int j=0;j<para.length;++j){
	                System.out.print(para[j].getName()+" "+"arg"+j);
	                if(j<para.length-1){
	                    System.out.print(",");
	                }
	            }
	            /*返回 Class 对象的数组，
	             * 这些对象描述了声明将此 Method 对象表示的底层方法抛出的异常类型。
	             * 如果此方法没有在其 throws 子句中声明异常，则返回长度为 0 的数组。*/
	            Class<?> exce[]=method[i].getExceptionTypes();
	            if(exce.length>0){
	                System.out.print(") throws ");
	                for(int k=0;k<exce.length;++k){
	                    System.out.print(exce[k].getName()+" ");
	                    if(k<exce.length-1){
	                        System.out.print(",");
	                    }
	                }
	            }else{
	                System.out.print(")");
	            }
	            System.out.println();
	        }
	    }
}
