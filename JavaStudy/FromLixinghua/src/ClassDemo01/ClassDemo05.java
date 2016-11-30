package ClassDemo01;

public class ClassDemo05 {

	public static void main(String[] args) {
		Person per1=null;
		Person per2=null;
		per1 =new Person();
		per2=per1;
		per1.name="张三";
		per1.age=30;
		per2.age=33;
		System.out.print("per1对象中的内容 --> ") ;
		per1.tell() ;				// 调用类中的方法
		System.out.print("per2对象中的内容 --> ") ;
		per2.tell() ;				// 调用类中的方法
	}
}