package ObjectArrayDemo;
class Person1{
	private String name ;		// 姓名属性
	public Person1(String name){	// 通过构造方法设置内容
		this.name = name ;		// 为姓名赋值
	}
	public String getName(){
		return this.name ;		// 取得姓名
	}
};
public class ObjectArrayDemo2 {

	public static void main(String[] args) {
		Person1 per[] ={new Person1("张三"),new Person1("李四"),new Person1("王五")};
		System.out.println("\n============== 数组输出 =================") ;
		for(int x=0;x<per.length;x++){	// 循环输出
			System.out.print(per[x].getName() + "、") ;	// 此时，已经实例化完成了，所以会直接打印出姓名
		}
	}

}
