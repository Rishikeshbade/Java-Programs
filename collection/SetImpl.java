package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		Set<String> hasSet = new HashSet<String>();
		hasSet.add("Riya");
		hasSet.add("Ravi");
		hasSet.add("Riya");
		hasSet.add("Meera");
		hasSet.add(null);
		
		System.out.println("Implementing Hashset : ");
		for(String string : hasSet) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Guava");
		linkedHashSet.add(null);
		
		System.out.println("Implementing LinkedHashset : \n"+linkedHashSet);
		
		
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Pizza");
		treeset.add("Burger");
		treeset.add("Coffee");
		treeset.add("Burger");
		//treeset.add(null);
		
		System.out.println("Implementing TreeSet : \n"+treeset);

	}

}
