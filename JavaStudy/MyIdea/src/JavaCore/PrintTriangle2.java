package JavaCore;

import java.util.Scanner;

class Print {

	public float Enter() { // �������ݷ���
		Scanner sc = new Scanner(System.in);
		float date = sc.nextFloat();
		// sc.close();
		return date;
	}

	public void PrintUpHollow(int a1) { // ��ӡ������������
		System.out.println("����" + a1 + "��Ӧ�Ŀ���������Ϊ:\n");
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

	public void PrintDownHollow(int a1) { // ��ӡ������������
		System.out.println("����" + a1 + "��Ӧ�ĵ�������������Ϊ:\n");
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

	public void PrintUpSolid(int a2) { // ��ӡ��ʵ��������
		System.out.println("����" + a2 + "��Ӧ��ʵ��������Ϊ:\n");
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

	public void PrintDownSolid(int a2) { // ��ӡ��ʵ��������
		System.out.println("����" + a2 + "��Ӧ��ʵ��������Ϊ:\n");
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
	public static void main(String[] args) { // ������
		Print p1= new Print();
		System.out.println("˵��������1������2ͼ��һ�����Դ����ơ�");
		System.out.println("���������֣�");
		float a1 = p1.Enter();
		int a = (int) a1;
		p1.PrintDownSolid(a);
		p1.PrintUpSolid(a);
		p1.PrintDownHollow(a);
		p1.PrintUpHollow(a);

	}
}