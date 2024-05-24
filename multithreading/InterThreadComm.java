package multithreading;

class Customer {
	private int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw Rs." + amount);
		if (balance < amount) {
			System.out.println("Less Balance. Waiting for Deposit....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw Completed. Balance : Rs. " + balance);
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit. Rs. " + amount);
		balance += amount;
		System.out.println("Deposit Completes. Balance : Rs " + balance);
		notify();
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		Customer customer = new Customer();
		new Thread("Raj") {
			public void run() {
				customer.withdraw(15000);
			};
		}.start();
		new Thread("Riya") {
			public void run() {
				customer.deposit(20000);
			};
		}.start();

	}

}
