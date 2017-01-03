package Reflect;
 
import java.io.*;
import java.util.*;
 
//操作属性文件类
class init{
    public static Properties getPro() throws FileNotFoundException, IOException{
        Properties pro=new Properties();
        File f=new File("fruit.properties");
        if(f.exists()){
            pro.load(new FileInputStream(f));
        }else{
            pro.setProperty("apple", "Reflect.Apple");
            pro.setProperty("orange", "Reflect.Orange");
            pro.store(new FileOutputStream(f), "FRUIT CLASS");
        }
        return pro;
    }
}
 
class Factory3{
    public static fruit getInstance(String ClassName){
        fruit f=null;
        try{
            f=(fruit)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
class hellofactory3{
    public static void main(String[] a) throws FileNotFoundException, IOException{
        Properties pro=init.getPro();
        fruit f=Factory3.getInstance(pro.getProperty("apple"));
        if(f!=null){
            f.eat();
        }
    }
}