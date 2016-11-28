package ClassDemo01;

public class ClassDemo06 {

	public static void main(String[] args) {
		Person per1 = null ;		// 声明per1对象
		Person per2 = null ;		// 声明per2对象
		per1 = new Person() ;		// 实例化per1对象
		per2 = new Person() ;		// 实例化per2对象

		per1.name = "张三" ;		// 设置per1中的name属性内容
		per1.age = 30 ;				// 设置per1中的age属性内容
		per2.name = "李四" ;
		per2.age = 33 ;				// 设置per2中的age属性内容
		
		per2=per1;
		
		System.out.print("per1对象中的内容 --> ") ;
		per1.tell() ;				// 调用类中的方法
		System.out.print("per2对象中的内容 --> ") ;
		per2.tell() ;				// 调用类中的方法
	}

}
