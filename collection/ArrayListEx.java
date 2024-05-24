package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Raj");
		list.add(101);
		list.add(56.67);
		list.add(true);
		list.add(null);
		list.add("Raj");
		
		System.out.println("Non Generic List: "+list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Rose");
		list2.add("Lily");
		list2.add("Mogra");
		list2.add("Lotus");
		list2.add("Rose");
		//list2.add(null);
		
		System.out.println("Generic List: "+list2);
		
		System.out.println("Iterating list using Iterator Interface: ");
		Iterator<String> iterator = list2.iterator();
		while(iterator .hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating list using For each loop: ");
		for(String string : list2) {
			System.out.println(string);
		}
		
		System.out.println("Iterating list using Sorting");
		Collections.sort(list2);
		for(String string : list2) {
			System.out.println(string);
		}
		

	}

}
