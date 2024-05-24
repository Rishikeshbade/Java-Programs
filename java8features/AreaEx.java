package java8features;



@FunctionalInterface
interface Circle{
	double r(float r);
}

public class AreaEx {

	public static void main(String[] args) {
		Circle c = (r) -> 3.14*r*r;
		System.out.println("Area of Circle : "+c.r(5));

	}

}
