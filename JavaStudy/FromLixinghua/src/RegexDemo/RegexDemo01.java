package RegexDemo;

public class RegexDemo01 {

	public static void main(String[] args) {
		String str = "1234567890";
		boolean flag = true;
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] < '0' || c[i] > '9') {
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("全是数字！");
		}else{
			System.out.println("不全是数字！");
		}
	}

}
