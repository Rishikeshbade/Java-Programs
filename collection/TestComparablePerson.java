package collection;

import java.util.ArrayList;
import java.util.Collections;

class TestComparablePerson  {
	void Comparable() {
		ArrayList<Person> pr = new ArrayList<Person>();
		pr.add(new Person(2, "Raj", 23));
		pr.add(new Person(3, "Rahul", 25));
		pr.add(new Person(4, "Simran", 22));
		pr.add(new Person(1, "Riya", 21));
		
		System.out.println("**************Before Sorting*************");
		for(Person ol : pr) {
			System.out.println(ol.id+" "+ol.Name+" "+ol.age);
		}
		Collections.sort( pr);
		System.out.println("***************After Sorting*************");
		for(Person ol : pr) {
			System.out.println(ol.id+" "+ol.Name+" "+ol.age);
		}
	}
	public static void main(String[] args) {
	TestComparablePerson test = new TestComparablePerson();
	test.Comparable();
	}
}


