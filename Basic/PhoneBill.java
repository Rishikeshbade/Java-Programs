package Basic;

import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int noOfCalls, billAmount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No Of Calls: ");
    noOfCalls = sc.nextInt();
    if(noOfCalls<200){
    	billAmount = noOfCalls*1;
    }
    else
     {
    	billAmount = noOfCalls*3;
    }
    System.out.println("Bill Anount: "+billAmount);
	}

}
