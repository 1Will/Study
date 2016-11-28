package JavaCore;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] a ={12,1,56,9,10,0};
		int max=a[0],min=a[0];
		for(int i=0;i<=5;i++){
			max=(max>a[i])?max:a[i];
			min=(min<a[i])?min:a[i];
		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
	}

}
