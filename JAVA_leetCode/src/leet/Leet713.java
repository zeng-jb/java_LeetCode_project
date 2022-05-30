package leet;

public class Leet713 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {10,5,2,6};
		int k = 100;
		Leet713 obj = new Leet713();
		System.out.println(obj.numSubarrayProductLessThanK(nums, k));
	}
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int ret = 0;
		for(int i=0,j=0,p=1;i<nums.length;i++) {
			p *= nums[i];
			while(j<i && p>=k) p /= nums[j++];
			ret += i-j+1;
		}
		return ret;
    }
}
