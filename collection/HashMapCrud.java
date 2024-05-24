package collection;

import java.util.HashMap;

public class HashMapCrud  {
	
	void Crud() {
		HashMap<Integer, Book> bookmap = new HashMap<Integer, Book>();
		
		
		//create books
		Book b1 = new Book(101, "Let us C", "Yaswant Kanatkar");
		Book b2 = new Book(102, "Data Communication & Networking", "George");
		Book b3 = new Book(103, "Operating System", "Galvin");
		
		//add books
		bookmap.put(b1.getId(), b1);
		bookmap.put(b2.getId(), b2);
		bookmap.put(b3.getId(), b3);
		
		//read books
		Book  read1 = bookmap.get(101);
		Book  read2 = bookmap.get(102);
		Book  read3 = bookmap.get(103);
		
		//Update books
		System.out.println("*************Book List*********");
		System.out.println(read1);
		System.out.println("--------------------------------");
		System.out.println(read2);
		System.out.println("--------------------------------");
		System.out.println(read3);
		System.out.println("--------------------------------");
		
		//update book
		if(read1 != null) {
			read1.setTitle("New Title");
			bookmap.put(read1.getId(), read1);
			System.out.println("******Updated BookList*******");
			System.out.println("Updated BookList : " +read1);
		}
		
		
		//delete book
		bookmap.remove(102);
		System.out.println("Book with Id 102 has been deleted...");
		System.out.println("Revised Book After Deletion");
		System.out.println("----------------------------");
		
		
		
		for(Book book : bookmap.values()) {
			System.out.println(book);
		}
		
	}

	public static void main(String[] args) {
		HashMapCrud map = new HashMapCrud();
		map.Crud();
	}

}
