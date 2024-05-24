package loopingex;

import java.util.Scanner;

public class DoArea {

	public static void main(String[] args) {
		int length,breadth,base,height,area;
		String choice;
		float radius;
		
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter your choice:");
        System.out.println("type 'rectangle' to calculate area of Rectangle");
        System.out.println("type 'circle' to calculate area of Circle");
        System.out.println("type 'triangle' to calculate area of triangle");
        
        choice = sc.nextLine();
        int area1;
        
        switch(choice) {
        case "rectangle":
            System.out.print("Enter length and Breadth of Rectangle: ");
            length = sc.nextInt();
            breadth = sc.nextInt();
            area = length*breadth;
            System.out.println("Area of Rectangle: " + area);
            break;
        case "circle":
            System.out.print("Enter radius of Circle: ");
            radius = sc.nextFloat();
            area = (int) (3.14*radius*radius);
            System.out.println("Area of Circle: " + area);
            break;
        case "triangle":
            System.out.print("Enter base of triangle: ");
            base = sc.nextInt();
            System.out.print("Enter height of triangle: ");
            height = sc.nextInt();
            area = (int) (0.5f * base * height);
            System.out.println("Area of triangle: " + area);
            break;
        default:
            System.out.println("Invalid choice!");

	}
        System.out.println("Press Y to continue, any other key to exit: ");
		ch = sc.next().charAt(0);
		sc.nextLine(); // Consume newline character
	} while ((ch == 'Y') || (ch == 'y'));
	}

}
