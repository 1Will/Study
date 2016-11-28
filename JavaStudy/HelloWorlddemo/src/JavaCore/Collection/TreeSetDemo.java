package Collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Animal> LL= new TreeSet<Animal>();
		
		LL.add(new Animal("monkey",15f)); 
		LL.add(new Animal("monkey1",16f)); 
		LL.add(new Animal("monkey3",18f)); 
		LL.add(new Animal("monkey2",12f)); 
		System.out.println(LL);
		
	}


}
