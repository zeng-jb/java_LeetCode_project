package leet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Leet2039 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][]edges = {{0,1},{1,2}};
		int [] patience = {0,2,1};
		System.out.println(networkBecomesIdle(edges, patience));
	}

	
	public static int networkBecomesIdle(int[][] edges, int[] patience) {
		int n = patience.length;
		//无向图邻接矩阵
		List<Integer>[] adj = new List[n];
		for(int i=0;i<n;i++) {
			adj[i] = new ArrayList<>();
		}
		boolean visited[] = new boolean[n];
		
		//初始化无向图
		for(int[] v : edges) {
			adj[v[0]].add(v[1]);
			adj[v[1]].add(v[0]);
		}
		
		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);
		visited[0] = true;
		int dist = 1;
		int ans = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				int curr = q.poll();
				for(int v : adj[curr]) {
					if(visited[v]) continue;
					
					q.add(v);
					//最后一次收到回复的时间
					int time = patience[v] * ((2*dist - 1)/patience[v]) + 2*dist +1;
					ans = Math.max(ans, time);
					
					visited[v] = true;
					
				}
			}
			dist++;
		}
		return ans;
    }
}
