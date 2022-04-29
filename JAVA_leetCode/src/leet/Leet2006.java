package leet;

import java.util.HashMap;

public class Leet2006 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {1,3};
		int k = 3;
		System.out.println(countKDifference1(nums, k));
	}
	
	public	static int countKDifference(int[] nums, int k) {
		int ans = 0;
		int n = nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(Math.abs(nums[i] - nums[j]) == k) ans++;
			}
		}
		
		return ans;
    }
	public	static int countKDifference1(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for(int num : nums) {
			if(map.containsKey(num+k)) {
				ans += map.get(num+k);
			}
			if(map.containsKey(num-k)) {
				ans += map.get(num-k);
			}
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		return ans;
	}
}
