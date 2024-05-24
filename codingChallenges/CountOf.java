package codingChallenges;

import java.util.Scanner;

public class CountOf {
	
	public int CountOf(String str) {
		int count = 0;
		String splitedStr[] = str.split(" ");
		
		for(int i = 0; i < splitedStr.length; i++) {
			if(splitedStr[i].equalsIgnoreCase("of"))
				count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		CountOf obj = new CountOf();
		int res = obj.CountOf(str);
		System.out.println(res);
	}

}
