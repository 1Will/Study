package homework;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Calculate1 {
	public static void main(String[] args){
		Set<Integer> set=new TreeSet<Integer>();
		int num=1000;
		int a=7;
		for(int i=0;i<=num;i++){
			if(i%a==0){
				set.add(i);
			}
		}
		System.out.println(set);
		System.out.println(Collections.max(set));
	}
}
