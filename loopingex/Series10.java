package loopingex;

import java.util.Scanner;


public class Series10 {

	public static void main(String[] args) {
		float n, i, j,sum = 0;
		float factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		 for(i=1; i<=n; i++) {
			System.out.print((int)i+"/"+(int)i+"!");
			factorial = 1;
			for(j=1;j<=i;j++) {
				factorial = factorial*j;
			}
			 sum = sum + (i/factorial);
			 if(i<n);
			 System.out.print("+");
		 }
		 System.out.println("=" +sum);

	}

}
