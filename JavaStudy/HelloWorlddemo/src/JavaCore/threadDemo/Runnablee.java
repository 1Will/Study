package threadDemo;

public class Runnablee {

	public static void main(String[] args) {
		Runnable rr=new Runnabl();
		Thread a= new Thread();
		
		a=(Thread) rr;
	/*	Thread tt=new Thread();
		Thread tr=new Thread(rr);
		Thread tp=new Thread(rr);*/
		a.start();
		/*tr.start();
		tp.start();*/
	}

}

class Runnabl implements Runnable {
	int ticket = 30;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 50; i >= 0; i--) {
			if(ticket>0){
			System.out.println("还剩" + ticket-- + "张票");
			}
		}
	}
}