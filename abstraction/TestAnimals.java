package abstraction;


abstract class Animals{
	public abstract void cats();
	public abstract void dogs();
}

class Cats extends Animals{

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		System.out.println("Cats Meow");
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}

	
}

    class Dogs extends Animals{

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs Bark");
	}
	
}

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats cats = new Cats();
		cats.cats();
		
		Dogs dogs = new Dogs();
		dogs.dogs();
	}

}
