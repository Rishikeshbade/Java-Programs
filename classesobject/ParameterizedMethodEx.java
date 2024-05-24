package classesobject;

import java.util.Scanner;

public class ParameterizedMethodEx {
	public void mul(double x, double y) {
		System.out.println("Multiplication of Numbers: "+(x*y));
	}
	public double div(double x, double y) {
		return x/y;
	}
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		ParameterizedMethodEx result = new ParameterizedMethodEx();
		result.mul(a, b);
		double div = result.div(a, b);
		System.out.println("Division of Numbers: "+div);
	}
}
