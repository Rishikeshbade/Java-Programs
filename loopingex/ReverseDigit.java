package loopingex;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		int n, rev = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		System.out.println("Reverse of Number: "+rev);
		}

	}

}
