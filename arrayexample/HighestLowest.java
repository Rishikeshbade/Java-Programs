package arrayexample;

import java.util.Scanner;

public class HighestLowest {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("array" + size + " array element");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int highest = a[0];
		int lowest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > highest)
				highest = a[i];
			
			if (a[i] < lowest)
				lowest = a[i];
		}
		System.out.println("Highest: "+highest+", \nLowest: "+lowest);

	}

}
