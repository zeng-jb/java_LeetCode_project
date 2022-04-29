package leet;

import java.util.Arrays;

public class Leet747 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {3,6,1,0};
		System.out.println(dominantIndex(nums));
	}
	public static int dominantIndex(int[] nums) {
		int ans = -1;
		int maxf = Integer.MIN_VALUE;
		int maxs = Integer.MIN_VALUE;
		int size = nums.length;
		
		for(int i=0;i<size;i++) {
			int e = nums[i];
			if(e>maxf) {
				maxs = maxf;
				maxf = e;
				ans = i;
			}else if(e>maxs) {
				maxs = e;
			}
		}
		
		return maxf>= (maxs*2) ? ans:-1;
    }

}
