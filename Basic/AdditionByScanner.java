package Basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AdditionByScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d,e,f;
       // Scanner Method
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 2 numbers : ");
       
       a = sc.nextInt();
       b = sc.nextInt();
       
       c = a+b;
       d = a-b;
       e = a*b;
       f = a/b;
       
       System.out.println("Addition : "+c);
       System.out.println("Subtraction : "+d);
       System.out.println("Multiple : "+e);
       System.out.println("Division : "+f);
       
       // BufferedReader Method
       
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Two Numbers: ");
       
       a = sc.nextInt();
       b = sc.nextInt();
       
       c = a+b;
       d = a-b;
       e = a*b;
       f = a/b;
       
       System.out.println("Addition is: "+c);
       System.out.println("Subtraction is: "+d);
       System.out.println("Multiplication is: "+e);
       System.out.println("Division is: "+f);
	}
}