package Enum;

enum Color{
	RED("红色"),GREEN("绿色"),BLUE("兰色") ;
	private Color(String name){
		this.setName(name) ;
	}
	private String name ;			// 定义name属性
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
}
public class T2{
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.println(c.ordinal() + " --> " + c.name()
				+"(" + c.getName() + ")") ;
		}
	}
};
