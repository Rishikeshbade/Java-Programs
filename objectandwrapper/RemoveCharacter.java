package objectandwrapper;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeCharacter(String str, char charToRemove) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if(currentChar != charToRemove) {
				sb.append(currentChar);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = sc.nextLine();
		
		System.out.println("Enter the charcter to remove: ");
		char charToRemove = sc.next().charAt(0);
		
		String result = removeCharacter(inputString, charToRemove);
		System.out.println("Result: "+result);

	}

}
