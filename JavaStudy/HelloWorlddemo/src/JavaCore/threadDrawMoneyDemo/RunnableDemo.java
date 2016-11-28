package threadDrawMoneyDemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		Account account=new Account("abcde", 1000);
		GetMoneyRunnable run=new GetMoneyRunnable(account, 600);
		Thread zhangsan=new Thread(run);
		Thread lisi=new Thread(run);
		Thread wangwu=new Thread(run);
		zhangsan.start();
		lisi.start();
		wangwu.start();
	}

}
