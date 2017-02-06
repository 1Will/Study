package test;

/*n个人围成一圈，每个人按顺序从1开始编号，然后从第一个人开始数123123...，
 * 每次数到3便剔除该成员，直到剩下最后一个人，求该人的编号*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数字n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int a = 1; a <= n; a++) {
			aList.add(a);
		}
		int b = 1;
		int m = 1;
		while (aList.size() > 1) {
			int s = aList.size();
			if (aList.size() > 1) {
				for (int i = 1; i <= s; i++) {
					if (b == 3) {
						aList.remove(aList.get(m - 1));
						m = m - 1;
						b = 0;
					}
					b++;
					if (m < aList.size()) {
						m++;
					} else {
						m = 1;
					}
				}
			}
		}
		System.out.println("留下的数字为：" + aList.get(0));
	}

}
