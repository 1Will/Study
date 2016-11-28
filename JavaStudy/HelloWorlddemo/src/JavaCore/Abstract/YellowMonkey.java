package Abstract;

public class YellowMonkey extends Monkey{
	public YellowMonkey(String name, int weight) {
		super(name, weight);
	}

	public static void main(String[] args){
		System.out.println("这是孙类");
		
		Animal huang= new Monkey("猴子",10);//调用父类构造方法
		
		huang.Tell1();
		huang.tellname();
		huang.tellweight();
		Monkey huang1 =(Monkey) huang;//向下转型
		huang1.monkeySkill();
	}
}
