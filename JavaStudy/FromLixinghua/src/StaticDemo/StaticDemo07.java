package StaticDemo;
class Demo1{
	private String name;
	private static int count =0;
	public Demo1(){
		count++;
		this.name="DEMO-"+count;
	}
	public Demo1(String name){
		this.name = name;			// 可以通过构造赋值
	}
	public String getName(){		// 取得姓名
		return this.name ;
	}
}
public class StaticDemo07 {

	public static void main(String[] args) {
		System.out.println(new Demo1().getName());
		System.out.println(new Demo1("LXH").getName());
		System.out.println(new Demo1().getName());
		System.out.println(new Demo1("MLDN").getName());
		System.out.println(new Demo1().getName());
	}

}
