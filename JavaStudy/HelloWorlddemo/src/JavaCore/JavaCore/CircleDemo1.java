package JavaCore;

public class CircleDemo1 {

	public static void main(String[] args) {
		int a=6;
		switch (a) {
		case 1:
			System.out.println("a=1");
			break;
		case 2:
			System.out.println("a=2");
			break;
		case 3:
			System.out.println("a=3");
			break;
		case 4:
			System.out.println("a=4");
			break;

		default:System.out.println("a不是1、2、3、4");
			break;
		}
		int i=25,j=19,x=12;
		int max;
		max=(i>j)?i:j;
		max=(max>x)?max:x;
		System.out.println("最大值为" + max);
	}

}
