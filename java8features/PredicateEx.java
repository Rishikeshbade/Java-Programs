package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	int id;
	String Name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		Name = name;
		this.age = age;
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
	
	
	
}

public class PredicateEx {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Raj", 20));
		list.add(new Student(101, "Meera", 18));
		list.add(new Student(101, "Meena", 25));
		list.add(new Student(101, "Manas", 32));
		list.add(new Student(101, "Paras", 15));
		
		Predicate<Student> p1 = s -> s.getName().startsWith("M");
		Predicate<Student> p2 = s -> s.getAge() > 40;
		
		boolean b1 = list.stream().anyMatch(p1);
		boolean b2 = list.stream().anyMatch(p2);
		System.out.println("p1 with anyMatch : "+b1);
		System.out.println("p2 with anyMatch : "+b2);
		System.out.println("---------------------------------------------------------------");
		boolean b3 = list.stream().allMatch(p1);
		boolean b4 = list.stream().allMatch(p2);
		System.out.println("p1 with allMatch : "+b3);
		System.out.println("p2 with allMatch : "+b2);
		System.out.println("----------------------------------------------------------------");
		boolean b5 = list.stream().noneMatch(p1);
		boolean b6 = list.stream().noneMatch(p2);
		System.out.println("p1 with noneMatch : "+b5);
		System.out.println("p2 with noneMatch : "+b6);

	}

}
