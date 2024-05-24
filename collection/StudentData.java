package collection;

import java.util.ArrayList;

 class Student{
	int rollNumber;
	String Name;
	int age;
	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		Name = name;
		this.age = age;
	}
	
	  @Override 
	  public String toString() { return "Student [rollNumber=" +
	  rollNumber + ", Name=" + Name + ", age=" + age + "]"; }
	 
	/*
	 * public void display() { System.out.println("Roll No: "+rollNumber);
	 * System.out.println("Name: "+Name); System.out.println("Age: "+age); }
	 */
}

public class StudentData {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Raj", 20);
		Student1 s2 = new Student1(2, "Riya", 21);
		Student1 s3 = new Student1(3, "Simran", 22);
		Student1 s4 = new Student1(4, "Rahul", 19);
		Student1 s5 = new Student1(5, "Sameer", 20);
		
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		System.out.println(" Student List: ");
		for(Student1 string : list) {
			/*
			 * System.out.println("Roll No: " + string.rollNumber);
			 * System.out.println("Name: " + string.Name); System.out.println("Age: " +
			 * string.age);
			 */
			System.out.println(string);
		}
		

	}

}
