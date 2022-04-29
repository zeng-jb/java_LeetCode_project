package leet;

public class Leet334 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []nums = {1,2,3,4,5};
		System.out.println(increasingTriplet(nums));
	}

	public static boolean increasingTriplet(int[] nums) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			int e = nums[i];
			/*
			 * a����Ԫ��������С��һ����
			 * b�Ǵ�С����
			 * ��a��֤��С��b��֤��С
			 * ������ڱ�b�������˵��������Ԫ������
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
