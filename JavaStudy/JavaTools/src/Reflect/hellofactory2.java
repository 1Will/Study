package Reflect;

/*利用反射机制 */
/**
 * @author Rollen-Holt 设计模式之 工厂模式
 */
interface fruit1{
    public abstract void eat();
}
 
class Apple1 implements fruit1{
    public void eat(){
        System.out.println("Apple");
    }
}
 
class Orange1 implements fruit1{
    public void eat(){
        System.out.println("Orange");
    }
}
 
class Factory1{
    public static fruit1 getInstance(String ClassName){
        fruit1 f=null;
        try{
            f=(fruit1)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
class hellofactory2{
    public static void main(String[] a){
        fruit1 f=Factory1.getInstance("Reflect.Apple1");
        if(f!=null){
            f.eat();
        }
    }
}