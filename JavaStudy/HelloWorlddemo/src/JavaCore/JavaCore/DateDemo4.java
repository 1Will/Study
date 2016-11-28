package JavaCore;

import java.io.PrintStream;

public class DateDemo4 {

	public static void main(String[] args) {
		byte a = 6, b = 4, c = 0;
		int d;
		boolean i = true;
		boolean j = false;
		a += b;
		c = (byte) (c + 6);
		d = (int) (a + b);
		i = !i;
		boolean e = i && j;
		j = e;
		PrintStream pr = System.out;
		pr.println("a的值是：" + a + ";");
		pr.println("b的值是：" + b + ";");
		pr.println("c的值是：" + c + ";");
		pr.println("d的值是：" + d + ";");
		pr.println("i的值是： " + i + ";");
		pr.println("j的值是： " + j + ";");
		pr.println("i&&j的值是： " + e + ";");
		pr.println("i||j的值是： " + (i || j) + ";");

	}
}
