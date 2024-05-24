package codingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'stringOperation' function below.
     *
     * The function is expected to return a STRING ARRAY.
     * The function accepts following parameters:
     * 1. STRING ARRAY start
     * 2. STRING ARRAY fin
     */

    public static List<String> stringOperation(List<String> start, List<String> fin) {
        // Write your code here
        List<String> result = new ArrayList<>();
        
        for (String s2 : fin) {
            boolean unique = false;
            for (String s1 : start) {
                if (isUniqueCombination(s1, s2)) {
                    result.add("YES");
                    unique = true;
                    break;
                }
            }
            if (!unique) {
                result.add("NO");
            }
        }
        return result;
    }

    private static boolean isUniqueCombination(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

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

public class source1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int startCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> start = IntStream.range(0, startCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());
        
        int finCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> fin = IntStream.range(0, finCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());
        
        List<String> result = Result.stringOperation(start, fin);
        System.out.print(result.stream().collect(Collectors.joining("\n")));
        
        bufferedReader.close();
    }
}
