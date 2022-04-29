package jainzhi;

public class J21 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[]nums = {1,11,14};
		System.out.println(exchange1(nums));
	}

	public static int[] exchange(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int j =0;
		for(int i=0;i<n;i++) {
			if(nums[i] % 2 == 1) {
				ans[j++] = nums[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(nums[i] % 2 == 0) {
				ans[j++] = nums[i];
			}
		}
		
		return ans;
    }
	//快排
	public static int[] exchange1(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			while(left<right && nums[left]%2!=0) left++;
			while(left<right && nums[right]%2==0) right--;
			if(left<right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
		}
		return nums;
	}
}
