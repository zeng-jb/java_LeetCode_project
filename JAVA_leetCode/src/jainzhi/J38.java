package jainzhi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class J38 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "aab";
		System.out.println(permutation(s));
	}

	static List<String> ans;
	static char[] c;
	public static String[] permutation1(String s) {
		ans = new ArrayList<>();
		c = s.toCharArray();
		dfs(0);
		
		return ans.toArray(new String[ans.size()]);
    }
	private static void dfs(int x) {
		// TODO 自动生成的方法存根
		if(x == c.length-1) {
			ans.add(String.valueOf(c));
			return ;
		}
		Set<Character> set = new HashSet<>();
		
		for(int i=x;i<c.length;i++) {
			if(set.contains(c[i])) continue;
			set.add(c[i]);
			swap(i,x);
			dfs(x+1);
			swap(x,i);
		}
	}
	private static void swap(int i, int x) {
		// TODO 自动生成的方法存根
		char temp = c[i];
		c[i] = c[x];
		c[x] = temp;
	}
	
	
	static Set<String> res;
	static int len;
	public static String[] permutation(String s) {
		len = s.length();
		res = new HashSet<>();
		char[] arr = s.toCharArray();
		boolean []visited = new boolean[len];
		dfs(arr,"",visited);
		return res.toArray(new String[res.size()]);
	}
	private static void dfs(char[] arr, String s, boolean[] visited) {
		// TODO 自动生成的方法存根
		if(s.length() == len) {
			res.add(s);
			return;
		}
		for(int i=0;i<len;i++) {
			if(visited[i]) continue;
			visited[i] = true;
			dfs(arr, s+arr[i], visited);
			visited[i] = false;
		}
	}
}
