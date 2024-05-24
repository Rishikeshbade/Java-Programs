package classesobject;

import java.util.Scanner;

public class StudentPercentage {
	int id;
	String name;
	double phy,chem,maths,percentage;
	
	
	public StudentPercentage() {
		 id = 101;
		 name = "raj";
		 phy = 68;
		 chem = 76;
		 maths = 80;
	}
		
		
	public StudentPercentage(int id, String name, double phy, double chem, double maths) {
		this.id = id;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		
	}
	public void calculate() {
	double total = phy+chem+maths;
	percentage = total/3;
	System.out.println("Percentage: "+percentage);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter Marks of Phyics \nChemistry \nMaths: ");
		double phy = sc.nextDouble();
		double chem = sc.nextDouble();
		double maths = sc.nextDouble();
		
		StudentPercentage obj = new StudentPercentage();
		obj.calculate();
		
		StudentPercentage obj1 = new StudentPercentage(id,name,phy,chem,maths);
		obj1.calculate();
	}
}
