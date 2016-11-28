package JavaCore;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

		int i[] = { 2, 8, 5, 4, 7 };

		Arrays.sort(i);

		for (int j = 0; j <= 4; j++) {
			System.out.println(i[j]);
		}

		System.out.println("*******************************");

		System.out.println(i);

		System.out.println(Arrays.toString(i));
	}

}
