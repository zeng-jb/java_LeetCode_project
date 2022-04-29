package jainzhi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J39 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int nums [] = {3,3,4};
//		System.out.println(majorityElement(nums));
		int []arr = {3,2,1};
		int k = 2;
		System.out.println(getLeastNumbers(arr, k));
	}

	/*
	 * 建立hash表
	 */
	public static int majorityElement1(int[] nums) {
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int ans = 0;
		for(int key : map.keySet()) {
			if(map.get(key) >= (len+1)/2) {
				ans = key;
			}
		}
		return ans;
    }
	
	/*
	 * 排序取中位数
	 */
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	/*
	 * 投票法，极限一换一，
	 */
	public static int majorityElement(int[] nums) {
		int ans = 0, count =0;
		
		for(int i=0;i<nums.length;i++) {
			if(count == 0) {
				ans = nums[i];
				count++;
			}else {
				if(ans == nums[i]) count++;
				else count--;
//				ans == nums[i] ? count++ : count--;
			}
		}
		return ans;
	}
	
	
	
	//J40
	public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
        	ans[i] = arr[i];
        }
        return ans;
    }
}
