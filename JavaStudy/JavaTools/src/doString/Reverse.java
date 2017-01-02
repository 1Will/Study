package doString;

public class Reverse {
	public static String reverse(String str) {
		char[] c1=new char[100];
		char[] c2=new char[c1.length];
		c1=str.toCharArray();
		for(int i=c1.length-1,j=0;i>=0;i--,j++){
			c2[j]=c1[i];
		}
		String str1 =new String(c2);
		return str1;
	}


public static void main(String[] args){
	String str1="sagsdfsd";
	System.out.println(reverse(str1));
	}
}
