/**
 * 
 */
package mainc;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1255 {

	/**
	 * @param args
	 */
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = scanner.nextInt();
		int ans = dp(n);
		
		System.out.println(ans);
	}

	public static int dp(int n) {
		int ans=0;
		int []a = new int [405];
		int[][] dp = new int[405][405];
		
		for (int i = 1; i <= n; ++i)
	    {
	        a[i] = scanner.nextInt();
	        a[i+n] = a[i];
	    }
	    for (int len = 2; len <= n; ++len)
	        for (int i = 1; i + len - 1 <= 2*n; ++i)
	        {
	            int j = i + len - 1;
	            for (int k = i; k < j; ++k)
	                dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k+1][j] + a[i] * a[k+1] * a[j+1]);
	        }
	    for (int i = 1; i <= n; ++i)
	        ans = Math.max(ans, dp[i][i+n-1]);
	    
	    return ans;
	}

}
