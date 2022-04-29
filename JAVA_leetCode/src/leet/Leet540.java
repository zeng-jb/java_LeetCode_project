package leet;

public class Leet540 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums =  {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate1(nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		
		if(nums.length == 1) return nums[0];
		int n = nums.length ;
		int num = nums[n-1];
		for(int i=0;i<n-1;) {
			if(nums[i] == nums[i+1]) {
				i+=2;
			}else {
				num = nums[i];
				break;
			}
		}
		
		return num;
    }
	
	public static int singleNonDuplicate1(int[] nums) {
		int n = nums.length;
		int left = 0 , right = n-1 ;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(mid%2==1) mid--;
			if(nums[mid] == nums[mid+1]) {
				left = mid + 2;
			}else {
				right = mid;
			}
		}
		
		return nums[left];
		
    }
}
