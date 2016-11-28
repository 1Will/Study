package InterClassDemo;

class Out{
	private String pp = "Hello World";
	class Inter{
		public void print(){
			System.out.println(pp);
		}
	}
	public void inter(){
		new Inter().print();
	}
}
public class Inter1 {

	public static void main(String[] args) {
		new Out().inter();
	}

}
