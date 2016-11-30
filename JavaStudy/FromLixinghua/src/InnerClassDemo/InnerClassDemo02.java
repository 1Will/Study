package InnerClassDemo;

class Outer1{		// 定义外部类
	private static String info = "hello world" ;	// 定义外部类的私有属性
	static class Inner{	// 使用static定义内部类为外部类
		public void print(){				// 定义内部类的方法
			System.out.println(info) ;		// 直接访问外部类的私有属性
		}
	};
	public void fun(){						// 定义外部类的方法
		new Inner().print() ;				// 通过内部类的实例化对象调用方法
	}
};
public class InnerClassDemo02{
	public static void main(String args[]){
		new Outer1.Inner().print() ;					// 调用外部类的fun()方法
	}
};