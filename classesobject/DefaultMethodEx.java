package classesobject;

import java.util.Scanner;

public class DefaultMethodEx {
	int a,b;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public int add() {
		return (a+b);
	}
	public int sub() {
		return (a-b);
	}
	public static void main(String[] args) {
		DefaultMethodEx result = new DefaultMethodEx();
		result.accept();
		int a = result.add();
		int b = result.sub();
		System.out.println("Addition of Numbers: "+a);
		System.out.println("Subtraction of Numbers: "+b);
	}
}
