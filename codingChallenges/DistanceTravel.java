package codingChallenges;

import java.util.Scanner;

public class DistanceTravel {
	private void getDistance(int t) {
		int u = 10;
		int a = 5;
		int d = u * t + ((a*t*t)/2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		DistanceTravel obj = new DistanceTravel();
		obj.getDistance(a);
		obj.getDistance(b);

	}

}
