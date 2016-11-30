package RegexDemo;

public class RegexDemo06 {

	public static void main(String[] args) {
		String str="A12B3421C432D324E32F".replaceAll("\\d+", "_");
		boolean temp="1983-05-06".matches("\\d{4}-\\d{2}-\\d{2}");
		String s[]="A12B3421C432D324E32F".split("\\d+");
		System.out.println("字符串替换操作：" +str);
		System.out.println("字符串验证：" +temp);
		System.out.println("字符串的拆分：");
		for(String i : s){
			System.out.print(i+"\t");
		}
	}

}
