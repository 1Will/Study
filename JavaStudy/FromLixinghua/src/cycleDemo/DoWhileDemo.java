package cycleDemo;

public class DoWhileDemo {
	// 完成一个四则运算的功能
	public static void main(String[] args) {
		int x=1;
		int sum=0;
		do{
			sum +=x;
			x++;
		}while(x<=10);
		System.out.println("1 --> 10 累加的结果为：" + sum) ;
		
	}

}
