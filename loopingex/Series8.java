package loopingex;

import java.util.Scanner;
//1*2 + 2*3
public class Series8 {

	public static void main(String[] args) {
		int n, i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) { 
			sum = sum + (i*(i+1));
			System.out.print(i+"*"+(i+1));
			if(i<n);
			System.out.print("+");
			
		}
		System.out.println("=" +sum);

	}

}
