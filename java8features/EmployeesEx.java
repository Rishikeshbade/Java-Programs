package java8features;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int id;
	String Name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
}

public class EmployeesEx {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Aysha", 23));
		list.add(new Employee(2, "Raj", 21));
		list.add(new Employee(3, "Suraj", 32));
		list.add(new Employee(4, "Manish", 30));
		list.add(new Employee(5, "Simran", 27));
		
		Collections.sort(list, (e1, e2) -> {
			return e1.Name.compareTo(e2.Name);
		});
		
		list.forEach(e -> System.out.println(e));
		
		
		
		
		/*
		 * //**System.out.println(
		 * "------------------------------------------------------");
		 * Collections.sort(list, (e1, e2) -> { if (e1.age == e2.age) { return 0; } else
		 * if (e1.age > e2.age) { return 1; } else { return -1; } }); list.forEach(e ->
		 * System.out.println(e));
		 */
	}
	
}
