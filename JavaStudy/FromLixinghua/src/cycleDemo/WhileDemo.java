package cycleDemo;

public class WhileDemo {

	public static void main(String[] args) {
		int x=1;
		int sum = 0;
		while(x<=10){
			sum+=x;
			x++;
		}
		System.out.println("1 --> 10 累加的结果为：" + sum) ;
	}

}
