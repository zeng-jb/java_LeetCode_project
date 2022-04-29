package leet;

import java.util.Random;

public class Leet398 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] {1,2,3,3,3};
		Solution398 solution = new Solution398(nums);
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(0));

	}

}

class Solution398 {
	int [] arr;
    public Solution398(int[] nums) {
    	arr = nums;
    }
    
    public int pick(int target) {
    	int index = 0;
    	int count = 0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == target) {
    			count++;
    			int res = new Random().nextInt(count);
    			if(res == 0) {
    				index = i;
    			}
    		}
    	}
    	return index;
    }
}