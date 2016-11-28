package JavaCore;

public class CircleDemo3 {
	public static void main(String [] args){
	long sum = 0L,a=1L;
	for(int i=1;i<=20;i++){
		for(int j=1;j<=i;j++){
			a =j*a;
		}
		sum = a+sum;
		a=1L;
	}
	for(int j=1;j<=19;j++){
		System.out.print(j + "!+");
	}
		System.out.println("20! = " + sum);
	}
}
