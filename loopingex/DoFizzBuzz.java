package loopingex;

import java.util.Scanner;

public class DoFizzBuzz {

	public static void main(String[] args) {
		int i, n;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("Press Y to Continue: ");;
		ch = sc.next().charAt(0);
		sc.nextLine();
		}while( ch == 'Y' || ch == 'y');
	}

}
