package OperateDemo;

public class OperateDemo19{
	public static void main(String args[]){
		int x = 3 ;	// 3�Ķ��������ݣ�	00000000 00000000 00000000 00000011
		int y = -3 ;	// -3�Ķ��������ݣ�	11111111 11111111 11111111 11111101
		System.out.println(x + "����2λ֮������ݣ�" + (x>>>2)) ;
		System.out.println(y + "����2λ֮������ݣ�" + (y>>>2)) ;
	}
};