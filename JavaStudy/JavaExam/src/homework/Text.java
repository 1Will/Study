package homework;

public class Text {

	public static void main(String[] args) {
		for (int i = 10; i <= 1000; i++) {
			for(int j=15;j<=1000;j++){
				if((i*i-100)==(j*j-268)){
					System.out.println(j*j-268);
				}
			}
		}
	}

}
