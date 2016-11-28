/*本程序适用于 ax²+bx+c=0的函数求解*/

package javaExam1;

public class EquationSolution {

	public static void Result(float a, float b, float c) { // 计算方法
		//开始处理各个变量
		float a1 = a * 2;
		float b1 = 0 - b;
		float c2 = b * b - 4 * a * c;
		float c1 = (float) Math.sqrt(c2);//调用取根号方法
		if (a == 0) {    //a=0的情况
			if (b == 0) {  //a=0,b=0的情况
				System.out.println("方程无意义");
			} else {    //此为一元一次方程的解
				System.out.println("这是一个元一次方程，结果为 x=" + (0 - c) / b);
			}
		} else {
			if (c2 < 0) {     //无解情况
				System.out.println("方程无解");
			} else {     //正常结果
				System.out.println("方程解为x1= " + ((b1 + c1) / a1));
				System.out.println("方程解为x2= " + ((b1 - c1) / a1));
			}
		}
	}

	public static void main(String[] args) { // 主程序
		float a = 1, b = -1, c = 0;
		System.out.println("本程序适用于 ax²+bx+c=0的函数：\n其中a=args[0],b=args[1],c=args[2]" + "\n");
		float a1 =0, a2 = 0, a3=0;
		try {   //从外部传参
		    a1 = Float.parseFloat(args[0]);
		    a2 = Float.parseFloat(args[1]);
		    a3 = Float.parseFloat(args[2]);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		System.out.println("方程结果为：");
		a = a1;
		b = a2;
		c = a3;
		Result(a, b, c);
	}
}
