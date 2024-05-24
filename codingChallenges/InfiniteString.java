package codingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteString {
	

	public static boolean infString(String infStr, String tofind) {
		if(tofind.length()<infStr.length() && !infStr.contains(tofind)) {
			return false;
		}
		String replaceStr = infStr;
		while(replaceStr.length()<tofind.length()*3) {
			replaceStr += infStr;
		}
		
		return replaceStr.contains(tofind);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String word[] = str.split(" ");
		String a = word[0];
		String b = word[1];
		if(infString(a, b)) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}

	}

}
