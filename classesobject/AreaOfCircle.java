package classesobject;

import java.util.Scanner;

public class AreaOfCircle {
	float radius;
	
	public AreaOfCircle() {
		radius = 3;
	}
	public AreaOfCircle(float radius) {
		this.radius = radius;
	}
	public void Calculate() {
		double Area = 3.14*radius*radius;
		System.out.println("Area of Circle: "+Area);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		float radius = sc.nextFloat();
		AreaOfCircle obj = new AreaOfCircle();
		obj.Calculate();
		
		AreaOfCircle obj1 = new AreaOfCircle(radius);
		obj1.Calculate();
	}
	
}
