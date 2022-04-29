package leet;

import java.util.Arrays;
import java.util.stream.Stream;

public class Leet2044 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Leet2044 obj = new Leet2044();
		int []nums = {3,2,1,5};
		System.out.println(obj.countMaxOrSubsets(nums));
	}

	int max = 0;
	public int countMaxOrSubsets0(int[] nums) {
		//通过流方式获取按位或的最大值，数组所有元素按位或就是最大值
		max = Arrays.stream(nums).reduce(0, (t0,t1) -> t0 | t1);
		
		return dfs(nums,0,0);
    }
	private int dfs(int[] nums, int index, int value) {
		// TODO 自动生成的方法存根
		if(index == nums.length) {
			return value == max ? 1 : 0;
		}
		//返回选中和不选他的两种情况、
		return dfs(nums, index+1, value | nums[index]) + dfs(nums, index+1, value);
	}
	
	//状态压缩方法
	public int countMaxOrSubsets(int[] nums) {
		int max = Arrays.stream(nums).reduce(0, (t0,t1)->t0|t1);
		int res = 0;
		int count = (int) Math.pow(2, nums.length);
		
		for(int i=1;i<count;i++) {
			int temp = 0;
			for(int j=0;j<nums.length;j++) {
				if((i & (1<<j)) != 0) {
					//说明j被选中
					temp |= nums[j];
				}
			}
			if(temp == max) {
				res++;
			}
		}
		
		return res;
	}
}
