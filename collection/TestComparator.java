package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		return s1.Name.compareTo(s2.Name);
	}
}

	public class TestComparator {

		void ComparatorDemo(){
			ArrayList<Student1> list = new ArrayList<Student1>();
			list.add(new Student1(1, "Teena", 30));
			list.add(new Student1(2, "Leena", 33));
			list.add(new Student1(3, "Reena", 32));
			System.out.println("Sorting By Age");
			Collections.sort(list, new AgeComparator());
			for (Student1 st : list) {
				System.out.println(st.rollNo + " " + st.Name + " " + st.age);
			}
			System.out.println("--------------------------------");
			Collections.sort(list, new NameComparator());
			for (Student1 st : list) {
				System.out.println(st.rollNo + " " + st.Name + " " + st.age);
			}
			System.out.println("----------------------------------");
		
	}



	public static void main(String[] args) {
		TestComparator test = new TestComparator();
		test.ComparatorDemo();
	}
}


