package threadDemo;

public class TreadDemo{
	public static void main(String[] agrs) throws InterruptedException{
		Threadd t1=new Threadd();
		Threadd t2=new Threadd();
		Threadd t3=new Threadd();
		Threadd t4=new Threadd();
		Threadd t5=new Threadd();
		t1.name ="AAA";
		t2.name ="BBB";
		t3.name ="CCC";
		t4.name ="DDD";
		t5.name ="EEE";
		t1.run();
		t2.run();
		Thread.sleep(100);
		System.out.println("*****************");
		Threadd.yield();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		Thread.sleep(100);
		System.out.println("*****************");
		System.out.println("t1.getId()"+t1.getId());
		System.out.println("t1.isAlive()"+t1.isAlive());
		System.out.println("t1.getId()"+t1.getId());
	}
}
