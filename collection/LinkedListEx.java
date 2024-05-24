package collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Apple");
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add(1,"Grapes");
		linkedlist.add("Apple");
		linkedlist.add(null);
		
		for(String string : linkedlist) {
			System.out.println(string);
		}
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("Jasmin");
		linkedList2.add("Lily");
		
		linkedlist.addAll(linkedList2);
		System.out.println("Adding list2 in list1: \n"+linkedlist);

	}

}
