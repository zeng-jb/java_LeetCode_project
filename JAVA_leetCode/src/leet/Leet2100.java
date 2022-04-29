package leet;

import java.util.ArrayList;

import java.util.List;

public class Leet2100 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] security = {5,3,3,3,5,6,2};
		int time = 2;
		System.out.println(goodDaysToRobBank(security, time));
	}

	
	public static List<Integer> goodDaysToRobBank1(int[] security, int time) {
		List<Integer>  ans = new ArrayList<>();
		
		int n = security.length;
		int[] left = new int[n];
		int[] right = new int[n];
		if(n <= time*2) return ans;
		for(int i=1;i<n;i++) {
			if(security[i] <= security[i-1]) {
				left[i] = left[i-1] + 1;
			}
		}
		for(int i=n-2;i>=0;i--) {
			if(security[i] <= security[i+1]) {
				right[i] = right[i+1] + 1;
			}
		}
		for(int i=0;i<n;i++) {
			if(left[i] >= time && right[i] >= time) {
				ans.add(i);
			}
		}
		
		return ans;
    }
	/**
	 * 前缀和的思想
	 * @param security
	 * @param time
	 * @return
	 */
	public static List<Integer> goodDaysToRobBank(int[] security, int time) {
		List<Integer> ans = new ArrayList<>();
		int n = security.length;
		int g[] = new int[n];
		for(int i=1;i<n;i++) {
			//如果相等则为0；大于的为1，小于为-1；
			if(security[i] == security[i-1])continue;
			g[i] = (security[i] > security[i-1]) ? 1 : -1;
		}
		
		//a记录为g为1的前缀和，b记录-1
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		
		for(int i=1;i<=n;i++) a[i] = a[i-1] + (g[i-1] == 1 ? 1 : 0);
		for(int i=1;i<=n;i++) b[i] = b[i-1] + (g[i-1] == -1 ? 1 : 0);
		
		for(int i=time;i<n-time;i++) {
			int c1 = a[i+1] - a[i+1-time];
			int c2 = b[i+1+time] - b[i+1];
			if(c1==0 && c2==0) ans.add(i);
		}
		
		return ans;
	}
}
