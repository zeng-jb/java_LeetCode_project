package leet;

import java.util.HashMap;
import java.util.Map;

public class Leet1995 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] nums = {1,2,3,6};
//		int[] nums = {3,3,6,4,5};
		int[] nums = {1,1,1,3,5};
		System.out.println(countQuadruplets(nums));
	}
	
	public static int countQuadruplets1(int[] nums) {
		int ans = 0;
		int size = nums.length;
		for(int i = 0; i <size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k = j+1;k<size;k++) {
					for(int z = k+1;z<size;z++) {
						if(nums[i]+nums[j]+nums[k] == nums[z]) {
							ans++;
						}
					}
				}
			}
		}
		
		return ans;
    }

	public static int countQuadruplets(int[] nums) {
		int ans = 0;
		int size = nums.length;
		int []cnt = new int [305];
		
		for(int b = size-3;b>=1;b--) {
			int c = b+1;
			for(int d = c+1;d<size;d++) {
				cnt[nums[d]-nums[c] + 100]++;
			}
			for(int a = 0; a<b;a++) {
				ans+=cnt[nums[a]+nums[b] + 100];
			}
		}
		
		return ans;
    }
}
