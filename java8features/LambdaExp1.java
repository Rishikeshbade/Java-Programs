package java8features;

@FunctionalInterface
interface Addable{
	int add (int p, int q);
}

public class LambdaExp1 {

	public static void main(String[] args) {
		Addable a1 = (a,b) -> a+b;
		System.out.println("add : "+a1.add(10, 4));

	}

}
