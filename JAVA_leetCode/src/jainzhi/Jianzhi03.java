package jainzhi;

import java.util.HashSet;
import java.util.Set;

public class Jianzhi03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums  = {2, 3, 1, 0, 2, 5, 3};
		System.out.println(findRepeatNumber(nums));
	}

	public static int findRepeatNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			if(!set.contains(j)) {
				set.add(j);
			}else {
				return j;
			}
		}
		
		return 0;
    }
}
