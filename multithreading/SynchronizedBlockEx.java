package multithreading;

class PrintTable {
	public void print(int n) {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i * n);
			}
		}
	}
}

class Thread1 extends Thread {
	PrintTable printTable;

	public Thread1(PrintTable printTable) {
		this.printTable = printTable;
	}

	@Override
	public void run() {
		printTable.print(13);
	}
}

class Thread2 extends Thread {
	PrintTable printTable;

	public Thread2(PrintTable printTable) {
		this.printTable = printTable;
	}

	@Override
	public void run() {
		printTable.print(17);
	}
}

public class SynchronizedBlockEx {

	public static void main(String[] args) {
		PrintTable printTable = new PrintTable();
		Thread1 thread1 = new Thread1(printTable);
		thread1.start();

		Thread2 thread2 = new Thread2(printTable);
		thread2.start();

	}

}
