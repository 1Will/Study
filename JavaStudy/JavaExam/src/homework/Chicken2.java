package homework;

/*两个循环：xp:小鸡价格，mp母鸡价格，gp公鸡价格，xn小鸡数量，mn母鸡数量，gn公鸡数量*/
public class Chicken2 {
	public static void main(String args[]){
		int xp=1;//3个小鸡价格
		int mp=3;//1只母鸡价格
		int gp=5;//1只公鸡价格
		int money;
			for(int mn=0;mn<=33;mn++){  //母鸡最多33只
				for(int xn=3;xn<=100;xn=xn+3){  //小鸡数量以3的倍数增加，最多100只
					money=xp*xn/3+mn*mp+(100-xn-mn)*gp;//总价钱
					if(money==100&&(100-xn-mn)>=0){
						System.out.println("小鸡数量为："+xn+",公鸡数量为："+(100-xn-mn)+",母鸡数量为："+mn);
					
				}
			}	
		}
	}
}
