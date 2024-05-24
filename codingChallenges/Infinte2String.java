package codingChallenges;

import java.util.Scanner;

public class Infinte2String {
	
	public static boolean infString(String infStr, String tofind) {
		if(tofind.length()<infStr.length() && !infStr.contentEquals(tofind)) {
			return false;
		}
		
		String replaceStr = infStr;
		while(replaceStr.length() < tofind.length()*3) {
		replaceStr += infStr;
		}
		return replaceStr.contains(tofind);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word[] = str.split(" ");
		String a = word[0];
		String b = word[1];
		if(infString(a, b)) {
			System.out.println("YES");
		}
		else
			System.out.println("No");
		
		
	}
}
