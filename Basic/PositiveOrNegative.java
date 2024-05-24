package Basic;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number: ");
    number = sc.nextInt();
    if(number > 0) {
    	System.out.println("The Number Is Positive: ");
    }
    	else if(number<0) {
    		System.out.println("The Number Is Negative: ");
    	}
    	else {
    		System.out.println("The Number is Zero: ");
    	}
	}

}
