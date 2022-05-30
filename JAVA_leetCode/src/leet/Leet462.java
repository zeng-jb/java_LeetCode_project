package leet;

import java.util.Arrays;

public class Leet462 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1,9};
		Leet462 obj = new Leet462();
		System.out.println(obj.minMoves2(nums));
	}

	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		
		int i = 0;
		int j = nums.length-1;
		int sum = 0;
		while(i < j) {
			sum += nums[j--] - nums[i++];
		}
		return sum;
    }
}
