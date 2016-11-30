package SingletonDemo;

class Sing{
	private static Sing instance=new Sing();
	public static Sing getInstance(){
		return instance;
	}
	private Sing(){}
	public void print(){
		System.out.println("Hello World!!!");
	}
}
public class SingletonDemo05 {

	public static void main(String[] args) {
		Sing s1=null;
		s1=Sing.getInstance();
		s1.print();
	}

}
