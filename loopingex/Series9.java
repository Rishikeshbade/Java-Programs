package loopingex;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		int n, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			if(i % 2 != 0) {
            sum = sum + (i - (i + 1)); // Calculate the sum of the series
            System.out.print(i + "-" + (i + 1));
            if (i < n)
                System.out.print("+");
			}
        }
		System.out.println("=" +sum);

		}
}

