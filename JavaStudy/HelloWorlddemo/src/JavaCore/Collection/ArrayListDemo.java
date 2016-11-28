package Collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		ArrayList<String> a2= new ArrayList<String>();
		List<String> a3;
		a1.add("AA");
		a1.add("234");
		a1.add("�й�");
		
		a2.add("China");
		a2.add("�й�");
		a2.add("I");
		System.out.println("��1�Σ�"+ a1);
		
		a1.addAll(a2);
		System.out.println("��2�Σ�"+ a1);
		
		a1.add(2,"�Ѱ�");
		System.out.println("��3�Σ�"+ a1);
		
		System.out.println("��3�Σ�"+a1.contains("AA"));
		
		System.out.println("��4�Σ�"+a1.containsAll(a2));
		
		System.out.println("��5�Σ�"+ a1.equals(a2));
		
		System.out.println("��6�Σ�"+ a1.get(5));
		
		System.out.println("��7�Σ�"+ a1.hashCode());
		
		System.out.println("��8�Σ�"+ a1.isEmpty());
		
		a1.remove("�й�");
		System.out.println("��9�Σ�"+ a1);
		
		a1.add("�й�");
		a1.add("�й�");
		a1.remove(0);
		System.out.println("��10�Σ�"+ a1);
		
		a1.removeAll(a2);
		System.out.println("��11�Σ�"+ a1);
		
		a1.add("�й�1");
		a1.add("�й�");
		a1.add("�й�2");
		a1.add("�й�");
		
		System.out.println(a1);
		System.out.println("��12�Σ�"+ a1.indexOf("�й�"));
		System.out.println("��13�Σ�"+ a1.indexOf("�й���"));
		
		System.out.println("��14�Σ�"+ a1.lastIndexOf("�й�"));
		
		a1.set(2,"�й���");
		System.out.println("��15�Σ�"+ a1);
		
		System.out.println("��15�Σ�"+ a1.size());
		
		a3=a1.subList(1,3);
		System.out.println("��16�Σ�"+ a3);
		
		String[] a4 = a1.toArray(new String[0]);
		for(int i=0;i<a4.length;i++){
		System.out.println(a4[i]);
		}
		System.out.println("******************************************");

	}

}
