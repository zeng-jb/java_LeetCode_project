package leet;

public class Leet509 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 10;
		System.out.println(fib(n));
	}
	//斐波那契数列
	//递归版本，容易超时
	public static int fib0(int n) {
		if(n==1 || n==2) return 1;
		return fib(n-1)+fib(n-2);
    }
	//递归带备忘录的版本，
	public static int fib1(int n) {
		int [] memo = new int[n+1];
		return helper(memo,n);
	}
	
	private static int helper(int[] memo, int n) {
		// TODO 自动生成的方法存根
		if(n < 2) return n;
		//如果已经计算过了，直接放回
		if(memo[n] != 0) return memo[n];
		memo[n] = helper(memo, n-1) + helper(memo, n-2);
		return memo[n];
	}
	//动态规划版本，dp
	public static int fib2(int n) {
		if(n < 2) return n;
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	//动态规划版本，迭代变量
	public static int fib(int n) {
		if(n < 2) return n;
		int f0 = 0;
		int f1 = 1;
		while(--n > 0) {
			int temp = f1 + f0;
			f0 = f1;
			f1 = temp;
		}
		return f1;
	}
}
