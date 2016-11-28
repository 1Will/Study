package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArryListSort {
	public static void main(String []args){
		List<Integer> b1 = new ArrayList<Integer>();
		b1.add(11);
		b1.add(14);
		b1.add(13);
		b1.add(17);
		b1.add(15);
		System.out.println(b1);
		int[] a1= new int[b1.size()];
		for(int i=0;i<b1.size();i++){
			a1[i]=b1.get(i);
		}
		Arrays.sort(a1);
		List<Integer> b2 = new ArrayList<Integer>();
		for(int i=0;i<b1.size();i++){
			b2.add(a1[i]);
		}
		System.out.println(b2);
	}
}
