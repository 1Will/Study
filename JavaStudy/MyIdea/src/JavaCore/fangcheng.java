package JavaCore;

	import java.util.Scanner;

	public class fangcheng {
		
	    public static float Enter() { // 键入数据方法
	    	Scanner sc = new Scanner(System.in);
	    	float date = sc.nextFloat();
	    	/*sc.close();*/
	    	return date;
	    }
	    
	    public static void Result(float a,float b,float c){  //计算方法
	    	float a1=a*2;
	    	float b1=0-b;
	    	float c2=b*b-4*a*c;
	    	float c1=(float) Math.sqrt(c2);
	    	if(a==0){ 
	    		if(b==0){
	    			System.out.println("方程无意义");
	    		}else{
	    		System.out.println("这是一个元一次方程，结果为 x=" +(0-c)/b);
	    		}
	    	}else{
	    		if(c2<0){
	    			System.out.println("方程无解");
	    		}else{
	    			System.out.println("方程解为x1= " +((b1+c1)/a1));
	    			System.out.println("方程解为x2= " +((b1-c1)/a1));
	    		}
	    	}
	    }
	    	
		/**
		 * @param args
		 */
		public static void main(String [] args){   //主程序
			float a=1,b=-1,c=0;
			System.out.println("本程序适用于 ax²+bx+c=0的函数：" + "\n");
			System.out.println("请输入数据a");
			a =Enter();
			System.out.println("请输入数据b");
			b =Enter();
			System.out.println("请输入数据c");
			c =Enter();
			Result(a,b,c);
			
		}
	}

