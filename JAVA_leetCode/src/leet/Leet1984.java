package leet;

import java.util.Arrays;

public class Leet1984 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {9,4,1,7};
		int k = 3;
		System.out.println(minimumDifference(nums, k));
	}
	
	public static int minimumDifference(int[] nums, int k) {
		int ans = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=0;i+k-1 < n;i++) {
			ans = Math.min(ans, nums[i+k-1] - nums[i]);
		}
		
		return ans;
    }
}
