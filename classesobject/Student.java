package classesobject;

import java.util.Scanner;

public class Student {
	
	int rollNumber;
	String name;
	float java,cpp,python;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number: ");
		rollNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Marks of Java,C++,Python: ");
		java = sc.nextFloat();
		cpp = sc.nextFloat();
		python = sc.nextFloat();
		}
	public void calculate() {
		float total, percent;
		
		total = java+cpp+python;
		percent = total/3;
		System.out.println("Student RollNumber: "+rollNumber);
		System.out.println("Student Name: "+name);
		System.out.println("Total:"+total);
		System.out.println("Percentage: "+percent);
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.accept();
		student.calculate();
	}

}
