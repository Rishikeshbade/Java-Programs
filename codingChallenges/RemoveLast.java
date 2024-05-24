package codingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveLast {
	private static String removeFirstAndLast(String str, char c) {
        int firstIndex = str.indexOf(c);
        int lastIndex = str.lastIndexOf(c);

        if (firstIndex != -1 && lastIndex != -1) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(firstIndex);
            sb.deleteCharAt(lastIndex - 1);
            return sb.toString();
        }

        return str;
    }
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        char c = bufferedReader.readLine().charAt(0);

        String result = removeFirstAndLast(str, c);
        
        System.out.println(result);

  
    }

    
    

}
