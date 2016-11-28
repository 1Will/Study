package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArryListSort2 {
	public static void main(String []args){
		List<Integer> b1 = new ArrayList<Integer>();
		b1.add(11);
		b1.add(14);
		b1.add(13);
		b1.add(17);
		b1.add(15);
		System.out.println(b1);
		
		Object[] obj = b1.toArray();
		Arrays.sort(obj);
		
		System.out.println(obj);
		
		System.out.println(Arrays.toString(obj));
    }
	
}
