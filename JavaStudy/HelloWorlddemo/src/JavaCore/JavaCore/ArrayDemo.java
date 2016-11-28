package JavaCore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[]a=new int[5];
		
		int i[]={2,8,5,4,7};
		
		int[]b=new int[6];
		
		System.arraycopy(i, 1, b, 1, 3);
		Arrays.sort(i);
		
		for(int j=0;j<=4;j++){
			System.out.println(i[j]);
		}
		
		System.out.println("*******************************");
		
		for(int j=0;j<=5;j++){
		System.out.println(b[j]);
		}
	}

}
