package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SalaryTax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double salary,taxAmount;
	  //Scanner Method
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Salary: ");
	   salary = sc.nextDouble();
	  
	   taxAmount = 0.12f*salary;
	  
	  System.out.println("Tax Amount at 12% of Salary: "+taxAmount);
	  
	 
	  
	  //BufferReader Method
	  
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter Your Salary: ");
	  salary = Double.parseDouble(reader.readLine());
	  
	  taxAmount = 0.12f*salary;
	  
	  System.out.println("Tax Amount at 12% of Salary: "+taxAmount);
	  
	 
	}

}