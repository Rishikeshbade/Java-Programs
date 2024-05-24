package objectandwrapper;

import java.util.Scanner;

public class WordCount {
	
	
	public int countWord(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String input = sc.nextLine();
		WordCount wordCounter = new WordCount();
		int wordCount = wordCounter.countWord(input);
		System.out.println("Number of Words: "+wordCount);

	}

}
