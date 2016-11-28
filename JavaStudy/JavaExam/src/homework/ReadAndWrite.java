package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWrite {
	
	public void writeFile(String str1) throws IOException {   //写入文件方法
		File f1 = new File("D:" + File.separator + "config.txt");   //定义配置文件路径
		OutputStream output = new FileOutputStream(f1, true);  //append为true，写入不覆盖
		byte[] b = str1.getBytes(); 
		output.write(b);
		output.close();
	}

	public String readerFile() throws IOException {    //读取文件方法
		File f1 = new File("D:" + File.separator + "config.txt");   //定义配置文件路径
		InputStream input = new FileInputStream(f1);
		byte[] b = new byte[(int) f1.length()];  //将字符串结果存储到一个新的 b数组中
		input.read(b);
		input.close();
		String st = new String(b);   //将字节数组内容转为字符串
		return st;
	}

	public void getNum(String str2) throws IOException {
		String[] num = str2.split("#");  //使用正则表达式分割字符串，并将内容存到字符串数组中
		int a1 = Integer.parseInt(num[0]);  //将字符串数字转为int型
		int a2 = Integer.parseInt(num[1]);
		int a3 = Integer.parseInt(num[2]);
		System.out.println("计算开始：");
		System.out.println("读到的参数为： "+ a1 +"  "+ a2 +"  "+ a3);
		writeFile("\r\n计算开始：");  //将计算结果同步写入文件
		writeFile("\r\n读到的参数为： "+ a1 +"  "+ a2 +"  "+ a3);  //将计算结果同步写入文件
		for (int a = 0; a <= a3; a++) {
			int b1 = (int) Math.sqrt(a + a1);
			int b2 = (int) Math.sqrt(a + a1 + a2);
			if (a + a1 == Math.pow(b1, 2)) {
				if (a + a1 + a2 == Math.pow(b2, 2)) {
					System.out.println("该数可以为：" + a);
					writeFile("\r\n该数可以为：" + a);  //将计算结果同步写入文件
				}
			}
		}
		System.out.println("计算结束。");
		writeFile("\r\n计算结束。");  //将计算结果同步写入文件
	}

	public static void main(String[] args) {
		File f1 = new File("D:" + File.separator + "config.txt");   //定义配置文件路径
		ReadAndWrite rw = new ReadAndWrite();
		String str3;
		if (f1.exists()) {  //确保所在目录没有重名文件
			f1.delete();
		}
		try {
			rw.writeFile("100#168#1000"); //创建配置文件
			str3 = rw.readerFile(); //从配置文件中读出所需的字符串
			System.out.println("读到配置文件内容为：" + str3);
			/*将解题思路写入到配置文件*/
			rw.writeFile("\r\n\r\n题目：一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？");
			rw.writeFile("\r\n\r\n解题思路：");
			rw.writeFile("\r\n1.先创建配置文件。");
			rw.writeFile("\r\n2.再从配置文件中读数据。");
			rw.writeFile("\r\n3.解析得到需要的参数，进行逻辑运算。");
			rw.writeFile("\r\n4.然后将解题思路写入到配置文件，再写入计算得到的结果。");
			rw.writeFile("\r\n\r\n具体解题过程如下：");
			rw.getNum(str3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}