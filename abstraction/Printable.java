package abstraction;

public interface Printable {
	void display();
	
	default void sbow() {
		System.out.println("Inside Show: Printable");
	}
}
