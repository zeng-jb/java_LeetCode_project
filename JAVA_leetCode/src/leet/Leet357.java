package leet;

public class Leet357 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 3;
		Leet357 obj = new Leet357();
		System.out.println(obj.countNumbersWithUniqueDigits(n));
	}

	//数学方法，f(k) = 9*9*8***(9-k+2);
	public int countNumbersWithUniqueDigits1(int n) {
		int sum = 0;
		if(n == 0) return 1;
		while(n > 0) {
			sum += f(n);
			n--;
		}
		
		return sum;
    }

	private int f(int k) {
		// TODO 自动生成的方法存根
		if(k==1) return 10;
		int count = 9;
		int index = 9;
		int end = 9 - k + 2;
		while(index >= end) {
			count *= index;
			index--;
		}
		return count;
	}
	//动态规划
	public int countNumbersWithUniqueDigits(int n) {
		if(n==0) return 1;
		int []dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 10;
		for(int i=2;i<=n;i++) {
			//当前位数的不同数字等于前一位的不同数字和+待计算的当前为数和，例如 dp[3] = 739 = 91 + (91-10)*(10-3+1）
			dp[i] = dp[i-1] + (dp[i-1] - dp[i-2])*(10-i+1);
		}
		return dp[n];
	}
}
