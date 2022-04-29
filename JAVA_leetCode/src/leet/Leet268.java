package leet;

public class Leet268 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber1(int[] nums) {
		int n = nums.length;
		//求出0到n的前n项和
		int Sn1 = (1+n)*n/2;
		//nums数组的前n项和
		int Sn2 = 0;
		
		for(int i=0;i<n;i++) {
			Sn2 += nums[i];
		}
		//由于保证每个数唯一，所以相减必然是那个不见的数
		return Sn1-Sn2;
    }
	
	public static int missingNumber(int[] nums) {
		//利用异或操作 0 ^ 4 = 4 ; 4 ^ 4 = 0;这个数异或0为本身，而两个相同的数异或就为0
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
