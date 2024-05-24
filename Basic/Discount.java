package Basic;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double purchasedAmount, discountAmount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Amount: ");
    purchasedAmount = sc.nextDouble();
    
    if(purchasedAmount>=10000) {
    	discountAmount = 0.1f*purchasedAmount;
    	System.out.println("Discount Amount on Purchased is:"+discountAmount);
    	
    }
    else {
    	discountAmount = 0.02f*purchasedAmount;
    	System.out.println("Discount Amount on Purchased is: "+discountAmount);
    }
	}

}
