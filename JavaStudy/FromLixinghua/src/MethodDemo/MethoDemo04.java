package MethodDemo;

	public class MethoDemo04{
		// 定义方法，完成两个数字的相加操作，方法返回一个int型数据
		public static int add(int x,int y){
			int temp = 0 ;			// 方法中的参数，是局部变量
			temp = x + y ;			// 执行加法计算
			return temp ;			// 返回计算结果
		}
		// 定义方法，完成两个数字的相加操作，方法的返回值是一个float型数据
		public static float add1(int x,int y){
			float temp = 0 ;		// 方法中的参数，是局部变量
			temp = x + y ;			// 执行加法操作
			return temp ;			// 返回计算结果
		}
}
