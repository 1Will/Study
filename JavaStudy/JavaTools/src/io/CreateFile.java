package io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
public void createFile() throws IOException {
	File file =new File("D:"+File.separator+"file"+File.separator+"program.log");//文件program.log初始化
	File f =file.getParentFile();//文件父目录初始化
	if(!f.exists()){             //判断文件父目录是否存在
		f.mkdirs();              //文件父目录创建
		file.createNewFile();    //文件创建
	}else{
		f.delete();              //文件夹删除
	}
}

	public static void main(String[] args) throws IOException {
		CreateFile f=new CreateFile();
			f.createFile();
	}
}
