package abstraction;

public class DrawableImpl implements Drawable, Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawableImpl drawable = new DrawableImpl();
		drawable.print();
		drawable.cube(7);
		Drawable.square(5);
		drawable.display();
		drawable.sbow();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r = 10;
		System.out.println("Circle:"+(PI*r*r));
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Method from another interface");
	}

	@Override
	public void sbow() {
		// TODO Auto-generated method stub
		Printable.super.sbow();
	}
	
	
	
	

}
