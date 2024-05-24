package classesobject;

import java.util.Scanner;

public class Source {
	public int getSecondSmallest(int[]arr) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int n:arr) {
			if(n<smallest) {
				smallest = secondSmallest;
				secondSmallest = n;
			}else if(n < secondSmallest){
				secondSmallest = n;
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		int[]arr = {23,54,34,65,67};
		int[]arr1 = {54,23,28,87,56};
		Source obj = new Source();
		int secondSmallest = obj.getSecondSmallest(arr);
		System.out.println("Second Smallest Number is : "+secondSmallest);
		
		int secondSmallest1 = obj.getSecondSmallest(arr1);
		System.out.println("Second Smallest Number is : "+secondSmallest1);
		
		
	}
}
