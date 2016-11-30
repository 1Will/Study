package RefDemo;

class Demo2{						// 定义Demo类
	private int temp  = 30 ;	// 声明temp属性并封装
	public void fun(Demo2 d2){	// 接收本类的引用
		d2.temp = 60 ;			// 直接通过对象调用本类的私有属性
	}
	public int getTemp(){		// getter
		return temp ;
	}
	public void setTemp(int t){	// setter
		temp = t ;
	}
};
public class RefDemo04{
	public static void main(String args[]){
		Demo2 d1 = new Demo2() ;	// 实例化Demo对象
		d1.setTemp(50) ;		// 只能通过setter方法修改内容
		d1.fun(d1) ;			// 此处把Demo的对象传回到自己的类中
		System.out.println("temp = " + d1.getTemp()) ;
	}
};
