package OODclass;

class Perso {
	private String name;
	private int age;

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

	public void Tell() {
		System.out.println("姓名:" + this.name + ",年龄:" + this.age);
	}

}

public class ClassDemo2 {

	public static void main(String[] args) {
		Perso per1=new Perso();
		Perso per2=new Perso();
		per1.setName("张三");
		per2.setName("里欧");
		per1.setAge(18);
		per2.setAge(19);
		/*System.out.println("1号姓名"+per1.getName()+"，年龄"+per1.getAge());
		System.out.println("2号姓名"+per2.getName()+"，年龄"+per2.getAge());*/
		per1.Tell();
		per2.Tell();
	}
}
