package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leet1001 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}
	
	static int[][] dirs = {{0,0},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}};
	public static int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
		long N = n;
		HashMap<Integer, Integer> row = new HashMap<>() , col = new HashMap<>();
		HashMap<Integer, Integer> left = new HashMap<>() , right = new HashMap<>();
		Set<Long> set = new HashSet<>();
		
		for(int []l : lamps) {
			int x = l[0] , y = l[1];
			int a = x+y , b = x-y;	//a为斜率-1的对角线，b为斜率1的对角线
			if(set.contains(x*N+y)) continue;
			increment(row, x); increment(col, y);
			increment(left, a); increment(right, b);
			set.add(x*N+y);
		}
		int m = queries.length;
		int [] ans = new int[m];
		for(int i=0;i<m; i++) {
			int [] q = queries[i];
			int x = q[0] , y = q[1];
			int a = x+y , b = x-y;
			if(row.containsKey(x) || col.containsKey(y) || left.containsKey(a) || right.containsKey(b)) ans[i] = 1;
			
			for(int[] dir : dirs) {
				int nx = x + dir[0] , ny = y + dir[1];
				int na = nx + ny , nb = nx - ny;
				if(nx<0 || nx>=n || ny<0|| ny>=n) continue;
				if(set.contains(nx*N+ny)) {
					set.remove(nx*N+ny);
					decrement(row, nx); decrement(col, ny);
					decrement(left, na); decrement(right, nb);
				}
			}
		}
		
		return ans;
	}
	
	static void increment(HashMap<Integer, Integer>map , int key) {
		map.put(key, map.getOrDefault(key, 0)+1);
	}
	static void decrement(HashMap<Integer, Integer>map , int key) {
		if(map.get(key) == 1) map.remove(key);
		else map.put(key, map.get(key)-1);
	}
}
