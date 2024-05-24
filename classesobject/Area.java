package classesobject;

import java.util.Scanner;

public class Area {
	public void circle() {
		float radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle: ");
		radius = sc.nextFloat();
		System.out.println("Area of Circle: "+(3.14*radius*radius));
	}
	public void triangle(double base, double hight) {
		System.out.println("Area of Triangle: "+0.5*base*hight);
	}
	public int square(int n) {
		return (n*n);
	}
	public int rectangle(int x, int y) {
		return (x*y);
	}
	public static void main(String[] args) {
		double base = 0, height = 0;
		int a, b;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter Base and Height: ");
		base = sc.nextDouble();
		height = sc.nextDouble();
		
		System.out.println("Enter Side of Sqaure: ");
		n = sc.nextInt();
		 
		Area obj = new Area();
		obj.circle();
		obj.triangle(base, height);
		int squareArea = obj.square(n);
		int rect = obj.rectangle(a, b);
		
		System.out.println("Area of Sqaure: "+squareArea);
		System.out.println("Area of Rectangle: "+rect);
	}
}
