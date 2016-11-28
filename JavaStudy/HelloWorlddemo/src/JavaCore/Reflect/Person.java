package Reflect;
interface China {
	public static final String name = "Rollen";
	public static int age = 20;

	public void sayChina();

	public void sayHello(String name, int age);
}
class Person implements China{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}
	@Override
	public void sayChina() {
		System.out.println("hello ,china");
	}

	@Override
	public void sayHello(String name, int age) {
		System.out.println(name + "  " + age);
	}
}
class Person1 implements China {
	public Person1() {

	}

	public Person1(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void sayChina() {
		System.out.println("hello ,china");
	}

	@Override
	public void sayHello(String name, int age) {
		System.out.println(name + "  " + age);
	}

	private String sex;
}
