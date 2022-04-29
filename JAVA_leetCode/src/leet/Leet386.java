package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet386 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 13;
		Leet386 obj = new Leet386();
		System.out.println(obj.lexicalOrder(n));
	}

	List<Integer> list = new ArrayList<>();
	public List<Integer> lexicalOrder1(int n) {
		for(int i=1;i<=9;i++) {
			dfs(i,n);
		}
		return list;
    }

	private void dfs(int cur, int limit) {
		// TODO 自动生成的方法存根
		if(cur > limit) return;
		list.add(cur);
		for(int i=0;i<=9;i++) {
			dfs(cur*10+i, limit);
		}
	}
	
	public List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=0,j=1;i<n;i++) {
			list.add(j);
			if(j*10 <= n) {
				j = j*10;
			}else {
				while(j % 10 == 9 || j+1 > n) j /= 10;
				j++;
			}
		}
		
		return list;
    }
}
