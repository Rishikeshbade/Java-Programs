package Basic;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		int productCode;
		double orderAmount,discountRate, discountAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Code: ");
		productCode = sc.nextInt();
		
		System.out.println("Enter Order Amount: ");
		orderAmount = sc.nextDouble();
		
		discountRate = 0.00;
		
		switch(productCode){
		case 1:
			if(orderAmount>=500) {
				discountRate = 0.12;
			}
			else if(orderAmount>=300) {
				discountRate = 0.08;
			}
			else {
				discountRate = 0.02;
			}
			break;
		case 2:
			if(orderAmount>=2000) {
				discountRate = 0.10;
			}
			else if(orderAmount>=1500) {
				discountRate = 0.05;
			}
			break;
		case 3:
			if(orderAmount>=5000) {
				discountRate = 0.10;
			}
			else if(orderAmount>=2500) {
				discountRate = 0.05;
			}
			break;
		default:
			System.out.println("Invalid Product Code:");
		}
		
		discountAmount = orderAmount*discountRate;
		System.out.println("Discount Amount of Product is: $"+discountAmount);

	}

}
