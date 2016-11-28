package Interface;

public class AB implements A, B{
	public void sayA(){
		System.out.println("A说：我叫"+ nameA);
	}
	public void sayB(){
		System.out.println("B说：我叫"+ nameB);
	}
	public static void main(String[] args){
		A a =new AB();
		B b =new AB();
		a.sayA();
	    b.sayB();
	}
}