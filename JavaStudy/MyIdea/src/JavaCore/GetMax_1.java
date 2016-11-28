package JavaCore;

import java.util.Scanner;

public class GetMax_1 {
	public static void main(String args[]) {
		float max = 0, Nub = 0;
		System.out.println("请输入数据个数：");
		float n = Enter(Nub);
		int m =(int)n;
		float[] a;
		a = new float[m];
		for (int i = 0; i <= (n - 1); i++) {
			System.out.println("请输入第" + (i+1) + "个数：");
			a[i] = Enter(Nub);
		}
		for (int j = 0; j <= (n - 1); j++) {
			max = Math.max(a[j], max);
		}
		System.out.println("所输入数中最大值是：" + max);
	}
	public static float Enter(float No) {
		Scanner sc = new Scanner(System.in);
		float date = sc.nextFloat();
		sc.close();
		return date;
	}
}