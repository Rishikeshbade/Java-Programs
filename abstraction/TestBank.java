package abstraction;

import java.util.Scanner;

abstract class Bank{
	
	public  abstract double getRateOfInterest();
}

class Axis extends Bank{

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.5;
	}
	
}

class Sbi extends Bank{

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.2;
	}
	
}


public class TestBank {

	public static void main(String[] args) {
		double principalAmount, years, rateSbi, rateAxis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount and No of Years: ");
		principalAmount = sc.nextDouble();
		years = sc.nextDouble();
		
		Bank bank;
		
		bank = new Sbi();
		rateSbi = bank.getRateOfInterest();
		
		bank = new Axis();
		rateAxis = bank.getRateOfInterest();
		
		double SimpleInterestSbi = principalAmount*rateSbi*years/100;
		double SimpleInterestAxis = principalAmount*rateAxis*years/100;
		
		System.out.println("Simple Interest for Sbi: "+SimpleInterestSbi);
		System.out.println("Simple Interest for Axis: "+SimpleInterestAxis);

	}
	

}
