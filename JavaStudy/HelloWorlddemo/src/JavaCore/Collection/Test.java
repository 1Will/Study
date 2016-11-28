package Collection;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Set<Integer> intset=new HashSet<Integer>();
		List<Integer> intlist=new ArrayList<Integer>();
		
		
		for (int i = 1; i <6; i++) {
			intset.add(i+10);
			intlist.add(i*5);
		}
		System.out.println(intset);
		System.out.println(intlist);
		
		Integer a=intlist.iterator().next();
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println("******************************");
		
		Iterator<Integer> it =intlist.iterator();
		
		while (it.hasNext()){
			
			System.out.println(it.next());
		}
	}
}
