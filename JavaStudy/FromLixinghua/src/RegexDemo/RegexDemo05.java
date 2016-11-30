package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo05 {

	public static void main(String[] args) {
		String str="A12B3421C432D324E32F";
		String pat="\\d+";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(str);
		String newString =m.replaceAll("_");
		System.out.println(newString);
	}

}
