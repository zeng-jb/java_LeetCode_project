package leet;

import java.util.Arrays;

public class Leet798 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums = {2,3,1,4,0};
		System.out.println(bestRotation(nums));
	}
	static int N = 10010;
	static int[] c = new int[N];
	public static int bestRotation(int[] nums) {
		int n = nums.length;
		Arrays.fill(c, 0);
		for(int i=0;i<n;i++) {
			//上下边界的确认
			int a = (i-(n-1)+n)%n;
			int b = (i-nums[i]+n)%n;
			if(a<=b) {
				add(a,b);
			}else {
				add(a,n-1);
				add(0,b);
			}
		}
		//差分数组前缀和
		for(int i=1;i<=n;i++) c[i] += c[i-1];
		
		int ans = 0, k = c[0];
		for(int i=1;i<=n;i++) {
			if(c[i] > k) {
				ans = i;
				k = c[i];
			}
		}
		return ans;
    }
	//差分数组函数，保证区间lr增加1而其他不变
	private static void add(int l, int r) {
		// TODO 自动生成的方法存根
		c[l] += 1; c[r+1] -= 1;
	}
}
