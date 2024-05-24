package java8features;

@FunctionalInterface
interface Sqaurable{
	int sqaure(int n);
}

public class SquareEx {

	public static void main(String[] args) {
		Sqaurable s1 = (n) -> n*n;
		System.out.println("Sqaure : "+s1.sqaure(4));

	}

}
