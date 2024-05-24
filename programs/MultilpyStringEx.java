 package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class MultilpyStringEx {
	
	public static String multiplyStrings(String num1, String num2) {
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);

        BigInteger result = bigInteger1.multiply(bigInteger2);

        return result.toString();
    }

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = bufferedReader.readLine();
        String num2 = bufferedReader.readLine();

        String result = multiplyStrings(num1, num2);
        System.out.println(result);
    }

    
}
