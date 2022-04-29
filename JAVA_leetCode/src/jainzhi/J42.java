package jainzhi;

public class J42 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	/**
	 * dp求最大区间和
	 * @param nums
	 * @return
	 */
	public static int maxSubArray(int[] nums) {
		int n  = nums.length;
		int dp[] = new int[n];
		dp[0] = nums[0];
		int max = nums[0];
		
		for(int i=1;i<n;i++) {
			//当前的dp[i]取决前面的dp[i-1]，如果加入nums[i]会比本身要大则赋值给dp[i],dp[i]就是一个区间的和
			dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
			max = Math.max(max, dp[i]);
		}
		
		return max;
    }
}
