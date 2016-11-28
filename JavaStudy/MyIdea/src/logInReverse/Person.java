package logInReverse;

import java.util.Scanner;

public class Person {
	private String name;
	private String password;
	Scanner sc =new Scanner(System.in);
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}

	public Person(){
		System.out.println("请输入姓名");
		this.name = sc.nextLine();
		System.out.println("请输入密码");
		this.password = sc.nextLine();
	}
	@Override
	public String toString() {
		return "姓名:"+name+"密码："+password;
	}
}