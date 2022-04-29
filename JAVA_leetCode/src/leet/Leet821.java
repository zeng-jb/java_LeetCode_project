package leet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leet821 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "loveleetcode";
		char c = 'e';
		Leet821 obj = new Leet821();
		System.out.println(obj.shortestToChar(s, c));
	}

	public int[] shortestToChar1(String s, char c) {
		int n = s.length();
		int[] ans = new int[n];
		Arrays.fill(ans, n+1);
		//从左往右遍历一次，找出离c最近的右边距离
		for(int i=0,j=-1;i<n;i++) {
			if(s.charAt(i) == c) j = i;
			if(j != -1) ans[i] = i-j;
		}
		//后往前遍历一次，找出左边最小距离
		for(int i=n-1,j=-1;i>=0;i--) {
			if(s.charAt(i) == c) j = i;
			if(j != -1) ans[i] = Math.min(ans[i], j - i);
		}
		return ans;
    }
	
	//BFS
	public int[] shortestToChar(String s, char c) {
		int n = s.length();
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == c) {
				ans[i] = 0;
				q.addLast(i);
			}
		}
		int[]dict = new int[]{-1,1};
		while(!q.isEmpty()) {
			int t = q.pollFirst();
			for(int dic : dict) {
				int ne = t + dic;
				if(ne >= 0 && ne < n && ans[ne] == -1) {
					ans[ne] = ans[t] + 1;
					q.addLast(ne);
				}
			}
		}
		return ans;
	}
}
