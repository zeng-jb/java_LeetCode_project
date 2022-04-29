package leet;

public class Leet905 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {0,2};
		Leet905 obj = new Leet905();
		System.out.println(obj.sortArrayByParity(nums));
	}

	public int[] sortArrayByParity(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		while(left < right) {
			while(nums[left] % 2 == 0 && left < right) left++;
			while(nums[right] % 2 == 1 && left < right) right--;
			if(left < right) {				
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
		}
		return nums;
    }
}
