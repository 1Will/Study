package Enum;

import Interface2.C;

public class UseEnum {
		public static void main(String[] args){
			for(ColorEnum c :ColorEnum.values()){
				System.out.println(c.ordinal()+c.name());
			}
			System.out.println("结束");
		}
}
