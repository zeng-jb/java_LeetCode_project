package leet;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Leet433 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String start = "AAAAACCC", end = "AACCCCCC";
		String[] bank = {"AAAACCCC","AAACCCCC","AACCCCCC"};
		Leet433 obj = new Leet433();
		System.out.println(obj.minMutation1(start, end, bank));
	}

	//BFS
	public int minMutation(String start, String end, String[] bank) {
		Set<String> cnt = new HashSet<>();
		Set<String> visited = new HashSet<>();
		char[] keys = {'A','C','G','T'};
		for(String string : bank) {
			cnt.add(string);
		}
		if(start.equals(end)) {
			return 0;
		}
		if(!cnt.contains(end)) {
			return -1;
		}
		
		Queue<String> q = new ArrayDeque<>();
		q.add(start);
		visited.add(start);
		int step = 1;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				String curr = q.poll();
				for(int j=0;j<curr.length();j++) {
					for(int k=0;k<keys.length;k++) {
						if(curr.charAt(j) != keys[k]) {
							StringBuilder sb = new StringBuilder(curr);
							sb.setCharAt(j, keys[k]);
							String next = sb.toString();
							if(cnt.contains(next) && !visited.contains(next)) {
								if(next.equals(end)) {
									return step;
								}
								visited.add(next);
								q.offer(next);
							}
						}
					}
				}
			}
			step++;
		}
		
		return -1;
    }
	
	//DFS
	Set<String> part = new HashSet<>();
	Integer minStep = Integer.MAX_VALUE;
	public int minMutation1(String start, String end, String[] bank) {
		if(start.equals(end)) return 0;
		
		boolean flag = false;
		
		for(String str : bank) 
			if(str.equals(end))	flag = true;
		
		if(!flag) return -1;
		
		dfs(start,end,bank,0);
		
		return minStep == Integer.MAX_VALUE ? -1 : minStep;
	}

	private void dfs(String start, String end, String[] bank, int step) {
		// TODO 自动生成的方法存根
		if(start.equals(end)) {
			minStep = Math.min(step, minStep);
			return ;
		}
		
		for(String str : bank) {
			int diff = 0;
			for(int i=0;i<str.length();i++) {
				if(start.charAt(i) != str.charAt(i)) {
					diff++;
				}
			}
			
			if(diff != 1 || part.contains(str)) {
				continue;
			}
			
			part.add(str);
			step++;
			dfs(str, end, bank, step);
			step--;
			part.remove(str);
		}
	}
}
