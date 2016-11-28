package JavaCore;

import java.io.*;

public class ErrorDemo {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArithmeticException e) {
			System.out.println("Exception1 thrown  :" + e);
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Exception2 thrown  :" + e);
		}
		System.out.println("Out of the block");
	}
}
