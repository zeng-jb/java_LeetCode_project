package leet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet310 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 6;
		int[][] edges = {{3,0},{3,1},{3,2},{3,4},{5,4}};
		Leet310 obj = new Leet310();
		System.out.println(obj.findMinHeightTrees(n, edges));
	}

	
	private boolean[][] graph;
	private boolean[] visited;
	private int[] d;	//图的出度
	private Queue<Integer> q;
	public List<Integer> findMinHeightTrees1(int n, int[][] edges) {
		graph = new boolean[n][n];
		visited = new boolean[n];
		d = new int[n];
		q = new LinkedList();
		//初始化图
		for(int[] edge : edges) {
			graph[edge[0]][edge[1]] = true;
			graph[edge[1]][edge[0]] = true;
			d[edge[0]]++;
			d[edge[1]]++;
		}
		
		//去除外层结点
		while(n > 2) {
			//找出外层结点
			findOutter();
			while(!q.isEmpty()) {
				Integer v = q.poll();
				d[v]--;
				n--;
				visited[v] = true;
				//找出v的邻接结点
				for(int i=0;i<graph[v].length;i++) {
					if(graph[v][i]) {
						d[i]--;
						graph[v][i] = false;
						graph[i][v] = false;
					}
				}
			}
		}
		
		
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				ans.add(i);
			}
		}
		return ans;
    }
	private void findOutter() {
		// TODO 自动生成的方法存根
		for(int i=0;i<d.length;i++) {
			if(d[i] == 1) {
				q.add(i);
			}
		}
	}
	
	
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		List<Integer> ans = new ArrayList<>();
		if(n == 1) {
			ans.add(0);
			return ans;
		}
		
		int []degree = new int[n];
		List<List<Integer>> map = new ArrayList<>();
		for(int i=0;i<n;i++) {
			map.add(new ArrayList<>());
		}
		
		for(int [] edge : edges) {
			map.get(edge[0]).add(edge[1]);
			map.get(edge[1]).add(edge[0]);
			degree[edge[0]]++;
			degree[edge[1]]++;
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			if(degree[i] == 1) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			ans = new ArrayList<>();
			int size = q.size();
			for(int i=0;i<size;i++) {
				Integer cur = q.poll();
				ans.add(cur);
				
				List<Integer> neighbors = map.get(cur);
				for(Integer neighbor :neighbors) {
					degree[neighbor]--;
					if(degree[neighbor] == 1) {
						q.offer(neighbor);
					}
				}
			}
		}
		return ans;
	}
}
