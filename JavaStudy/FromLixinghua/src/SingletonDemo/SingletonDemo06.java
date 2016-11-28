package SingletonDemo;

public class SingletonDemo06 {

	public static void main(String[] args) {
		Sing s1=null;
		Sing s2=null;
		Sing s3=null;
		s1=Sing.getInstance();
		s2=Sing.getInstance();
		s3=Sing.getInstance();
		s1.print();
		s2.print();
		s3.print();
	}

}
