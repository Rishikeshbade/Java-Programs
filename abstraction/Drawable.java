package abstraction;

public interface Drawable {
	
	float PI = 3.14f;//public static flaot PI = 3.14
	
	void print();// public abtract void primt()
	
	static void square(int a) {
		System.out.println("Sqaure: "+(a*a));
	}
	
	default void cube(int x) {
		System.out.println("Cube: "+(x*x*x));
	}
	
	default void sbow() {
		System.out.println("Inside Show: Drawable");
	}
	
}
