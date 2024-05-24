package programs;

public class LargestString {

	public static void main(String[] args) {
		String[]  strings = {"Apple", "Orange", "Grapes","Watermelon"};
		
		String largeststring = findLargestString(strings);
		
		System.out.println("The Largest String is : "+largeststring);
		
	}

	public static String findLargestString(String[] strings) {
		String largest = strings[0];
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].compareTo(largest) > 0) {
				largest = strings[i];
			}
		}
		return largest;
	}

}
