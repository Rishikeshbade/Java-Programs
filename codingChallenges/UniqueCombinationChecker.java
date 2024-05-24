package codingChallenges;

import java.util.Scanner;

public class UniqueCombinationChecker {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of strings in start array
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        String[] start = new String[n];
        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextLine();
        }
        
        // Read number of strings in fin array
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        String[] fin = new String[m];
        for (int i = 0; i < m; i++) {
            fin[i] = scanner.nextLine();
        }
        
        String[] result = checkUniqueCombinations(n, start, m, fin);
        
        // Print the result
        for (String res : result) {
            System.out.println(res);
        }
        
        scanner.close();
    }
    
    public static String[] checkUniqueCombinations(int n, String[] start, int m, String[] fin) {
        String[] result = new String[m];
        
        for (int i = 0; i < m; i++) {
            result[i] = "NO";  // Default value
            
            for (int j = 0; j < n; j++) {
                if (start[j].length() == fin[i].length() && differsByOneCharacter(start[j], fin[i])) {
                    result[i] = "YES";
                    break;
                }
            }
        }
        
        return result;
    }
    
    public static boolean differsByOneCharacter(String s1, String s2) {
        int diffCount = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        
        return diffCount == 1;
    }
}
