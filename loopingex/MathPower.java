package loopingex;

import java.util.Scanner;

public class MathPower {

	public static void main(String[] args) {
		int n, rev=0, rem, original, number, digits = 0;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		original = n;
		
		while(n != 0) {
			rem = n%10;
			rev += (int) Math.pow(rem, digits);
			n = n/10;
			digits++;
		}
		if(original==rev)
			System.out.println("armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
