package leet;

public class Leet396 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {4,3,2,6};
		Leet396 obj = new Leet396();
		System.out.println(obj.maxRotateFunction(nums));
	}

	public int maxRotateFunction(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		int ans = 0;
		int sum = 0;
		for(int i=0;i<n;i++) {
			dp[0] += i*nums[i];
			sum += nums[i];
		}
		ans = dp[0];
		//f(i+1) - f(i) = suma - n*A[n-i-1];
		for(int i=1;i<n;i++) {
			dp[i] = dp[i-1] + sum - n*nums[n-i];
			ans = Math.max(ans, dp[i]);
		}
		return ans;
    }
}
