package loopingex;

import java.util.Scanner;

public class MultplicationTable {

	public static void main(String[] args) {
	 int number;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Number: ");
	 number = sc.nextInt();
	 
	 System.out.println("multiplication Table of"+number+":");
	 for (int i = 1; i<=10;i++) {
		 System.out.println(number+"*"+i+"="+(number*i));
	 }

	}

}
