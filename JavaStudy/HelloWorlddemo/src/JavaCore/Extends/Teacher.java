package Extends;

public class Teacher extends Person {
	static String work;
	public Teacher(String name,Integer age,String work) {
		super(name, age);
		this.work=work;
		
	}
	public static void teach(){
	System.out.println("work="+ work);
}
}
