package ClassDemo01;

public class ClassDemo03 {

	public static void main(String[] args) {
		Person per = null; // 声明对象
		per = new Person() ; // 实例化对象
		per.name = "张三"; // 为姓名赋值
		per.age = 30; // 为年龄赋值
		per.tell();
	}

}
