package ConsDemo;

class Person{
	public Person(){
		System.out.println("一个新的Person对象产生。");
	}
}

public class ConsDemo01 {

	public static void main(String[] args) {
		System.out.println("声明对象：Person per = null ;") ;
		Person per = null ;	// 声明对象时并不去调用构造方法
		System.out.println("实例化对象：per = new Person() ;") ;
		per = new Person() ;//实例化对象
	}

}
