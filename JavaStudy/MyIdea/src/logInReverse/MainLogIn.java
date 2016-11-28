package logInReverse;

import java.io.IOException;

import logInBeta1.Processing;

public class MainLogIn {

	public static void main(String[] args) {
		Processing p = new Processing();
		try {
			System.out.println(p.Check());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
