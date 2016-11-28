package typeDemo;

class Tt<T>{

	T ob;

	Tt(T o){
	ob=o;
}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of ob is" + ob.getClass().getName());
	}
	public static void main(String[] args){
		Tt t=new Tt(123);
		t.showType();
	}
	
}