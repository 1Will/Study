package JavaCore;

public class DateTypeDemo {
	public static void main(String[] args) {
		// byte
		byte a1 = 10;
		byte a2 = 20, a3;
		System.out.println("byte:" + a2);

		// short
		short b1 = 10;
		short b2 = 20, b3;
		System.out.println("short:" + b2);

		// int
		int c1 = 20;
		int c2 = 10, c3;
		System.out.println("c2 int:" + c2);
		System.out.println("c2 int二进制:" + Integer.toBinaryString(c2) );
		System.out.println("c2<<30 int二进制:" + Integer.toBinaryString(c2<<30) );
		

		// long
		long d1 = 40L;
		long d2 = 50L, d3;
		System.out.println("long:" + d2);

		// float
		float e1 = 20;
		float e2 = 30, e3;
		System.out.println("float:" + e2);

		// double
		double f1 = 100;
		double f2 = 101, f3;
		System.out.println("double:" + f2);

		// char
		char g1 = 80;
		char g2 = 100, g3;
		System.out.println("char:" + g2);

		a3 = (byte) (a1 + b1);
		b3 = (short) (b1 + c1);
		c3 = (int) (c1 + d1);
		d3 = (long) (d1 + e1);
		e3 = (float) (e1 + f1);
		f3 = f1 + g1;
		g3 = (char) (g1 + a1);
		System.out.println("\n" + a3 + "\n" + b3+ "\n" + c3 + "\n" + d3+ "\n" + e3 + "\n" + f3 + "\n" + g3 );
		
	}
}