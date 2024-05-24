package loopingex;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
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

	}

}
