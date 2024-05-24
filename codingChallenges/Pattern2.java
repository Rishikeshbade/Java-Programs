package codingChallenges;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		
		int i,j;
		for(i=1;i<=a;i++) {
			for(j=1; j<=a-i;j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
