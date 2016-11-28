package homework;


public class Chicken3 {
	/*三个循环：xp:小鸡价格，mp母鸡价格，gp公鸡价格，xn小鸡数量，mn母鸡数量，gn公鸡数量*/
	public static void main(String args[]){
		int xp=1; //3个小鸡价格
		int mp=3; //一只母鸡价格
		int gp=5; //一只公鸡价格
		int money,num;
		for(int gn=0;gn<=20;gn++){  //公鸡最大数量小于20
			for(int mn=0;mn<=33;mn++){  //母鸡最多33只
				for(int xn=3;xn<=100;xn=xn+3){  //小鸡数量以3的倍数增加，最多100只
					money=xp*xn/3+gn*gp+mn*mp;//总价钱
					num=xn+gn+mn;  //总数量
					if(money==100&&num==100){
						System.out.println("小鸡数量为："+xn+",公鸡数量为："+gn+",母鸡数量为："+mn);
					}
				}
			}	
		}
	}
}
