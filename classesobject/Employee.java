package classesobject;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	float WorkingDays, PerDay;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		employeeId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		employeeName = sc.nextLine();
		
		System.out.println("Enter Working Days: ");
		WorkingDays = sc.nextFloat();
		
		System.out.println("Enter Per Day: ");
		PerDay = sc.nextFloat();
	}
	public void calculate() {
		double salary;
		
		salary = PerDay*WorkingDays;
		
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.accept();
		employee.calculate();
	}
}
