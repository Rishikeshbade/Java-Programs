package programs;

import java.util.Scanner;

public class atendanceClass {
	 private static final int MOD = 1000000007;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        long ans = findWays(n);
	        System.out.println(ans);
	    }

	    private static long findWays(int n) {
	        
	        long[] dp = new long[3];
	        // Initialize base cases
	        dp[0] = 1;
	        dp[1] = 1;
	        dp[2] = 2;

	        for (int i = 2; i <= n; i++) {
	            
	            long temp0 = (dp[0] + dp[1] + dp[2]) % MOD;
	            long temp1 = dp[0];
	            long temp2 = dp[1] * 2 % MOD;
	   
	            dp[0] = temp0;
	            dp[1] = temp1;
	            dp[2] = temp2;
	        }

	        return (dp[0] + dp[1] + dp[2]) % MOD;
	    }

}
