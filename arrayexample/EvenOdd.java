package arrayexample;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array"+size+"size of Element: ");
		int i, sum=0, product = 1;
		
		for(i=0; i<a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		for(i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				sum = sum + a[i];
			}
			else{
				product = product*a[i];
			}
		}
		System.out.println("Sum Of Even Number: "+sum+"\nProduct of Odd Number:"+product);

	}

}
