package collection;

import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		Queue<String> queue = new java.util.PriorityQueue<String>();
		queue.add("jasmin");
		queue.offer("Lotus");
		queue.offer("Rose");
		queue.offer("Mogra");
		queue.offer("Lilly");
		//queue.offer(null);
		
		System.out.println("Queue : "+queue);
		
		System.out.println("Head of Queue : "+queue.element());
		
		System.out.println("Removing Element : "+queue.remove());
		
		System.out.println("After Removing Element : "+queue);

		System.out.println("Removing Element  "+queue.poll());
		
		System.out.println("After Remvoing Element : "+queue);

	}

}
