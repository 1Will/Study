package ConsDemo;

class Student{
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	public void setStuno(String s){
		this.stuno=s;
	}
	public void setName(String n){
		this.name=n;
	}
	public void setMath(float m){
		this.math=m;
	}
	public void setEnglish(float e){
		this.english=e;
	}
	public void setComputer(float c){
		this.computer=c;
	}
	public String getStuno(){
		return stuno;
	}
	public String getName(){
		return name;
	}
	public float getMath(){
		return math;
	}
	public float getComputer(){
		return computer;
	}
	public float getEnglish(){
		return english;
	}
	public Student(String s,String n,float m,float e,float c) {
		this.setStuno(s);
		this.setName(n);
		this.setMath(m);
		this.setEnglish(e);
		this.setComputer(c);
	}
	public float sum(){
		return math+english+computer;
	}
	public float avg(){
		return this.sum()/3;
	}
	public float max(){
		float a=math>english?math:english;
		a=a>computer?a:computer;
		return a;
	}
	public float min(){
		float a=math<english?math:english;
		a=a<computer?a:computer;
		return a;
	}
}

public class ExampleDemo01 {

	public static void main(String[] args) {
		Student stu = null ;			// 声明对象
		stu = new Student("MLDN-33","李兴华",95.0f,89.0f,96.0f) ;
		System.out.println("学生编号：" + stu.getStuno()) ;
		System.out.println("学生姓名：" + stu.getName()) ;
		System.out.println("数学成绩：" + stu.getMath()) ;
		System.out.println("英语成绩：" + stu.getEnglish()) ;
		System.out.println("电脑成绩：" + stu.getComputer()) ;
		System.out.println("总分：" + stu.sum()) ;
		System.out.println("平均分：" + stu.avg()) ;
		System.out.println("最高分：" + stu.max()) ;
		System.out.println("最低分：" + stu.min()) ;
	}

}
