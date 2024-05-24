package abstraction;

abstract class AbstractClass{
	public AbstractClass() {
		System.out.println("This is Constructor of Abstract Class. ");
	}
	
	public void normalMethod() {
		System.out.println("This is Normal Method of Abstract Class. ");
	}
	
	abstract void a_method();
}

class subclass extends AbstractClass{

	@Override
	void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is Abstract Class. ");
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass obj = new subclass();
		obj.a_method();
		obj.normalMethod();

	}

}
