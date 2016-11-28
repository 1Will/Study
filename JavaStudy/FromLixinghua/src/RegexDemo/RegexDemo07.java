package RegexDemo;

public class RegexDemo07 {

	public static void main(String[] args) {
		String info = "LXH:98|MLDN:90|LI:100" ;	
		String s[]=info.split("\\|");
		for(String str : s){
			String s1[]=str.split(":");
			System.out.println(s1[0]+"-->"+s1[1]);
		}
	}
}
