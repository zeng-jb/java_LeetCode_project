package leet;

public class Leet2016 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[]nums = {7,1,5,4};
		int[] nums = {1,5,2,10};
		System.out.println(maximumDifference(nums));
	}

	public static int maximumDifference(int[] nums) {
		int ans = -1;
		int n = nums.length;
		int pre = nums[0];
		
		for(int i=1;i<n;i++) {
			if(nums[i] > pre) {
				ans = Math.max(ans, nums[i]-pre);
			}else {
				pre = nums[i];
			}
		}
		
		return ans;
    }
}
