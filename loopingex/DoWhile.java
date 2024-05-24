package loopingex;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int a,b,c;
		char ch; 
		 Scanner sc = new Scanner(System.in);
		 do {
	       System.out.println("Enter 2 numbers : ");
	       a = sc.nextInt();
	       b = sc.nextInt();
	       
	       c = a+b;
	       System.out.println("Addition : "+c);
	       
	       System.out.println("Press Y to Continue: ");
	       ch = sc.next().charAt(0);
		 }while(ch== 'Y' || ch=='y');
	}

}
