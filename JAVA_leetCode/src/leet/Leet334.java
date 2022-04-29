package leet;

public class Leet334 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {1,2,3,4,5};
		System.out.println(increasingTriplet(nums));
	}

	public static boolean increasingTriplet(int[] nums) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			int e = nums[i];
			/*
			 * a是三元组序列最小的一个数
			 * b是次小的数
			 * 让a保证最小，b保证次小
			 * 如果存在比b大的数，说明存在三元组序列
			 */
			if(e<=a) {
				a=e;
			}else if(e<=b){
				b=e;
			}else {
				return true;
			}
			
		}
		
		return false;
    }
}
