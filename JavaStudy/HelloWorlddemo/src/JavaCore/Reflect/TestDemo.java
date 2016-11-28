package Reflect;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1=Class.forName("Reflect.Person");
		Class<?> c2=new Person().getClass();
		Class<?> c3=Person.class;
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println("**********************");
		
	}

}
