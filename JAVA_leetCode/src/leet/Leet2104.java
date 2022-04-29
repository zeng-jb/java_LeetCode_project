package leet;

public class Leet2104 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int nums[] = {4,-2,-3,4,1};
		System.out.println(subArrayRanges(nums));
	}

	public static long subArrayRanges(int[] nums) {
		int n = nums.length;
		long sum = 0;
		for(int i=0;i<n-1;i++) {
			int min = nums[i];
			int max = nums[i];
			for(int j=i+1;j<n;j++) {
				min = Math.min(min, nums[j]);
				max = Math.max(max, nums[j]);
				
				sum += (max - min);
			}
		}
		return sum;
    }
}
