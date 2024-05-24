package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStartEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Suraj");
		list.add("Simran");
		list.add("Rahul");
		list.add("Manas");
		list.add("Sakshi");
		
		Stream<String> s = list.stream().filter(str -> str.startsWith("S"));
		List<String> result = s.collect(Collectors.toList());
		System.out.println("String String with 'S' :"+result);
		
		
		
		

	}

}
