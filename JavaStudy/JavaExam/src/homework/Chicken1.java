package homework;

/*一个循环：xn小鸡数量，mn母鸡数量，gn公鸡数量
 * 以公鸡数为变量，得出其他数量与公鸡数量的关系，循环中保证其他数量为正整数*/
public class Chicken1 {
	public static void main(String args[]){
			for(int gn=0;gn<=20;gn+=4){  //公鸡鸡最多20只
				int xn =75+((3*gn)/4);
				int mn =25-((7*gn)/4);
				if(mn>=0&&xn<=100){
					System.out.println("小鸡数量为："+xn+",公鸡数量为："+gn+",母鸡数量为："+mn);
				}
		}
	}
}
