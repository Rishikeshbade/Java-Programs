package Basic;

import java.util.Scanner;

public class TaxIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary, taxAmount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Salary: ");
    salary = sc.nextDouble();
   
    if(salary<25000) 
    {
    	taxAmount = 0.1f*salary;
    	System.out.println("Tax Amount on Salary:" +taxAmount);
    }
    else {
    	taxAmount = 0.15f*salary;
    }
    System.out.println("Tax Amount on Salary:" +taxAmount);
	}


}
