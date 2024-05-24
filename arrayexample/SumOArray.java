package arrayexample;

import java.util.Scanner;

public class SumOArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size oF Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array" + size + "size Element: ");
		int i, sum = 0;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum of Array :" + sum);
	}

}
