package Basic;

import java.util.Scanner;

public class CheckVowelCosanant {

	public static void main(String[] args) {
		char vowels;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    System.out.println(ch + " is a consonant.");
                else
                    System.out.println("Invalid input.");

	}
	}
}
