package leet;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Leet1036 {
	static final int N = 1000000;
	static final int [][]dict = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][]blocked = {{0,1},{1,0}};
		int []source = {0,0}, target = {0,2};
		System.out.println(isEscapePossible(blocked, source, target));
	}

	public static boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
		
		return bfs(blocked, source, target) && bfs(blocked, target, source);
    }
	
	public static boolean bfs(int[][] blocked, int[] source, int[] target) {
		Set<Integer> visited = new HashSet<>();	//标记已访问的格子,因为迷宫是10^6*10^6，因此我们将x*1000000+y，避免重复
		for (int[] b : blocked) {
			visited.add(b[0]*N+b[1]);
		}
		visited.add(source[0]*N+source[1]);	//将起始坐标加入访问set
		
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(source);//加入访问
		while(!q.isEmpty()) {
			int size = q.size();
			if(size>blocked.length) return true;	//代表已经包不住了；
			while(--size>=0) {
				int []term = q.poll();
				//往四个方向广搜
				for (int[] dic : dict) {
					int x = term[0]+dic[0] , y = term[1]+dic[1];
					if(x<0||x>=N||y<0||y>=N) continue;
					if(x == target[0] && y == target[1]) return true;
					if(visited.add(x*N+y)) q.offer(new int[] {x,y});
				}
			}
		}
		return false;
	}
}
