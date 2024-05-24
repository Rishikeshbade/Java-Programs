package loopingex;

import java.util.Scanner;

public class Series7 {

	public static void main(String[] args) {
		int i , sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			System.out.println(i*i);
		}

	}

}
