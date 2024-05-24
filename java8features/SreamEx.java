package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Riya");
		list.add("Bhagyashree");
		list.add("Meera");
		list.add("Manas");
		list.add("Rishikesh");

		// without Stream API
		int count = 0;
		for (String string : list) {
			if (string.length() > 7)
				count++;
		}
		System.out.println("There are " + count + " strings with length greater than 7");

		System.out.println("---------------------------------------------------------------");

		// With Stream API
		long c = list.stream().filter(str -> str.length() > 7).count();
		System.out.println("Using Stream  : " + c + " string with length greater than 7");

		System.out.println("---------------------------------------------------------------");
		// 1.create Stream API
		Stream<String> allnames = list.stream();

		// 2.Perform intermediate operation
		Stream<String> longName = allnames.filter(str -> str.length() > 7);

		// 3.perform terminal operation
		longName.forEach(str -> System.out.println(str));

		System.out.println("--------------------------------------------------------------");

		List<String> names = Arrays.asList("Raj", "Riya", "Bhagyashree", "Rishikesh", "Vyankatesh", "Paras", "Saloni");

		List<String> longnms = names.stream().filter(str -> str.length() > 5 && str.length() < 12)
				.collect(Collectors.toList());
		System.out.println("Using Method Reference and collector: ");
		longnms.forEach(System.out::println);
	}

}
