package collection;

public class Person implements Comparable<Person>{
	
	int id;
	String Name;
	int age;
	public Person(int id, String name, int age) {
		this.id = id;
		Name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person p) {
		if(id > p.id) {
			return 1;
		}
		else if(id < p.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	

}
