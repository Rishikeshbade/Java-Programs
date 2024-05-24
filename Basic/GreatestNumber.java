package Basic;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
    int num1, num2, num3, greatestNumber = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Three Numbers: ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    
   if(num1 >= num2 && num1 >= num3) {
    greatestNumber = num1;
	}
   else if(num2 >= num3 && num2 >= num3){
	greatestNumber = num2;
   }
   else {
	 greatestNumber = num3;
   }
   System.out.println("The Greatest Number is: "+greatestNumber);
   }

}