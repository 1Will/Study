package InnerClassDemo;

class Outerr{
	private String info="hello world";
	public String getInfo(){
		return this.info;
	}
	public void fun(){
		new Inner(this).print();
	}
	class Inner{
		private Outerr out=null;
		public Inner(Outerr out){
			this.out=out;
		}
		public void print(){
			System.out.println(this.out.getInfo());
		}
	}
}

public class InnerClassDemo03 {

	public static void main(String[] args) {
		new Outer().fun();
	}

}
