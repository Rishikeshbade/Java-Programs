package collection;

import java.util.Stack;

public class StcakEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("Gauva");
		stack.add("Mango");
		stack.add("Gauva");
		stack.add("Apple");
		stack.add("Banana");
		stack.add(null);
		
		System.out.println("Stack : "+stack);
		System.out.println("Removig Element : "+stack.pop());
		System.out.println("Stack After Removing : "+stack);
		System.out.println("Search Mango: "+stack.search("Gauva"));
		System.out.println("Search Watermelon : "+stack.search("watermelon"));



	}

}
