package objectandwrapper;

import java.util.Scanner;

public class LargestSmallestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String input = sc.nextLine();
		
		String[] words = input.split("\\s+");
		
		String LargestWord = words[0];
		String SmallestWord = words[0];
		
		for(int i = 1; i < words.length; i++) {
			if(words[i].length() < SmallestWord.length()) {
				SmallestWord = words[i];
			}
			if(words[i].length() > LargestWord.length()) {
				LargestWord = words[i];
			}
		}
		System.out.println("Smallest word: "+SmallestWord);
		System.out.println("Largest word: "+LargestWord);

	}

}
