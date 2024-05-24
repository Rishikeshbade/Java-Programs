package collection;

import java.util.ArrayList;

public class ExampleofCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Grapes");
		list.add("Mango");
		list.add("Apple");
		list.add("Chickko");
		
		for(String string : list) {
			System.out.println(string);
		}
		

	}

}
