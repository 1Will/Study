package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo04 {

	public static void main(String[] args) {
		String str="A121B213C543D543E89F";
		String pat="\\d+";
		Pattern p=Pattern.compile(pat);
		String []s=p.split(str);
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
	}

}
