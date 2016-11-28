package JavaCore;

public class Test2 {
	public void pupAge() {
		int age = 0;
		age = age + 5;
		System.out.println("小狗的数量是" + age);
	}

	public static void main(String args[]) {
		Test2 test = new Test2();
		test.pupAge();
	}
}