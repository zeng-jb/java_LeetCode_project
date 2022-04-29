package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Leet1791 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] edges = {{1,2},{2,3},{4,2}};
		System.out.println(findCenter1(edges));
	}

	public static int findCenter(int[][] edges) {
		return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
	
	public static int findCenter1(int[][] edges) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int[]edge :edges) {
			map.put(edge[0], map.getOrDefault(edge[0], 0)+1);
			map.put(edge[1], map.getOrDefault(edge[1], 0)+1);
		}
		int N = map.size();
		
		for(Integer key :  map.keySet()) {
			if(map.get(key) == N-1) return key;
		}
		
		
		return -1;
    }
}
