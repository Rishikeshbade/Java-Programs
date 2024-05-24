package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//accepting input from using BufferReader class
public class Percentage {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int id;
		String name;
		double phy,chem,maths,total,percentage;
		// BufferedReder Method
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id: ");
		id = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter name: ");
		name = reader.readLine();
		
		System.out.println("Enter marks of phy, chem, maths: ");
		phy = Double.parseDouble(reader.readLine());
		chem = Double.parseDouble(reader.readLine());
		maths = Double.parseDouble(reader.readLine());
		
		total = phy + chem + maths;
		percentage = total/3;
		
		System.out.println("Student Id: "+id+"\nName:"+name);
		System.out.println("Total:"+total+"\nPercent:"+percentage);
		
		// Scanner Method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id: ");
		id = sc.nextInt();
		
		System.out.println("Enter Your Name: ");
		name = sc.next();
		
		System.out.println("Enter Marks of phy, chem, maths: ");
		phy = sc.nextDouble();
		chem = sc.nextDouble();
		maths = sc.nextDouble();
		
		total = phy + chem + maths;
		percentage = total/3;
		
		System.out.println("Student Id: "+id+"\nName: "+name);
		System.out.println("Total: "+total+"\nPercent: "+percentage);
	}


}