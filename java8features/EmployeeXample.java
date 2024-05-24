package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeSalary{
	int id;
	String Name;
	int age;
	double Salary;
	public EmployeeSalary(int id, String name, int age, double salary) {
		this.id = id;
		Name = name;
		this.age = age;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSalary [id=" + id + ", Name=" + Name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	
}

public class EmployeeXample {

	public static void main(String[] args) {
		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();
		list.add(new EmployeeSalary(101, "Raj", 30,  55000));
		list.add(new EmployeeSalary(102, "Rahul", 29,  20000));
		list.add(new EmployeeSalary(103, "Simran", 25,  44000));
		list.add(new EmployeeSalary(104, "Riya", 31,  30000));
		list.add(new EmployeeSalary(105, "Naman", 27,  37000));
		
		Stream<EmployeeSalary> e = list.stream().filter(emp -> emp.Salary > 50000);
		List<EmployeeSalary> s = e.collect(Collectors.toList());
		System.out.println("Employee with salary greater than 50000: "+s);
		
		System.out.println("---------------------------------------------------------------");
		
		Stream<EmployeeSalary> e2 = list.stream().filter(emp -> emp.Salary < 30000+5000);
		List<EmployeeSalary> s2 = e2.collect(Collectors.toList());
		System.out.println("Employee with salary less than 30000 after adding 5000 : "+s2);
		
		

	}

}
