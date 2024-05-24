package codingChallenges;

import java.util.stream.Collectors;

public class InsertSpace {
	public static String insertSpace(String s) {
		return s.chars().mapToObj(c-> (char) c + "").collect(Collectors.joining());
	}

	public static void main(String[] args) {
	InsertSpace source = new InsertSpace();
	String input = "capgemini";
	String result = source.insertSpace(input);
	System.out.println(result);

	}

}
