package programs;

import java.util.Comparator;

class Person implements Comparable<Person> {
	
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
class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.age == p2.age) {
			return 0;
		} else if (p1.age > p2.age) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.Name.compareTo(p2.Name);
	}
	
}