package leet;

public class Leet1220 {
	public static final int Mod = 1000000007;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 5;
		System.out.println(countVowelPermutation(n));
	}

	public static int countVowelPermutation(int n) {
		long sum = 0;
		long [][] dp = new long[n+1][5];
		for(int i=0;i<5;i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2;i<=n;i++) {
			dp[i][0] = (dp[i-1][1]+dp[i-1][2]+dp[i-1][4])%Mod;
			dp[i][1] = (dp[i-1][0]+dp[i-1][2])%Mod;
			dp[i][2] = (dp[i-1][1]+dp[i-1][3])%Mod;
			dp[i][3] = (dp[i-1][2])%Mod;
			dp[i][4] = (dp[i-1][2]+dp[i-1][3])%Mod;
		}
		
		for(int i=0;i<5;i++) {
			sum = (sum+dp[n][i])%Mod;
		}
		
		return (int)sum;
    }
}
