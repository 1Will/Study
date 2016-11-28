package logInReverse;

import java.util.ArrayList;

public final class Library {
	ArrayList<Person> lib = new ArrayList<Person>();

	public Library(int a) {
		System.out.println("开始注册账户！\n");
		for (int i = 0; i < a; i++) {
			lib.add(new Person());
		}
		System.out.println("用户录入完成！录入" + a + "个用户");
	}
}
