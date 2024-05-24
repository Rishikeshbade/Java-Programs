package classesobject;

import java.util.Scanner;

public class Best {
	String customerName, phoneNumber;
    int noOfCalls;
    double tax, bill, total, ratePerCall = 0.0;
    
    public void accept() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Customer Name: ");
    	customerName = sc.nextLine();
    	
    	System.out.println("Enter Phone Number: ");
    	phoneNumber = sc.nextLine();
    	
    	System.out.println("Enter Number of Calls: ");
    	noOfCalls = sc.nextInt();
    }
    public void billing() {
        if (noOfCalls <= 100) {
            ratePerCall = 0.0;
        } else if (noOfCalls <= 300) {
            ratePerCall = 0.80;
        } else if (noOfCalls <= 500) {
            ratePerCall = 1.25;
        } else {
            ratePerCall = 2.50;
        }
    }
    public void calculate() {
    	double subtotal = noOfCalls*ratePerCall;
    	tax = 0.12 * subtotal;
        bill = subtotal + tax;
        total = bill;
    }
    public void display() {
    	System.out.println("Customer Name: "+customerName);
    	System.out.println("Phone Number: "+phoneNumber);
    	System.out.println("Number of Calls: "+noOfCalls);
    	System.out.println("Bill Amount: "+total);
    }
    public static void main(String[] args) {
		Best obj = new Best();
		obj.accept();
		obj.billing();
		obj.calculate();
		obj.display();
	}
}
