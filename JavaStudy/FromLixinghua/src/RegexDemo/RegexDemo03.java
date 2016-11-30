package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo03 {

	public static void main(String[] args) {
		String str="1988-06-12";
		String pat="\\d{4}-\\d{2}-\\d{2}";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(str);
		if(m.matches()){
			System.out.println("日期格式正确！");
		}else {
			System.out.println("日期格式不正确！");
		}
	}

}
