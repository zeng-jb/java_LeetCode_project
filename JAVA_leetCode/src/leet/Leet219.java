package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leet219 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int []nums = {1,2,3,1,2,3};
//		int  k = 2;
		int[]nums = {1,2,3,1};
		int k = 3;
		System.out.println(containsNearbyDuplicate1(nums, k));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int size = nums.length;
		if(size<k) return false;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<size;i++) {
			if(map.containsKey(nums[i])) {
				if(i - map.get(nums[i]) <= k) {
					return true;
				}
			}
			
			map.put(nums[i], i);
		}
		
		return false;
    }

	public static boolean containsNearbyDuplicate1(int[] nums, int k) {
		int size = nums.length;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<size;i++) {
			if(i>k) {
				set.remove(nums[i-k-1]);
			}
			
			if(!set.add(nums[i])){
				return true;
			}
		}
		
		return false;
    }
}
