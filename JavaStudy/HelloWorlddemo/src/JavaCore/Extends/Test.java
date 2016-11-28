package Extends;

public class Test {

	public static void main(String[] args) {
		Person w1=new Worker("工人", "ID-111", 30, "搬砖");
		Person w2=new Worker("工人2", "ID-112", 30, "搬砖2");
		Worker w =(Worker)w1;
		Person s1=new Star("ID-222", "花花", "唱歌");
		Star s=(Star)s1;
		Person s2=new Star();
		Person t1=new Teacher("老师", 25, "教书");
		Teacher t=(Teacher)t1;
		w.say();
		s.song();
		t.teach();
		System.out.println(w.toString()+"  "+"我会"+w.work);
		System.out.println(s.toString()+"  "+"我会"+s.work);
		System.out.println(t.toString()+"  "+"我会"+t.work);
		System.out.println("******************************");
		s2=(Star)w2;
		s2=(Worker)s2;
		System.out.println(s2.getName());
		
	}
}
