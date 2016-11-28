package writeReaderDemo;

import java.io.*;


public class Readerdemo {

	public static void main(String[] args) throws IOException{
		File file= new File("d:\\temp.txt");
		File file1= new File("d:\\temp1.txt");
		Reader re =new FileReader(file);
		char[] b = new char[(int) file.length()];
		re.read(b);
		System.out.println(b);
		System.out.println("************************");
		
		InputStream in = new FileInputStream(file1);
		Reader re2 =new InputStreamReader(in,"GBK");
		char[] b1 =new char[(int) file1.length()];
		re2.read(b1);
		System.out.println(b1);
		
		re.close();
		re2.close();
		
	}

}
