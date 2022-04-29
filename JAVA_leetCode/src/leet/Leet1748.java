package leet;

import java.util.HashMap;
import java.util.Map;

public class Leet1748 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {1,2,3,4,5};
		System.out.println(sumOfUnique(nums));
	}
	
	public static int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int sum = 0;
		for(int key : map.keySet()) {
			if(map.get(key) == 1) {
				sum += key;
			}
		}
		return sum;
    }
}
