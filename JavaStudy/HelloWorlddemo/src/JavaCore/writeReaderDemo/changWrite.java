package writeReaderDemo;

import java.io.*;

public class changWrite {
	public static void main(String []args) throws IOException{
		File file=new File("D:\\it.txt");
		File file2=new File("D:\\it2.txt");
		Reader re=new FileReader(file);
		Writer wr=new OutputStreamWriter(new FileOutputStream(file2),"UTF-8");
		char c[] = new char[600];
		re.read(c);
		for(int i=0;i<=c.length-1;i++){
			if(48<=c[i]&&c[i]<=57){
				if(48<=c[i+1]&&c[i+1]<=57){
					wr.write("\r\n"+c[i]+c[i+1]);
					i=i+1;
				}else{
					wr.write("\r\n"+c[i]);
				}
			}else{
			wr.write(c[i]);
			}
		}
		re.close();
		wr.close();
	}
}
