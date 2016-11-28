package JavaCore;

import java.util.Scanner;

public class Equation2 {

	public static float Enter() {   //从键盘获取数据
		Scanner sc = new Scanner(System.in);
		float date = sc.nextFloat();
		return date;
	}

	public static void Result(float a, float b, float c) { // 方程的求解方法
		float a1 = a * 2;
		float b1 = 0 - b;
		float c2 = b * b - 4 * a * c;
		float c1 = (float) Math.sqrt(c2);
		if (a == 0) {   //a=0的情况分析
			if (b == 0) {  //若b=0
				System.out.println("方程无意义");
			} else {      //一元一次方程的求解
				System.out.println("方程的解为：x=" + (0 - c) / b);
			}
		} else {
			if (c2 < 0) {     //b²-4ac<0的情况
				System.out.println("方程无解！");
			} else {      //正常求解
				System.out.println("方程第一个解为：x1= " + ((b1 + c1) / a1));
				System.out.println("方程第二个解为：x2= " + ((b1 - c1) / a1));
			}
		}
	}

	public static void main(String[] args) {     //主程序
		float a = 1, b = -1, c = 0;
		System.out.println("这是个求解ax²+bx+c=0方程的程序：" + "\n");
		System.out.println("请输入a的值");
		a = Enter();
		System.out.println("请输入b的值");
		b = Enter();
		System.out.println("请输入c的值");
		c = Enter();
		Result(a, b, c);
	}
}
