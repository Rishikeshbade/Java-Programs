package loopingex;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		int i, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i+=2) {
			System.out.println(i*i);
	
		}
	}

}
