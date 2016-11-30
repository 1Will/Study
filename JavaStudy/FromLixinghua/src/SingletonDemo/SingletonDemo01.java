package SingletonDemo;

import org.omg.CORBA.PUBLIC_MEMBER;

class Singleton{
	static Singleton instance=new Singleton();
	private Singleton(){}
	public void print(){
		System.out.println("Hello world!");
	}
}

public class SingletonDemo01 {

	public static void main(String[] args) {
		Singleton s1=null;
		s1=Singleton.instance;
		s1.print();
		Singleton.instance.print();
	}

}
