package Reflect;
/*取得其他类中的父类 */
public class hello05 {
        public static void main(String[] args) {  
            Class<?> demo=null;  
            try{  
                demo=Class.forName("Reflect.Person");  
            }catch (Exception e) {  
                e.printStackTrace();  
            }  
            //取得父类  
            Class<?> temp=demo.getSuperclass();  
            System.out.println("继承的父类为：   "+temp.getName());  
        }  
    }  
