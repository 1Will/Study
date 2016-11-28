package JavaCore;

import java.util.Scanner;

class Print {

	public float Enter() { // 键入数据方法
		Scanner sc = new Scanner(System.in);
		float date = sc.nextFloat();
		// sc.close();
		return date;
	}

	public void PrintUpHollow(int a1) { // 打印正空心三角形
		System.out.println("数字" + a1 + "对应的空心三角形为:\n");
		int b = 0, i1 = 1;
		for (int i = a1; i >= 1; i -= 2) {
			for (int j = 1; j <= ((i - 1) / 2); j++) {
				System.out.print(" ");
			}
			if (i == 1 || i == 2) {
				for (int i2 = 1; i2 <= a1; i2 += 2)
					System.out.print("* ");

			} else {
				System.out.print("*");
				if (i1 != 1) {
					for (int x = 0; x <= b; x += 1) {
						System.out.print(" ");
					}
					b += 2;
					System.out.print("*");
				}
				i1++;
				System.out.println();
			}
		}
		System.out.println();
	}

	public void PrintDownHollow(int a1) { // 打印倒空心三角形
		System.out.println("数字" + a1 + "对应的倒立空心三角形为:\n");
		if (a1 % 2 == 0) {
			a1 = a1 - 1;
		}
		int b = a1 - 4;

		for (int i = a1; i >= 1; i -= 2) {

			for (int j = i; j < a1; j += 2) {
				System.out.print(" ");
			}
			if (i == a1) {
				for (int i2 = 1; i2 <= a1; i2 += 2)
					System.out.print("* ");

			} else {
				System.out.print("*");
				if (i != 1) {
					for (int x = 1; x <= b; x += 1) {
						System.out.print(" ");
					}
					b -= 2;
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

	public void PrintUpSolid(int a2) { // 打印正实心三角形
		System.out.println("数字" + a2 + "对应的实心三角形为:\n");
		int b = 1;
		for (int i = a2; i >= 1; i -= 2) {
			for (int j = 1; j <= ((i - 1) / 2); j++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= b; x += 1) {
				System.out.print("*");
			}
			b += 2;
			System.out.println();
		}
		System.out.println();
	}

	public void PrintDownSolid(int a2) { // 打印倒实心三角形
		System.out.println("数字" + a2 + "对应的实心三角形为:\n");
		if (a2 % 2 == 0) {
			a2 = a2 - 1;
		}
		int b = a2;
		for (int i = a2; i >= 1; i -= 2) {
			for (int j = i; j < a2; j += 2) {
				System.out.print(" ");
			}
			for (int x = 1; x <= b; x += 1) {
				System.out.print("*");
			}
			b -= 2;
			System.out.println();
		}
		System.out.println();
	}
}
public class PrintTriangle2 {
	public static void main(String[] args) { // 主方法
		Print p1= new Print();
		System.out.println("说明：数字1和数字2图案一样，以此类推。");
		System.out.println("请输入数字：");
		float a1 = p1.Enter();
		int a = (int) a1;
		p1.PrintDownSolid(a);
		p1.PrintUpSolid(a);
		p1.PrintDownHollow(a);
		p1.PrintUpHollow(a);

	}
}