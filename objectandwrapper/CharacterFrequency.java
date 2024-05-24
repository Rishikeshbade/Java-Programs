package objectandwrapper;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String: ");
		String str = sc.nextLine();
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
			}
		}
		
		for(char ch : frequencyMap.keySet()) {
			System.out.println("Character"  +ch+  "occurs"  +frequencyMap.get(ch)+  "times.");
		}

	}

}
