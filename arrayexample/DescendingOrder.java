package arrayexample;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rollNumbers = new int[5];
		int[] marks = new int[5];

		int i;
		for (i = 0; i < marks.length; i++) {
			System.out.println("Enter the Roll Number" + (i + 1) + ":");
			rollNumbers[i] = sc.nextInt();
			System.out.println("Enter the marks" + (i + 1) + ":");
			marks[i] = sc.nextInt();
		}

		int rollnumber = 0, marks1 = 0;
		int j;
		for (i = 0; i < marks.length-1; i++) {
			for (j = i+1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					int t = marks[i];
					marks[i] = marks[j];
					marks[j] = t;
					
					int t1 = rollNumbers[i];
					rollNumbers[i] = rollNumbers[j];
					rollNumbers[j] = t1;
					
					
				}
			}
		}
		System.out.println("Sortted Array in Descending Order: ");
		for (i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

	}
}
