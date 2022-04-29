package jainzhi;

public class J42 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	/**
	 * dp����������
	 * @param nums
	 * @return
	 */
	public static int maxSubArray(int[] nums) {
		int n  = nums.length;
		int dp[] = new int[n];
		dp[0] = nums[0];
		int max = nums[0];
		
		for(int i=1;i<n;i++) {
			//��ǰ��dp[i]ȡ��ǰ���dp[i-1]���������nums[i]��ȱ���Ҫ����ֵ��dp[i],dp[i]����һ������ĺ�
			dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
			max = Math.max(max, dp[i]);
		}
		
		return max;
    }
}
