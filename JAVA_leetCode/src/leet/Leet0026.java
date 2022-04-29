package leet;

public class Leet0026 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {0,0,1,1,1,2,2,3,3,4};
		Leet0026 obj = new Leet0026();
		System.out.println(obj.removeDuplicates(nums));
	}

	//删除数组的重复元素
	public int removeDuplicates(int[] nums) {
		int fast = 1;
		int slow = 0;
		while(fast <= nums.length-1) {
			if(nums[slow] == nums[fast]) {
				fast++;
			}else {
				slow++;
				nums[slow] = nums[fast];
				fast++;
			}
			/*
			if(nums[slow] != nums[fast]) {
				nums[++slow] = nums[fast];
			}
			fast++;
			*/
		}
		
		return slow+1;
    }
}
