package Extends;

public class Star extends Person {
	static String work;
	public Star(){}
	public Star(String id,String name,String work) {
		super(id, name);
		this.work=work;
	}
	public static void song(){
	System.out.println("work="+ work);
}
}

