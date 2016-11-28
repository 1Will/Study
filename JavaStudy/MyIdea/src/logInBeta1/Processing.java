package logInBeta1;

import java.io.*;
import java.util.Scanner;

public class Processing {
	File file = new File("D:" + File.separator + "login" + File.separator + "Library" + File.separator + "User.txt");

	public void creatFile() {
		File f = new File(file.getParent());
		if (!f.exists()) {
			f.mkdirs();
		} else {
			System.out.println("文件夹已存在！");
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile(String str1) throws IOException { // 写入文件方法
		OutputStream output = new FileOutputStream(file, true); // append为true，写入不覆盖
		byte[] b = str1.getBytes();
		output.write(b);
		output.close();
	}

	public String readerFile() throws IOException { // 读取文件方法
		InputStream input = new FileInputStream(file);
		byte[] b = new byte[(int) file.length()]; // 将字符串结果存储到一个新的 b数组中
		input.read(b);
		input.close();
		String st = new String(b); // 将字节数组内容转为字符串
		return st;
	}

	public void addUser() {
		System.out.println("请输入要录入账户的数量：");
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) {
			System.out.println("数据有误！系统退出！");
			System.exit(0);
		} else {
			try {
				int a = sc.nextInt();
				Library li = new Library(a);
				creatFile();
				Object[] st = li.lib.toArray();
				for (Object j : st) {
					writeFile(j.toString() + "#");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}

	public String Check() throws IOException {
		Person per1 = new Person();
		String str1 = per1.toString();
		String str2 = readerFile();
		String[] num = str2.split("#");
		for (int i = 0; i < num.length; i++) {
			if (num[i].equals(str1)) {
				return "欢迎" + per1.getName() + "登录！";
			}
		}
		return "用户不存在，或密码错误！";
	}

	public void delete() {
		file.delete();
		File f1 = file.getParentFile();
		f1.delete();
		File f2 = f1.getParentFile();
		f2.delete();
	}
}
