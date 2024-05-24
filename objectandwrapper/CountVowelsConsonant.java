package objectandwrapper;

import java.util.Scanner;

public class CountVowelsConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine().toLowerCase();
		
		int vowels = 0;
		int consonant = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}
				else {
					consonant++;
				}
			}
		}
		
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonant: "+consonant);

	}

}
