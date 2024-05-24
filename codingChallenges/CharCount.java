package codingChallenges;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CharCount {
	public Map<Character, Integer>  countChar(char[] a){
		Map<Character, Integer> map = new Hashtable<Character, Integer>();
		
		 for( char b : a) {
			map.put(b, map.getOrDefault(b, 0)+1);
		 }
		 return map;
	}

	public static void main(String[] args) {
		CharCount charCount = new CharCount();
		char[] a = {'a','f','c','d','a','c'};
		
		Map<Character, Integer> res = charCount.countChar(a);
		System.out.println(res);
	}
}
