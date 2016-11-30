package ThisDemo;

class Per{		// 定义Person类
	public String getInfo(){	// 取得信息的方法
		System.out.println("Person类 --> " + this) ; // 直接打印this
		return null ; // 为了保证语法正确，返回null
	}
};
public class ThisDemo05{
	public static void main(String args[]){
		Per per1 = new Per() ;	// 调用构造实例化对象
		Per per2 = new Per() ;	// 调用构造实例化对象
		System.out.println("MAIN方法 --> " + per1) ;	// 直接打印对象
		per1.getInfo() ;	// 当前调用getInfo()方法的对象是per1
		System.out.println("MAIN方法 --> " + per2) ;	// 直接打印对象
		per2.getInfo() ;	// 当前调用getInfo()方法的对象是per2
	}
};