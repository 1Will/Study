package JavaCore;

class A{
	public A(String a){
		System.out.println("使用了基类的构造方法");
	}
}


public class Testt1 extends A{

	public Testt1(String a) {
		super(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Testt1 t =new Testt1("abc");
	}

}
