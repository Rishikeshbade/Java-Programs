package classesobject;

import java.util.Scanner;

import arrayexample.Source;

public class EmployeeMembers {
	int empCode;
	String empName;
	double basicSalary,allowance,netSalary,tax,grossSalary;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();
		
		System.out.println("Enter Employee Code: ");
		empCode = sc.nextInt();
		
		System.out.println("Enter Basic Salary: ");
		basicSalary = sc.nextDouble();
	}
	public void allow() {
		allowance = basicSalary*0.55;
	}
	public void gross() {
		grossSalary = basicSalary + allowance;
	}
	public void tax() {
		tax = 0.12*grossSalary;
		
	}
	public void net() {
		netSalary = grossSalary - tax;
	}

	public void display() {
		System.out.println("Employe Name: "+empName);
		System.out.println("Employe Code: "+empCode);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Allowance: "+allowance);
		System.out.println("Gross Salary: "+grossSalary);
		System.out.println("Tax: "+tax);
		System.out.println("Net Salary: "+netSalary);
	}
	public static void main(String[] args) {
		
		EmployeeMembers obj = new EmployeeMembers();
		obj.accept();
		obj.allow();
		obj.gross();
		obj.tax();
		obj.net();
		obj.display();
	}
}
