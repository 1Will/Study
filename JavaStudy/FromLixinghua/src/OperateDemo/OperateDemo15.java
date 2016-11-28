package OperateDemo;

public class OperateDemo15{
	public static void main(String args[]){
		int x = 3 ;		// 3�Ķ��������ݣ�	00000000 00000000 00000000 00000011
		int y = 6 ;		// 6�Ķ��������ݣ�	00000000 00000000 00000000 00000110
		System.out.println(x & y) ;	//�룺	00000000 00000000 00000000 00000010
		System.out.println(x | y) ;	//��	00000000 00000000 00000000 00000111
		System.out.println(x ^ y) ;	//��	00000000 00000000 00000000 00000101
	}
};