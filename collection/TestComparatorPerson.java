package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparatorPerson {
	void ComparatorDemo(){
		ArrayList<Person1> pr = new ArrayList<Person1>();
		pr.add(new Person1(2, "Raj", 23));
		pr.add(new Person1(3, "Rahul", 25));
		pr.add(new Person1(4, "Simran", 22));
		pr.add(new Person1(1, "Riya", 21));
		System.out.println("Sorting By Age");
		Collections.sort(pr, new AgeComparator());
		for (Person1 st : pr) {
			System.out.println(st.id + " " + st.Name + " " + st.age);
		}
		System.out.println("--------------------------------");
		Collections.sort(pr, new NameComparator());
		for (Person1 st : pr) {
			System.out.println(st.id + " " + st.Name + " " + st.age);
		}
		System.out.println("----------------------------------");
	
}

	class AgeComparator implements Comparator<Person1> {

		@Override
		public int compare(Person1 p1, Person1 p2) {
			if (p1.age == p2.age) {
				return 0;
			} else if (p1.age > p2.age) {
				return 1;
			} else {
				return -1;
			}
		}

	}

	class NameComparator implements Comparator<Person1> {

		@Override
		public int compare(Person1 p1, Person1 p2) {
			if (p1.age == p2.age) {
				return 0;
			} else if (p1.age > p2.age) {
				return 1;
			} else {
				return -1;
			}
		}
	}



		public static void main(String[] args) {
			TestComparatorPerson test = new TestComparatorPerson();
			test.ComparatorDemo();
		}
	}

