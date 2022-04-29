package leet;

/**
 * 区域和检索，数组不可变
 * @author 123
 *
 */
public class Leet303 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		System.out.println( obj.sumRange(0, 2));
		System.out.println( obj.sumRange(2, 5));
		System.out.println( obj.sumRange(0, 5));
	}

}

class NumArray {
	int [] nums;
	int [] sum;
    public NumArray(int[] nums) {
    	this.nums = nums;
    	int n  = nums.length;
    	this.sum = new int[n+1];
    	for(int i=1;i<=n;i++) {
    		//初始化前缀和
    		sum[i] = sum[i-1] + nums[i-1];
    	}
    }
    
    public int sumRange(int left, int right) {
    	
    	//下标从1开始
    	return sum[right+1] - sum[left];
    }
}