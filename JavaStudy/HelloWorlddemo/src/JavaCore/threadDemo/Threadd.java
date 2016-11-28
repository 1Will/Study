package threadDemo;

public class Threadd extends Thread {
	String name; 

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("名字："+name + i);
		}
	}
}

