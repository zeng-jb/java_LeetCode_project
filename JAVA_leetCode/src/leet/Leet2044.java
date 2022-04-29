package leet;

import java.util.Arrays;
import java.util.stream.Stream;

public class Leet2044 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Leet2044 obj = new Leet2044();
		int []nums = {3,2,1,5};
		System.out.println(obj.countMaxOrSubsets(nums));
	}

	int max = 0;
	public int countMaxOrSubsets0(int[] nums) {
		//ͨ������ʽ��ȡ��λ������ֵ����������Ԫ�ذ�λ��������ֵ
		max = Arrays.stream(nums).reduce(0, (t0,t1) -> t0 | t1);
		
		return dfs(nums,0,0);
    }
	private int dfs(int[] nums, int index, int value) {
		// TODO �Զ����ɵķ������
		if(index == nums.length) {
			return value == max ? 1 : 0;
		}
		//����ѡ�кͲ�ѡ�������������
		return dfs(nums, index+1, value | nums[index]) + dfs(nums, index+1, value);
	}
	
	//״̬ѹ������
	public int countMaxOrSubsets(int[] nums) {
		int max = Arrays.stream(nums).reduce(0, (t0,t1)->t0|t1);
		int res = 0;
		int count = (int) Math.pow(2, nums.length);
		
		for(int i=1;i<count;i++) {
			int temp = 0;
			for(int j=0;j<nums.length;j++) {
				if((i & (1<<j)) != 0) {
					//˵��j��ѡ��
					temp |= nums[j];
				}
			}
			if(temp == max) {
				res++;
			}
		}
		
		return res;
	}
}
