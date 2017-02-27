package test;

public class Person {
	public String name;

	public static void main(String[] args) {
		Person a= new Person();
		a.name="zhangsan";
		Person b=a;
		Person c=b;
		c.name="lisi";
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
	}

}
