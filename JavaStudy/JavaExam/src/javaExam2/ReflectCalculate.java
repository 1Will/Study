package javaExam2;

import java.lang.reflect.Method;

class Run implements Runnable {
	public void run() {
		try {
			Class<?> c1 = Class.forName("javaExam2.Calculate1");
			Method met = c1.getMethod("mainn");
			met.invoke(c1.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ReflectCalculate {
	public static void main(String[] args) {
		Run r = new Run();
		Thread thread = new Thread(r);
		thread.start();
	}
}
