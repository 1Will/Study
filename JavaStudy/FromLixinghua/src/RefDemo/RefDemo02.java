package RefDemo;

public class RefDemo02 {

	public static void main(String[] args) {
		String str1 = "hello" ;			// 实例化字符串对象
		System.out.println("fun()方法调用之前：" + str1) ;
		fun(str1) ;						// 调用fun()方法
		System.out.println("fun()方法调用之后：" + str1) ;
	}
	public static void fun(String str2){		// 此处的方法由主方法直接调用
		str2="MLDN";						// 修改temp值
	}
}
