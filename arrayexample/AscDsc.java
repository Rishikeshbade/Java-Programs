package arrayexample;

import java.util.Scanner;

public class AscDsc {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array" + size + "Size of Element: ");

		int i= 0, j ;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(i = 5; i< 10; i++) {
			for (j = i + 1; j < 10; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}
		System.out.println("Ascending Order: ");
		for (i = 0; i < 4; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Descending Order: ");
		for (i = 5; i < 9; i++) {
			System.out.println(a[i]);
		}
	}

}
