package loopingex;

import java.util.Scanner;

public class DowhilePatterns {

	public static void main(String[] args) {
		int i,j,n;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Press Y to Continue: ");
		ch = sc.next().charAt(0);
		sc.nextLine();
		}while(ch == 'Y' || ch == 'y');

	}

}
