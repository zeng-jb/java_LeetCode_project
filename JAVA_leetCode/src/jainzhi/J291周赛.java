package jainzhi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class J291周赛 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[]nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
		System.out.println(sortEvenOdd(nums));
	}
	
	public static int[] sortEvenOdd(int[] nums) {
		if(nums.length<=2) return nums;
		
		int n = nums.length;
		int jishu[] = new int [n/2];
		int oushu[];
		if(n%2==0) {
			 oushu = new int [n/2];			
		}else {
			oushu = new int [n/2 +1];
		}
		
		int jiindex = 0, ouindex =0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				oushu[ouindex++] = nums[i];
			}else {
				jishu[jiindex++] = nums[i];
			}
		}
		
		Arrays.sort(oushu);
		Arrays.sort(jishu);
		jiindex = jishu.length;
		ouindex = 0;
		int numsarray[] = new int[n];
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				numsarray[i] = oushu[ouindex++];
			}else {
				numsarray[i] = jishu[--jiindex];
			}
		}
		
		return numsarray;
    }
	
	
}
