package ArrayDemo;

import java.util.Arrays;;

public class ArrayRefDemo04 {

	public static void main(String[] args) {
		int score[]={67,89,87,69,90,100,75,90};
		int age[] = {31,30,18,17,8,9,1,39} ;		// 定义整型数组
		Arrays.sort(score);
		print(score) ;		// 数组打印
		System.out.println("\n---------------------------") ;
		Arrays.sort(age);
		print(age) ;		// 数组打印
	}
 
	public static void print(int temp[]){
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]+"\t");
		}
	}

}
