package logIn;

public class Check {
	Library lib1 = new Library();
	String name;
	String password;

	public Check() {
		System.out.println("请输入姓名");
		name = lib1.Enter();
		System.out.println("请输入密码");
		password = lib1.Enter();
	}

	public void check() {
		String check = name + password;
		if (lib1.lib.contains(check)) {
			System.out.println("欢迎" + name + "登录！");
		} else
			System.out.println("用户不存在！");
	}
}
