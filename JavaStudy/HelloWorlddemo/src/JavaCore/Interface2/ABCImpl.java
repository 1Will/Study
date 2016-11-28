package Interface2;

public class ABCImpl implements B, C{
	public void sayA(){
		System.out.println("A说：我叫" + nameA);
	}
	public void sayB(){
		System.out.println("B说：我叫"+ nameB);
	}
	@Override
	public void sayC() {
		System.out.println("C说：我叫"+ nameC);
	}
	public static void main(String[] args){
		A a =new ABCImpl();
		B b =new ABCImpl();
		C c =new ABCImpl();
		a.sayA();
	    b.sayB();
	    c.sayC();
	}
	
}