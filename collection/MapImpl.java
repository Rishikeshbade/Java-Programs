package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("Ge", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("Implementing Hashmap : ");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Country code : "+entry.getKey()+", Country : "+entry.getValue());
		}
		
		System.out.println(map.get("Br"));
		
		Map<String, String> treemap = new TreeMap<String, String>();
		treemap.put("BR102", "Coffee");
		treemap.put("D305", "Chole-Puri");
		treemap.put("BR105", "Tea");
		treemap.put("L212", "Biryani");
		//treemap.put(null, null);
		
		System.out.println("Implementing TreeMap : ");
		for(Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Country code : "+entry.getKey()+", Country : "+entry.getValue());
		}
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("BE102", "Coffee");
		hashtable.put("D102", "Biryani");
		hashtable.put("L27", "Pizza");
		hashtable.put("D106", "Sandwitch");
		//hashtable.put(null, null);
		
		System.out.println("Implementing HashTable : ");
		for(Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Country code : "+entry.getKey()+", Country : "+entry.getValue());
		}
		
		

	}

}
