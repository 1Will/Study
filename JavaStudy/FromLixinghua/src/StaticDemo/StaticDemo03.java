package StaticDemo;

	public class StaticDemo03{

		public static void main(String args[]){
			
			Person1 p1 = new Person1("张三",30) ;	 // 实例化对象
			Person1 p2 = new Person1("李四",31) ;	 // 实例化对象
			Person1 p3 = new Person1("王五",32) ;	 // 实例化对象
			System.out.println("--------------- 修改之前 -------------") ;
			p1.info() ;
			p2.info() ;
			p3.info() ;
			Person1.country = "B城" ;
			System.out.println("--------------- 修改之后 -------------") ;
			p1.info() ;
			p2.info() ;
			p3.info() ;
		}
}
