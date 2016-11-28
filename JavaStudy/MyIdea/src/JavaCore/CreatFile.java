package JavaCore;

import java.io.File;

public class CreatFile {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				String f = "D:" + File.separator + "login" + File.separator + i + File.separator + j;
				File file = new File(f);
				file.mkdirs();
			}
		}
	}

}
