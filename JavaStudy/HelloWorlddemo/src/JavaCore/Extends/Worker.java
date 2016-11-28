package Extends;

public class Worker extends Person {
	static String work;
	public Worker(String name,String id,Integer age,String work) {
		super(name, id, age);
		this.work=work;
	}
	public static void say(){
	System.out.println("work="+ work);
}
}
/*setId("ID-123");
worker1.setAge(18);
worker1.setName("张三");*/