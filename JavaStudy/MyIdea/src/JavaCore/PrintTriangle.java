package JavaCore;


public class PrintTriangle {

	public static void Print(int a){         //打印等腰三角形
		System.out.println("输入的值为" + a);
		int b=1;
		for(int i=a;i>=1;i-=2){
			for(int j=1;j<=((i-1)/2);j++){
				System.out.print(" ");
			}
			for(int x=1;x<=b;x+=1){
				System.out.print("*");
			}
			b+=2;
				System.out.println();
		}
				System.out.println();
	}
	public static void main(String[] args) {   //主程序
		Print(19);
	}
}
