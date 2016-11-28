package Extends;

public class Person {
	private String id;
	private String name;
	private Integer age ;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
	}
	public Person(String id) {
		super();
		this.id = id;
	}
	public Person(String name,String id,Integer age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return"id=" + id + ", name=" + name + ", age=" + age ;
	}
}
