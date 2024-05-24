package multithreading;

public class AccountSynchro implements Runnable {

	private Account acct = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSynchro acctDanger = new AccountSynchro();
		Thread t1 = new Thread(acctDanger);
		t1.setName("Sakshi");
		t1.start();

		Thread t2 = new Thread(acctDanger);
		t2.setName("Varsha");
		t2.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			makeWithdrawal(1000);
		}

	}

	public synchronized void makeWithdrawal(int amount) {
		if (acct.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is Going to Withdraw.");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " Complete Withdrawal : "  +acct.getBalance());
		} else {
			System.out.println("Not Enough balance in Account for:" + Thread.currentThread().getName() + " balance:"
					+ acct.getBalance());
		}
	}
}
