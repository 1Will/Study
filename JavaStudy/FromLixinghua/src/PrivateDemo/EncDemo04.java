package PrivateDemo;

class Person1{
	private String name ;			// 声明姓名属性
	private int age ;				// 声明年龄属性
	public void setName(String n){	// 设置姓名
		name = n ;
	}
	public void setAge(int a){		// 设置年龄
		if(a>0&&a<100){
			age = a ;
		}
	}
	public String getName(){		// 取得姓名
		return name ;
	}
	public int getAge(){			// 取得年龄
		return age ;
	}
	public void tell(){
		System.out.println("姓名：" + name + "，年龄：" + age) ;
	}
};
public class EncDemo04{
	public static void main(String arsgh[]){
		Person1 per = new Person1() ;	// 声明并实例化对象
		per.setName("张三") ;		// 调用setter设置姓名
		per.setAge(30) ;			// 调用setter设置年龄
		per.tell() ;				// 输出信息
	}
};
