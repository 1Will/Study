package RefDemo;

class Person{
	private String name;
	private int age;
	private Book book;
	public Person(String name,int age){
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
	public void setBook(Book b){
		book=b;
	}
	public Book getBook(){
		return book;
	}
}

class Book{
	private String title;
	private float price;
	private Person person;
	public Book(String title,float price){
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
	public void setPerson(Person p){
		person=p;
	}
	public Person getPerson(){
		return person;
	}
}

public class RefDemo05 {

	public static void main(String[] args) {
		Person per=new Person("张三", 30);
		Book bk=new Book("Java开发", 35.0f);
		per.setBook(bk);// 设置两个对象间的关系，一个人有一本书
		bk.setPerson(per);// 设置两个对象间的关系，一本书属于一个人
		System.out.println("从人找到书 --> 姓名："+per.getName()+"；年龄："+per.getAge()+"；书名："+
		per.getBook().getTitle()+"；价格："+per.getBook().getPrice());
		System.out.println("从书找到人 --> 书名："+bk.getTitle()+"；价格："+bk.getPrice()+"；姓名："+
		bk.getPerson().getName()+"；年龄："+bk.getPerson().getAge());
	}

}
