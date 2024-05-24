package Basic;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		int num1, num2, result;
		char choice;
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
         num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter your choice:");
        System.out.println("+ for add");
        System.out.println("- for sub");
        System.out.println("* for mul");
        System.out.println("/ for div");
        
        char choice1 = sc.next().charAt(0);
        
        int result1;
        switch(choice1) {
            case '+':
                result1 = num1 + num2;
                System.out.println("Result: " + result1);
                break;
            case '-':
                result1 = num1 - num2;
                System.out.println("Result: " + result1);
                break;
            case '*':
                result1 = num1 * num2;
                System.out.println("Result: " + result1);
                break;
            case '/':
            	 result1 = num1 / num2;
                 System.out.println("Result: " + result1);
                break;
            default:
                System.out.println("Invalid choice!");

	}
        }
	

}
