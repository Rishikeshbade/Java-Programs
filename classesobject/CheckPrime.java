package classesobject;

import java.util.Scanner;

public class CheckPrime {
	int n;
	boolean  b = false;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n = sc.nextInt();
	}
	
	public void check() {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				b = true;
				break;
			}
		}
		if(b == true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
	public static void main(String[] args) {
		CheckPrime obj = new CheckPrime();
		obj.accept();
		obj.check();
	}
}
