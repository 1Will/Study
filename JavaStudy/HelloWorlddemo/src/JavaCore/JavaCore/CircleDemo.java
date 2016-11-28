package JavaCore;

public class CircleDemo {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				
				if( j == 2 ){
					//return;
					//break;
					//continue;
				}
				System.out.println("循环二" + j);
			}
			System.out.println("循环一___" + i);
		}
	}

}
