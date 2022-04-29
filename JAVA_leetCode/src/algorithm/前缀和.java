package algorithm;

import java.util.Scanner;

public class 前缀和 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	/**
	 * 暴力解法求区间和
	 * @param nums
	 * @param m
	 * @return
	 */
	public static void countSum(int []nums,int m) {	
		while(m-- > 0) {
			int l,r;
			int sum = 0;
			l = scanner.nextInt();
			r = scanner.nextInt();
			for(int i=l;i<=r;i++) {
				sum += nums[i];
			}
			System.out.println(sum);
		}
	}
	
	/**
	 * 利用前缀和求区间和
	 * @param nums
	 * @param m
	 */
	public static void countSum1(int []nums,int m) {	
		int n = nums.length;
		int sum[] = new int[n+1];
		//前缀和初始化
		for(int i=1;i<=n;i++) {
			sum[i] = sum[i-1] + nums[i-1];
		}
		
		while(m-- > 0) {
			int l,r;
			l = scanner.nextInt();
			r = scanner.nextInt();
			System.out.println(sum[r] - sum[l-1]);
		}
	}
	
	/**
	 * 二维的数组利用前缀和求区间
	 * @param nums
	 * @param q
	 */
	public static void countSum2(int [][]nums,int q) {
		int m = nums.length;
		int n = nums[0].length;
		int sum[][] = new int[m+1][n+1];
		//前缀和初始化
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + nums[i-1][j-1];
			}
		}
		
		while(q-->0) {
			int x1,y1,x2,y2;
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			System.out.println(sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1]);
		}
	}
}
