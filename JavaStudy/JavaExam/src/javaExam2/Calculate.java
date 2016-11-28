package javaExam2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculate {
	static File f1 = new File("D:" + File.separator + "Tem.txt"); // 定义配置文件路径

	public static void writeFile(String str1) throws IOException { // 写入文件方法
		OutputStream output = new FileOutputStream(f1, true); // append为true，写入不覆盖
		byte[] b = str1.getBytes();
		output.write(b);
		output.close();
	}

	public static int[] getNum() {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int b[] = { 0, 0 };
		System.out.println("请输入数字范围：");
		str1 = sc.nextLine();
		System.out.println("请输入除数：");
		str2 = sc.nextLine();
		int a[] = new int[2];
		sc.close();
		try {
			a[0] = Integer.parseInt(str1);
			a[1] = Integer.parseInt(str2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("检测到输入不是数字，程序关闭");
			System.exit(0);
		}
		if (a[0] >= 0 && a[1] > 0 && a[0] >= a[1]) {
			return a;
		} else {
			System.out.println("数据范围有误");
			System.exit(0);
			return b;
		}
	}

	public static void calculate1() throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = getNum();
		int max = 0, min = 0, sum = 0;
		float avg = 0f;
		for (int i = 0; i <= a[0]; i++) {
			if (i % a[1] == 0) {
				list.add(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sum = list.get(i) + sum;
		}
		min = list.get(0);
		max = list.get(list.size() - 1);
		avg = sum / list.size();
		System.out.println("符合的数集为：" + "\n" + list);
		System.out.println("符合的数有：" + list.size() + "个");
		System.out.println("最小值为：" + min);
		System.out.println("最大值为：" + max);
		System.out.println("所有数总和为：" + sum);
		System.out.println("所有数平均值为：" + avg);
		writeFile("\r\n\r\n结果：");
		writeFile("\r\n符合的数集为：" + "\r\n" + list);
		writeFile("符合的数有：" + list.size() + "个");
		writeFile("\r\n最小值为：" + min);
		writeFile("\r\n最大值为：" + max);
		writeFile("\r\n所有数总和为：" + sum);
		writeFile("\r\n所有数平均值为：" + avg);
	}

	public static void main(String[] args) {
		System.out.println("本程序适用于求指定范围内所有能整除一个除数的集");
		if (f1.exists()) { // 确保所在目录没有重名文件
			f1.delete();
		}
		try {
			writeFile("要求：");
			writeFile("\r\nA.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档");
			writeFile("\r\nB.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！");
			writeFile("\r\nC.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？");
			calculate1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
