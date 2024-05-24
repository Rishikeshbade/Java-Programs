package programs;

import java.util.Scanner;

public class VowelsCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine().toLowerCase();
		
		int vowels = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}
			}
		}
		System.out.println("Number of Vowels : "+vowels);
	}

}
