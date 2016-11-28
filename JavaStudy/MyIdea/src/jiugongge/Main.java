package jiugongge;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Deal dl=new Deal();
		dl.readFile();
		dl.deal();
		/*dl.print(dl.a);*/
	}
}
