package Reflect;
/*一个类实现的接口*/

public class hello04 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("Reflect.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 *  确定此对象所表示的类或接口实现的接口。
		 *  如果此对象表示一个类，则返回值是一个数组，它包含了表示该类所实现的所有接口的对象。
		 *  数组中接口对象顺序与此对象所表示的类的声明的 implements子句中接口名顺序一致。
		 */
		Class<?> intes[] = demo.getInterfaces();
		for (int i = 0; i < intes.length; i++) {
			System.out.println("实现的接口   " + intes[i].getName());
		}
	}
}
