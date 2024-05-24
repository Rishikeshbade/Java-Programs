package Basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number: ");
    number = sc.nextInt();
    if(number%2==0) {
    	System.out.println("Number is Even Number: "+number);
    }
    else {
    	System.out.println("Number is Odd Number: "+number);
    }
	}

}
