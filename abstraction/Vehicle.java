package abstraction;

public abstract class Vehicle {
	
	public Vehicle() {
		System.out.println("consturctor in abstract class..");
	}
	
	public void run() {
		System.out.println("running safely....");
	}
	
	public abstract void changeGear();
}
