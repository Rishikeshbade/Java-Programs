package objectandwrapper;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	
	public static boolean Anagrams(String str1, String str2) {
		str1 = str1.replaceAll("\\s", " ").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two String: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(Anagrams(str1, str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		

	}

}
