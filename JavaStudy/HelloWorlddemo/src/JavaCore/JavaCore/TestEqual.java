package JavaCore;

public class TestEqual {

	public static void main(String[] args) {
		String s1=new StringBuilder("ja").append("va").toString();
		System.out.println(s1.intern());
		String s2=new StringBuilder("ja").append("va").toString();
		System.out.println(s2.intern().equals(s2));
		String s3=new StringBuilder("ja").append("va").toString();
		System.out.println(s3.intern()==s3);
	}

}
