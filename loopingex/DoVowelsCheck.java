package loopingex;

import java.util.Scanner;

public class DoVowelsCheck {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a character: ");
            ch = sc.next().charAt(0);
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
                        System.out.println("Invalid input. Please enter a valid character.");
            }
            System.out.println("Press Y to continue: ");
            ch = sc.next().charAt(0);
        } while ((ch == 'Y') || (ch == 'y'));
        
	}

}
