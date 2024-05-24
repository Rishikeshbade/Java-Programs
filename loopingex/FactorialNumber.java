package loopingex;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i,fact = 1, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		number = sc.nextInt();
		
		for(i=1; i<=number; i++) {
			fact *= i;
		}
		System.out.println("factorial of"+number+"is:"+fact);
		
	}

}
