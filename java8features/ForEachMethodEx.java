package java8features;

import java.util.ArrayList;

public class ForEachMethodEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Thane");
		list.add("Pune");
		list.add("Mumbai");
		list.add("Chennai");
		list.add("Delhi");
		list.add("Banglore");
		
		list.forEach(str -> System.out.println(str));
 
	}

}
