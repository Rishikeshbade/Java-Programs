package programs;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableComparatorPerson {

	void comparable() {
		ArrayList<Person> List = new ArrayList<Person>();
		List.add(new Person(3, "Raj", 23));
		List.add(new Person(2, "Simran", 24));
		List.add(new Person(5, "Rahul", 26));
		List.add(new Person(1, "Riya", 25));
		List.add(new Person(4, "Sakshi", 27));
		System.out.println("--------------Before Sorting--------------");
		for (Person pl : List) {
			System.out.println(pl.id + " " + pl.Name + " " + pl.age);
		}
		Collections.sort(List);
		
		
		System.out.println("--------------After Sorting----------------");
		for (Person pl : List) {
			System.out.println(pl.id + " " + pl.Name + " " + pl.age);
		}
	}

	void comparotor() {
		ArrayList<Person> List = new ArrayList<Person>();
		List.add(new Person(1, "Raj", 23));
		List.add(new Person(2, "Simran", 26));
		List.add(new Person(3, "Rahul", 25));
		List.add(new Person(4, "Riya", 30));
		List.add(new Person(5, "Sakshi", 27));
		
		
		System.out.println("--------------Sorting by Age--------------");
		Collections.sort(List, new AgeComparator() );
		for (Person pl : List) {
			System.out.println(pl.id + " " + pl.Name + " " + pl.age);
		}
		System.out.println("--------------Sorting by Name---------------");
		Collections.sort(List, new NameComparator());
		for (Person pl : List) {
			System.out.println(pl.id + " " + pl.Name + " " + pl.age);
		}

	}

	public static void main(String[] args) {
		TestComparableComparatorPerson test = new TestComparableComparatorPerson();
		test.comparable();
		test.comparotor();

	}

}
