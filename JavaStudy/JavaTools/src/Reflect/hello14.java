package Reflect;
/*如何获得类加载器*/
class test {

}

public class hello14 {
	public static void main(String[] args) {
		test t = new test();
		System.out.println("类加载器  " + t.getClass().getClassLoader().getClass().getName());
	}
}
