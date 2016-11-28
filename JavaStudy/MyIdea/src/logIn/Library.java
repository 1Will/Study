package logIn;

import java.util.ArrayList;
import java.util.Scanner;

public final class Library {
	private String list;
	private String name;
	private String password;
	ArrayList<String> lib = new ArrayList<String>();

	public static String Enter() { // 键入数据方法
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		/* sc.close(); */
		return date;
	}

	public Library() {
		System.out.println("开始注册用户！");
		for (int i = 1; i < 100; i++) {
			System.out.println("输入任意数则开始，输入0停止！");
			int a = 1;
			try {
				String b = Enter();
				a = Integer.parseInt(b);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (a == 0) {
				System.out.println("录入结束！");
				break;
			}
			System.out.println("请录入姓名");
			name = Enter();
			System.out.println("请录入密码");
			password = Enter();
			System.out.println("已经录入了" + i + "个！是否继续？");
			list = name + password;
			lib.add(list);
		}
	}

	@Override
	public String toString() {
		System.out.println(lib);
		return null;
	}
}
