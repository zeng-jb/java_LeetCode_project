package leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leet448 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers1(nums));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> dnums = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		for (int i=1;i<=nums.length;i++) {
			if(!set.contains(i)) {
				dnums.add(i);
			}
		}
		
		
		return dnums;
    }
	
	public static List<Integer> findDisappearedNumbers1(int[] nums) {
		List<Integer> dnums = new ArrayList<>();
		
		for (int i=0;i<nums.length;i++) {
			if(nums[Math.abs(nums[i])-1] > 0) {
				nums[Math.abs(nums[i])-1] = 0-nums[Math.abs(nums[i])-1];
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				dnums.add(i+1);
			}
		}
		
		return dnums;
    }
}
