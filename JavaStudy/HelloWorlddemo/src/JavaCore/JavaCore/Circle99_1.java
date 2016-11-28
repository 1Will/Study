package JavaCore;

public class Circle99_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 , j=1;
		while(i<=9){
			do{
				System.out.print(j + "x" + i + "=" + i*j );
				System.out.print("\t");
				j++;
			}while(j<=i);
			j=1;
			i++;
			System.out.println();
		}	
	}

}
