package jainzhi;



public class J14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 211;
		System.out.println(cuttingRope1(n));
	}
	
	public static int cuttingRope(int n) {
		if(n==2) return 1;
		if(n==3) return 2;
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for(int i=4;i<=n;i++) {
			int maxValue = 0;
			for(int j=1;j<=i/2;j++) {
				int num = (dp[j])*(dp[i-j]);
				maxValue = Math.max(maxValue, num);
			}
			dp[i] = maxValue;
			
		}
		return dp[n];
    }
	public static int cuttingRope1(int n) {
		long sum = 1;
		if(n==1 || n==2) return 1;
		if(n==3) return 2;
		while(n>4) {
			sum *= 3;
			sum %= 1000000007;
			n -= 3;
		}
		return (int)(sum*n%1000000007);
	}
}
