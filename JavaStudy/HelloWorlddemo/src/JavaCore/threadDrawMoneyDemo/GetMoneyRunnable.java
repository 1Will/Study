package threadDrawMoneyDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class GetMoneyRunnable implements Runnable {
	private final Lock lock = new ReentrantLock();

	private Account account;
	private double drawAmount;

	public GetMoneyRunnable(Account account, double drawAmout) {
		super();
		this.account = account;
		this.drawAmount = drawAmout;
	}

	@Override

	/*public synchronized void run() {
		if (account.getBalance() >= drawAmount) {
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
	}*/

	/*public void run() {
		if (account.getBalance() >= drawAmount) {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
			lock.unlock();
		}
	}*/

	/*public void run() {
		if (account.getBalance() >= drawAmount) {
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
	}*/

	public void run() {
		synchronized (account) {
			if (account.getBalance() >= drawAmount) {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + "取钱成功， 取出钱数为：" + drawAmount);
				double balance = account.getBalance() - drawAmount;
				account.setBalance(balance);
				System.out.println("余额为：" + balance);
				lock.unlock();
			}
		}
	}

}
