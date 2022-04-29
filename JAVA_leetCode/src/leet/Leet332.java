package leet;

import java.util.Arrays;

public class Leet332 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []coins = {1, 2, 5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}

	//递归版本，容易超时哦
	public static int coinChange0(int[] coins, int amount) {
		if(amount == 0) return 0;
		if(amount < 0) return -1;
		int res = Integer.MAX_VALUE;
		for(int coin : coins) {
			int sub = coinChange(coins, amount-coin);
			if(sub < 0) continue;
			res = Math.min(res, sub+1);
		}
		
		return res == Integer.MAX_VALUE ? -1 : res;
    }
	
	//带备忘录的递归的版本
	public static int coinChange1(int[] coins, int amount) {
		 int [] memo =new int [amount+1];
		
		Arrays.fill(memo, -666);
		
		return dp(coins,amount,memo);
		
	}

	private static int dp(int[] coins, int amount , int[] memo) {
		// TODO 自动生成的方法存根
		if(amount == 0) return 0;
		if(amount < 0) return -1;
		int res = Integer.MAX_VALUE;
		if(memo[amount] != -666) return memo[amount];
		for(int coin : coins) {
			int sub = coinChange(coins, amount-coin);
			if(sub < 0) continue;
			res = Math.min(res, sub+1);
		}
		memo[amount] = res == Integer.MAX_VALUE ? -1 : res;
		return memo[amount];
	}
	
	public static int coinChange(int[] coins, int amount) {
		int [] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		
		for(int i=0;i<dp.length;i++) {
			for(int coin : coins) {
				if(i-coin < 0) continue;
				
				dp[i] = Math.min(dp[i], dp[i-coin]+1);
			}
		}
		return dp[amount] == amount+1 ? -1 : dp[amount];
	}
}
