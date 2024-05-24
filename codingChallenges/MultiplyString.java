package codingChallenges;

import java.math.BigInteger;

public class MultiplyString {
	public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        return result.toString();
    }

    public static void main(String[] args) {
        
        String num1 = "5";
        String num2 = "5";

       
        String result = multiply(num1, num2);
        System.out.println(result);
    }

}
