package arrayexample;

import java.util.Scanner;

public class AscendingOrder {

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
		
		for(i = 0; i< a.length -1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}
		System.out.println("Sorted Array: ");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

}

}
