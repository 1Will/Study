package bufferCopyDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws IOException {
	/*	File src =new File("D:"+File.separator+"123"+File.separator+"WriterDemo.wmv");
		File copy =new File("D:"+File.separator+"123"+File.separator+"WriterDemo2.wmv");*/
		File src =new File("D:"+File.separator+"123"+File.separator+"Equation.java");
		File copy =new File("D:"+File.separator+"123"+File.separator+"Equation2.java");
		InputStream in= new FileInputStream(src);
		OutputStream out= new FileOutputStream(copy);
		byte[] b =new byte[10];
		int a =0;
		while (a!=-1) {
			a = in.read(b, 0, (10-1));
			for(int i=0;i<b.length;i++){
				System.out.println(b[i]);
			}
			out.write(b, 0, b.length);
		}
		System.out.println("复制完成！");
		in.close();
		out.close();
	}

}
