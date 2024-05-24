package multithreading;

public class PriorityEx extends Thread {

	public static void main(String[] args) {
		PriorityEx t1 = new PriorityEx();
		PriorityEx t2 = new PriorityEx();
		t1.setName("Sukanya");
		t2.setName("Suraj");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(1);
		t1.start();
		t2.start();

	}
	
	@Override
	public void run() {
		System.out.println("Thread Name : "+getName()+" Thread Priority : "+getPriority());
	}

}
