package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet442 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {4,3,2,7,8,2,3,1};
		Leet442 obj = new Leet442();
		System.out.println(obj.findDuplicates(nums));
	}

	
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int num = Math.abs(nums[i]);
			if(nums[num-1] > 0) {
				nums[num-1] *= -1;
			}else {
				list.add(num);
			}
		}
		return list;
    }
}
