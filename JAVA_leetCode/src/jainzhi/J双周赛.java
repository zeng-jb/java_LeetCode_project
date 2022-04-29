package jainzhi;

import java.util.Arrays;

public class J双周赛 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 4009;
		System.out.println(minimumSum(num));
//		int []nums = {9,12,5,10,14,3,10};
//		int pivot = 10;
		int []nums = {-3,4,3,2};int  pivot = 2;
		System.out.println(pivotArray(nums, pivot));
	}
	
	public static int minimumSum(int num) {
        int [] nums = new int[4];
		
        for(int i=0;i<4;i++) {
        	nums[i] = num%10;
        	num /= 10;
        }
        
        Arrays.sort(nums);
        
        int num1 = nums[0]*10+nums[2];
        int num2 = nums[1]*10+nums[3];
        return num1+num2;
    }
	
	public static int[] pivotArray(int[] nums, int pivot) {
		int n = nums.length;
		int [] arraynums = new int[n];
		boolean []vis = new boolean[n];
		int index = 0;
		for(int i=0;i<n;i++) {
			if(nums[i] < pivot && !vis[i]) {
				arraynums[index++] = nums[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(nums[i] == pivot && !vis[i]) {
				arraynums[index++] = nums[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(nums[i] > pivot && !vis[i]) {
				arraynums[index++] = nums[i];
			}
		}
		
		return arraynums;
    }
}
