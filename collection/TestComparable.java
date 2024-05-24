package collection;

import java.util.ArrayList;
import java.util.Collections;

 public class TestComparable {

	void ComparableDemo(){
		ArrayList<Book1> list = new ArrayList<Book1>();
		list.add(new Book1(2, "Book2", "Author2", "Publisher2", 4));
		list.add(new Book1(1, "Book1", "Author1", "Publisher1", 5));
		list.add(new Book1(5, "Book5", "Author5", "Publisher5", 6));
		list.add(new Book1(3, "Book3", "Author3", "Publisher3", 3));
		list.add(new Book1(4, "Book4", "Author4", "Publisher4", 2));
		
		System.out.println("**************Before Sorting*************");
		for(Book1 bk : list) {
			System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);
		}
		Collections.sort( list);
		System.out.println("***************After Sorting*************");
		
		for(Book1 bk : list) {
			System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);
		}
		
		
	}

	
	public static void main(String[] args) {
		TestComparable test = new TestComparable();
		test.ComparableDemo();

	}


	

	
}
