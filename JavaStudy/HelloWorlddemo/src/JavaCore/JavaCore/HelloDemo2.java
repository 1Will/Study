package JavaCore;

import java.io.PrintStream;

public class HelloDemo2 {

	public static void main(String[] args) {
		String args1[] = { "Will", "25" };
		PrintStream out = System.out;
		out.println("Hello World");
		out.println("I am " + args1[0] + "," + "My age is " + args1[1]);
		System.out.print("ok");
	}
}