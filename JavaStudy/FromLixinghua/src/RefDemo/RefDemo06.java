package RefDemo;

class Personn{
	private String name;
	private int age;
	private Bookk book;
	private Personn child;
	public Personn(String name,int age){
		this.age=age;
		this.name=name;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		age = a ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public void setBookk(Bookk b){
		book=b;
	}
	public Bookk getBookk(){
		return book;
	}
	public void setChild(Personn c){
		child=c;
	}
	public Personn getChild(){
		return child;
	}
}

class Bookk{
	private String title;
	private float price;
	private Personn person;
	public Bookk(String title,float price){
		this.title=title;
		this.price=price;
	}
	public void setTitle(String t){
		title = t ;
	}
	public void setPrice(float p){
		price = p ;
	}
	public String getTitle(){
		return title ;
	}
	public float getPrice(){
		return price ;
	}
	public void setPersonn(Personn p){
		person=p;
	}
	public Personn getPersonn(){
		return person;
	}
}

public class RefDemo06 {

	public static void main(String[] args) {
		Personn per=new Personn("张三", 30);
		Personn cld=new Personn("张里", 6); // 定义一个孩子
		Bookk bk=new Bookk("Java开发", 35.0f);
		Bookk b=new Bookk("一千零一夜",20.3f);
		
		per.setBookk(bk);// 设置两个对象间的关系，一个人有一本书
		cld.setBookk(b);// 设置对象间的关系，一个孩子有一本书
		per.setChild(cld);// 设置对象间的关系，一个人有一个孩子
		bk.setPersonn(per);// 设置两个对象间的关系，一本书属于一个人
		b.setPersonn(cld);// 设置对象间的关系，一本书属于一个孩子
		
		
		
		System.out.println("从人找到书 --> 姓名："+per.getName()+"；年龄："+per.getAge()+"；书名："+
		per.getBookk().getTitle()+"；价格："+per.getBookk().getPrice());// 可以通过人找到书
		System.out.println("从书找到人 --> 书名："+bk.getTitle()+"；价格："+bk.getPrice()+"；姓名："+
		bk.getPersonn().getName()+"；年龄："+bk.getPersonn().getAge());// 也可以通过书找到其所有人
		System.out.println(per.getName()+"的孩子是："+per.getChild().getName()+"；年龄："+
		per.getChild().getAge()+"；书名："+per.getChild().getBookk().getTitle()+"；价格："+
		per.getChild().getBookk().getPrice());// 通过人找到孩子，并找到孩子所拥有的书
		
	}

}
