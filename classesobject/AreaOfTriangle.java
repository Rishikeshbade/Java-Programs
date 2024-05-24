package classesobject;

import java.util.Scanner;

public class AreaOfTriangle {
	double height, base;
	public AreaOfTriangle() {
		height = 3;
		base = 5;
	}
	public AreaOfTriangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	public void calculate() {
		double Area = 0.5*height*base;
		System.out.println("Area of Triangle: "+Area);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height and Base: ");
		double height = sc.nextDouble();
		double base = sc.nextDouble();
		
		AreaOfTriangle obj = new AreaOfTriangle();
		obj.calculate();
		
		AreaOfTriangle obj1 = new AreaOfTriangle(height,base);
		obj1.calculate();
		}
}