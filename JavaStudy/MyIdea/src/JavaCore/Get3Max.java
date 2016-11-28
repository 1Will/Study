package JavaCore;

import java.util.Scanner;

public class Get3Max {
	public static void main(String args[]){
		float []a ;
		float max=0;
		a = new float[3];
		for(int i=0;i<=2;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数字：");
			float date = sc.nextFloat();
			a[i] = date;
			sc.close();
		}
		max = Max(a[0],a[1],a[2]);
		System.out.println("最大值是：" + max);
	}
	
	public static float Max(float x1,float x2,float x3){
		float getmax =0;
		getmax = Math.max(x1, getmax);
		getmax = Math.max(x2, getmax);
		getmax = Math.max(x3, getmax);
		return getmax;
		
	}
		
	
}

/*class GetNo(){
	System.out.println("输入的是：" + a1);
	System.out.println("输入的是：" + a[0] +"\n"+ a[1] +"\n"+ a[2]);
}

*/