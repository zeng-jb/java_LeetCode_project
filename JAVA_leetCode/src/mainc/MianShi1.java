package mainc;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MianShi1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[][]isWater = {{0,1},{0,0}};
//		int[][] isWater = {{0,0,1},{1,0,0},{0,0,0}};
//		System.out.println(highestPeak(isWater));
		
		int[] nums = {1,2,3,3,4,4,5,6};
		int k = 4;
		System.out.println(isPossibleDivide(nums, k));
		
	}

	static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
	public static int[][] highestPeak(int[][] isWater) {
		if(isWater == null || isWater.length == 0) return new int[0][0];
		int m = isWater.length ,n = isWater[0].length;
		int [][] res = new int[m][n];
		boolean vis[][] = new boolean[m][n];
		Deque<int[]> q = new ArrayDeque<>();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(isWater[i][j] == 1) {
					vis[i][j] = true;
					q.add(new int[] {i,j});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int [] temp = q.poll();
			for(int[] dir : dirs) {
				int x = temp[0] + dir[0];
				int y = temp[1] + dir[1];
				if(x<0 || x>=m || y<0 || y>=n || vis[x][y]) continue;
				res[x][y] = res[temp[0]][temp[1]] + 1;
				vis[x][y] = true;
				q.add(new int[] {x,y});
			}
		}
		
		return res;
    }
	
	
	public static boolean isPossibleDivide(int[] nums, int k) {
		int n = nums.length;
		if(n % k != 0) return false;
		
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(nums);
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int num : nums) {
			if(!map.containsKey(num)) continue;
			for(int i=0;i<k;i++) {
				if(!map.containsKey(num+i)) return false;
				map.put(num+i, map.get(num+i)-1);
				if(map.get(num+i) == 0) map.remove(num+i);
			}
		}
		return true;
    }
	
	
	
	static Map<Integer, Employee> map = new HashMap<>();
	public static int getImportance(List<Employee> employees, int id) {
  
        for(Employee e : employees) {
        		map.put(e.id, e);
        }
  
        return dfs(id);
    }

	public static int dfs(int id) {
		Employee e =  map.get(id);
		int sum = e.importance;
		List<Integer> subIntegers = e.subordinates;
		
		for(int sub : subIntegers) {
			sum += dfs(sub);
		}
		
		return sum;
	}

}



class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
