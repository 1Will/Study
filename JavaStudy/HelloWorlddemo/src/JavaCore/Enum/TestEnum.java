package Enum;

public class TestEnum {

	
	
	public void print(MonthEnum mon){
		switch (mon) {
		case January:
			System.out.println("一月");
			break;
		case February:
			System.out.println("二月");
			break;
		case March:
			System.out.println("三月");
			break;
		case April:
			System.out.println("四月");
			break;
		case May:
			System.out.println("五月");
			break;
		case June:
			System.out.println("六月");
			break;
		case July:
			System.out.println("七月");
			break;
		case August:
			System.out.println("八月");
			break;
		case September:
			System.out.println("九月");
			break;
		case October:
			System.out.println("十月");
			break;
		case November:
			System.out.println("十一月");
			break;
		default:
			System.out.println("十二月");
		}
	}
	
	public static void main(String[] args) {
		TestEnum ts=new TestEnum();
		System.out.println("第1次*******************");
		ts.print(MonthEnum.September);
		System.out.println("第2次*******************");
		
		MonthEnum[] enum1 = MonthEnum.values();
		
		for(MonthEnum enum2:enum1){
			System.out.println(enum2);
		}
		
		System.out.println("第3次*******************");
		for(MonthEnum enum2:enum1){
			System.out.println(enum2.ordinal() + "--->"+ enum2.name());
		}
	}
	

}
