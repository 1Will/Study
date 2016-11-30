package ConsDemo;

class Person1{
	private String name;
	private int age;
	public Person1(){}
	public Person1(String n){			// 声明有一个参数的构造方法
		this.setName(n) ;
	}
	public Person1(int a){			// 声明有一个参数的构造方法
		this.setAge(a) ;
	}
	public Person1(String n,int a){
		this.setName(n);
		this.setAge(a);
	}
	public void setName(String n){
		this.name=n;
	}
	public void setAge(int a){
		if(a>0&&a<150){
		this.age=a;
		}
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void tell(){
		System.out.println("姓名：" + this.getName() + "；年龄：" + this.getAge()) ;
	}
}

public class ConsDemo02 {

	public static void main(String[] args) {
		System.out.println("声明对象：Person per = null ;") ;
		Person1 per = null ;	// 声明对象时并不去调用构造方法
		System.out.println("实例化对象：per = new Person(\"张三\",30) ;") ;
		per = new Person1("张三",30) ;//实例化对象
		per.tell() ;
		new Person1("张三",30).tell() ;//匿名对象
	}
}
