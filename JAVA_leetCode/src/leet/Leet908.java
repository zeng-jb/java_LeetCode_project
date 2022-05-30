package leet;

import java.util.Arrays;

public class Leet908 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1,3 , 6};
		int k = 3;
		Leet908 obj = new Leet908();
		System.out.println(obj.smallestRangeI(nums, k));
	}

	 public int smallestRangeI(int[] nums, int k) {
//		 Arrays.sort(nums);
//		 int ans = nums[nums.length-1] - nums[0] - 2*k;
		 int max = nums[0];
		 int min = nums[0];
		 for(int num : nums) {
			 if(num > max) max = num;
			 if(num < min) min = num;
		 }
		 int ans = max - min - 2*k;
		 return ans > 0 ?  ans : 0; 
	 }
}
