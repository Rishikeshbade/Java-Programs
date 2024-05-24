package objectandwrapper;

import java.util.Scanner;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String str) {
		str = str.replace("[^a-zA-Z0-9]", "").toLowerCase();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String: ");
		String input = sc.nextLine();
		
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
