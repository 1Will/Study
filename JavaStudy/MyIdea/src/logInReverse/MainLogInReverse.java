package logInReverse;

import java.io.IOException;

public class MainLogInReverse {

	public static void main(String[] args) {
		Processing p = new Processing();
		try {
			System.out.println(p.Check());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
