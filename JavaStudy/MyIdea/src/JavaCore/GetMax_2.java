package JavaCore;

import java.util.Scanner;



public class GetMax_2 {
	
	public static float Enter(float No) { // 閿叆鏁版嵁
		Scanner sc = new Scanner(System.in);
		float date = sc.nextFloat();
		return date;
	}
	
	public static void main(String args[]) {
		float max = 0f, No = 0;
		int i1 = 1;
		int size = 1000;
		float[] a = new float[size];// 瀹氫箟鏁扮粍
		System.out.println("璇疯緭鍏ユ暟鎹細");
		for (int i = 0; i <= 999; i++) {
			float n = Enter(No);
			float m = n;
			i1 = (int) m;
			if (i1 == 0) {
				break;
			} else {
				a[i] = n;
			}
			System.out.println("璇疯緭鍏ユ暟鎹細");
		}
		
		for (int j = 0; j <= (a.length - 1); j++) { // 鑾峰彇鏈�澶у��
			max = Math.max(a[j], max);
		}
		System.out.println("鎵�杈撳叆鏁颁腑鏈�澶у�兼槸锛�" + max);
	}

	
}