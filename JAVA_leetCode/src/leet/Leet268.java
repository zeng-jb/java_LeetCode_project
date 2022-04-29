package leet;

public class Leet268 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber1(int[] nums) {
		int n = nums.length;
		//���0��n��ǰn���
		int Sn1 = (1+n)*n/2;
		//nums�����ǰn���
		int Sn2 = 0;
		
		for(int i=0;i<n;i++) {
			Sn2 += nums[i];
		}
		//���ڱ�֤ÿ����Ψһ�����������Ȼ���Ǹ���������
		return Sn1-Sn2;
    }
	
	public static int missingNumber(int[] nums) {
		//���������� 0 ^ 4 = 4 ; 4 ^ 4 = 0;��������0Ϊ������������ͬ��������Ϊ0
		int res = 0;
		int n = nums.length;
		for(int i=0;i<=n;i++) {
			res ^= i;
		}
		for(int i=0;i<n;i++) {
			res ^= nums[i];
		}
		
		return res;
	}
}
