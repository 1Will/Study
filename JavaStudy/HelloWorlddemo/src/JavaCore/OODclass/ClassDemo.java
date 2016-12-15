package OODclass;

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {    //构造方法
		super();
		this.name = name;
		this.age = age;
	}
	
	


	public void Tell(){
		System.out.println("姓名:" + name +",年龄:" +age);
	}
	
	
	
}

public class ClassDemo {

	public static void main(String[] args) {
		Person per1=new Person("张三",18);
		Person per2=new Person("里欧",19);
		per1.Tell();
		per2.Tell();
	}

}
