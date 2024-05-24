package loopingex;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		float i , sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1 ;i<=n; i++) {
			sum = sum +(i/i*i);
			System.out.print((int)i+"/" +(int)i*(int)i);
			if(i<n);
			System.out.print("+");
		}
		System.out.println("=" +sum);
		

	}

}
