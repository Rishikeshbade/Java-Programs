package programs;

import java.util.Scanner;

public class SumOfEvenPositionElement {

	public static void main(String[] args) {
		int i, sum = 0, size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Given Array: ");
		
		for(i = 0; i < a.length; i++) {
			a[i]= sc.nextInt(); 
		}
		
		for(i = 1; i < a.length; i += 2) {
			sum = sum + a[i];
		}
		
		System.out.println("Sum of Even Position Element: "+sum);
		
		

	}

}
