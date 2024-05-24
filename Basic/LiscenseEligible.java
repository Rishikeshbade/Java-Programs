package Basic;

import java.util.Scanner;

public class LiscenseEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        age = sc.nextInt();
        if(age>=18) {
        	System.out.println("Your are Eligible: "+age);
        }
        else {
        	System.out.println("Your are Not Eligible: "+age);
        }
	}

}
