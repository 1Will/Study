package JavaCore;


public class CircleDemo2 {
	public static void main(String [] args){
		int sum =0;
		for(int i=1;i<=10000;i++){
			int a=i/1000;
			int b=(i-a*1000)/100;
			int c=(i-a*1000-b*100)/10;
			int d=i-a*1000-b*100-c*10;
			sum=a*a*a+b*b*b+c*c*c+d*d*d;
			if(i==sum){
				System.out.println("i= " + i);
			}
		}
	}
	

}
