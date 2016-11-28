package Reflect;
/*通过Class调用其他类中的构造函数*/
import java.lang.reflect.Constructor;

class hello03{  
public static void main(String[] args) {  
    Class<?> demo=null;  
    try{  
        demo=Class.forName("Reflect.Person");  
    }catch (Exception e) {  
        e.printStackTrace();  
    }  
    Person per1=null;  
    Person per2=null;  
    Person per3=null;  
    Person per4=null;  
    //取得全部的构造函数  
    Constructor<?> cons[]=demo.getConstructors();  
    try{  
    	per1=(Person)cons[0].newInstance();  
    	per3=(Person)cons[1].newInstance(20);  
    	per4=(Person)cons[2].newInstance("Rollen",20);  
    	per2=(Person)cons[3].newInstance("Rollen");  
     
    }catch(Exception e){  
        e.printStackTrace();  
    }  
    System.out.println(per1);  
    System.out.println(per2);  
    System.out.println(per3);  
    System.out.println(per4);  
}
}