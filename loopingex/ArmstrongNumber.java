package loopingex;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n, rev=0, rem, original, number, digits;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		number = n;
		original = number;
		
		digits = 0;
		
		while(original != 0) {
			original /= 10;
			++digits;
		}
		
		original = number;
		
		
		while(original != 0) {
			rem = original % 10;
			result += Math.pow(rem, digits);
			original /= 10;
		}
		if(number==result)
			System.out.println("The Number is Armstrong");
		else
			System.out.println("The Number is Not Armstrong");
	}
;
}
