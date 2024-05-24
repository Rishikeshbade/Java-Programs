package abstraction;


abstract class Parent{
	
	public abstract void message();
	
}

class message1 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is First Subclass");
	}
	
}

class message2 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is Second Subclass");
	}
	
}



public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent;
		parent = new message1();
		parent.message();
		
		Parent parent2;
		parent2 = new message2();
		parent2.message();
	}

}
