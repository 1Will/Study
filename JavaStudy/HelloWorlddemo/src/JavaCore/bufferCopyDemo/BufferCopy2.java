package bufferCopyDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferCopy2 {

	public static void main(String[] args) throws IOException{
		File src =new File("D:"+File.separator+"123"+File.separator+"WriterDemo.wmv");
		File copy =new File("D:"+File.separator+"123"+File.separator+"WriterDemo2.wmv");
/*		File src =new File("D:"+File.separator+"123"+File.separator+"ubuntu-16.04-desktop-amd64.iso");
		File copy =new File("D:"+File.separator+"123"+File.separator+"ubuntu-16.04-desktop-amd64-2.iso");
*/		BufferedInputStream in=new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(copy));
		byte[] tem=new byte[2];
		int a=0;
		while ( a!=-1) {
			a=in.read(tem, 0, tem.length);
			out.write(tem, 0, tem.length);
		}
		
		in.close();
		out.close();
		System.out.print("复制完成！");
	}
}
