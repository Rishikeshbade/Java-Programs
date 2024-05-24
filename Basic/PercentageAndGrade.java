package Basic;

import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String[] args) {
		int physic, chemestry, maths, total, percentage;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your 3 Subjects: ");
	physic = sc.nextInt();
	chemestry = sc.nextInt();
	maths = sc.nextInt();
	
	total = physic + chemestry + maths;
	percentage = total/3;
	if(percentage>=90) {
		System.out.println("A");
	}
	else if(percentage>=70) {
		System.out.println("B");
	}
	else if(percentage>=60) {
		System.out.println("C");
	}
	else if(percentage>=50) {
		System.out.println("D");
	}
	else {
		System.out.println("Fail");
	}
	System.out.println("Total: "+total+"\nPercent: "+percentage);
	}

}
