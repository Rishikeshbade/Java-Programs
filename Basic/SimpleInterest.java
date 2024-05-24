package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double principleBalance, rate, year;
		// Scanner Method
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Principle Balance: ");
		 principleBalance = sc.nextInt();
		 
		 System.out.println("Enter Rate of Interest: ");
		 rate = sc.nextDouble();
		 
		 System.out.println("Year");
		 year = sc.nextDouble();
		 
		 double SimpleInterest = (principleBalance*rate*year/100);
		 
		 System.out.println("Simple Interest: "+SimpleInterest);
		 
		 
		// BufferReader Method
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter Your Principle Balance: ");
		 principleBalance = Double.parseDouble(reader.readLine());
		 
		 System.out.println("Enter Rate of Interest: ");
		 rate = Double.parseDouble(reader.readLine());
		 
		 System.out.println("Time Perio (in year): ");
		 year = Double.parseDouble(reader.readLine());
		 
		 SimpleInterest = principleBalance*rate*year/100;
		 
		 System.out.println("Simple Interest is: "+SimpleInterest);
		 
		 
	}

}
