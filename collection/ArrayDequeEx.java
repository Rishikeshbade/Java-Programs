package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice- Creame");
		deque.offerFirst("Sandwitch");
		deque.offerLast("Pizza");
		deque.offer("Burger");
		//deque.offer(null);
		
		System.out.println("Deque : "+deque);
		
		System.out.println("Removing 1st Element : "+deque.pollFirst());
		
		System.out.println("Deque : "+deque);
		
		System.out.println("Removing Last Element : "+deque.pollLast());
		
		System.out.println("Deque : "+deque);
		
		System.out.println("Head of queue : "+deque.peek());
	}

}
