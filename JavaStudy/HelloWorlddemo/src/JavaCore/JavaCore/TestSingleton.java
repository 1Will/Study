package JavaCore;
/*单例模式*/
public class TestSingleton {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	private TestSingleton() {
	}

	public static TestSingleton geTest() {
		TestSingleton test = new TestSingleton();
		return test;
	}

	public static void main(String args[]) {
		TestSingleton test=geTest();
		test.setName("abb");
		System.out.print(test.getName());
	}
}
