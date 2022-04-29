package leet;

/**
 * ����ͼ��������鲻�ɱ�
 * @author 123
 *
 */
public class Leet303 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
    		//��ʼ��ǰ׺��
    		sum[i] = sum[i-1] + nums[i-1];
    	}
    }
    
    public int sumRange(int left, int right) {
    	
    	//�±��1��ʼ
    	return sum[right+1] - sum[left];
    }
}