package FileDemo;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		File f = new File("d:" + File.separator + "te.txt");
		if (f.exists()) {
			f.delete();
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println(f.getAbsoluteFile());
			}
		}
	}

}
