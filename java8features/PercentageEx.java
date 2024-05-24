package java8features;

@FunctionalInterface
interface Marks{
	double percentage(double m1, double m2, double m3);
}

public class PercentageEx {

	public static void main(String[] args) {
		Marks m = (m1, m2, m3) -> (((m1+m2+m3)/300)*100);
		System.out.println("Percentage : "+m.percentage(67, 75, 79));

	}

}
