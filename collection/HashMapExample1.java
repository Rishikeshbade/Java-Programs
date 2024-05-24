package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample1 {
	
	void HashmapDemo(){
		HashMap<Integer, String> map =  new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Orange");
		map.put(4, "Banana");
		
		System.out.println("Iterating Hashmap.....");
		System.out.println(" key "+" "+"Value");
		for(Entry<Integer, String> m : map.entrySet()) {
			System.out.println(" " +m.getKey()+ " "+m.getValue());
		}
	}

	public static void main(String[] args) {
		HashMapExample1 hash = new HashMapExample1();
		hash.HashmapDemo();

	}

}
