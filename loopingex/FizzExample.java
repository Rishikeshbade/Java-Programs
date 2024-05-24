package loopingex;

import java.util.Scanner;

public class FizzExample {

	public static void main(String[] args) {
		int n, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
	    n = sc.nextInt();
	    
	    for(i=0; i<=n ; i++) {
	    if(i % 3 == 0 && i % 5 == 0) {
	    	System.out.println("FizzBuzz");
	    }else if (i % 3 == 0) {
	    	System.out.println("Fizz");
	    }
	    else if(i % 5 == 0){
	    	System.out.println("Buzz");
	    }else {
	    	System.out.println(i);
	    }
		
	    }
	}

}
