package java8features;


@FunctionalInterface
interface Interest{
	float simpleInterest(float p, float n, float r);
}

public class InterestEx {

	public static void main(String[] args) {
		Interest i = (p, n, r) -> (p*n*r)/100;
		System.out.println("Simple Interest "+i.simpleInterest(300, 3, 6));

	}

}
