package loopingex;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		int i ;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i+=2) {
			System.out.println(i);
		}
	}
}




