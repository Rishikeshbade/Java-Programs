package codingChallenges;

import java.util.Scanner;

public class CountIn {

	public int CountIn(String Str) {
		int count = 0;
		String SplitedStr[] = Str.split(" ");
		
		for(int i = 0; i < SplitedStr.length; i++) {
			if(SplitedStr[i].equalsIgnoreCase("in"))
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine();

		CountIn obj = new CountIn();
		int res = obj.CountIn(Str);
		System.out.println(res);
	}

}
