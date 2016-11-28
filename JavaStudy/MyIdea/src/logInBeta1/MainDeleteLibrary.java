package logInBeta1;

public class MainDeleteLibrary {

	public static void main(String[] args) {
		Processing p = new Processing();
		System.out.println("文件路径为："+p.file);
		p.delete();
		System.out.println("文件已删除！");
	}

}
