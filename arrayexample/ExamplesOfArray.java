package arrayexample;

import java.util.Scanner;

public class ExamplesOfArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array "  +size+ " Size of Element");
		int i, sum = 0 ;
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(i = 0; i < a.length; i++ ) {
			 if(a[i] % 2 == 0) {
			 }
		}
		System.out.println();
		

	}

}
