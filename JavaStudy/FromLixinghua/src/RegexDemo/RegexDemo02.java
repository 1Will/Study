package RegexDemo;

import java.util.regex.Pattern;

public class RegexDemo02 {

	public static void main(String[] args) {
		String str="1234567890";
		if(Pattern.compile("[0-9]+").matcher(str).matches()){
			System.out.println("全是数字！");
		}else{
			System.out.println("不全是数字！");
		}
	}

}
