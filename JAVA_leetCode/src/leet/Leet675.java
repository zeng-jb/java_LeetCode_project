package leet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Leet675 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		List<List<Integer>> forest =  Arrays.asList( {{1,2,3},{0,0,4},{7,6,5}} );
		Leet675 obj = new Leet675();
		System.out.println(obj.cutOffTree(null));
	}

	int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	public int cutOffTree(List<List<Integer>> forest) {
		//初始化高度大于1的树，并排序
		List<int[]> trees = new ArrayList<>();
		int row = forest.size();
		int col = forest.get(0).size();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(forest.get(i).get(j) > 1) {
					trees.add(new int[] {i,j});
				}
			}
		}
		Collections.sort(trees, (a,b) -> forest.get(a[0]).get(a[1]) - forest.get(b[0]).get(b[1]));
		
		//计算相邻高度的树的最小距离
		int cx = 0;
		int cy = 0;
		int ans = 0;
		for(int i=0;i<trees.size();i++) {
			int step = bfs(forest, cx, cy, trees.get(i)[0], trees.get(i)[1]);
			if(step == -1) {
				return -1;
			}
			ans += step;
			cx = trees.get(i)[0];
			cy = trees.get(i)[1];
		}
		return ans;
    }
	private int bfs(List<List<Integer>> forest, int sx, int sy, int tx, int ty) {
		// TODO 自动生成的方法存根
		if(sx == tx && sy == ty) {			
			return 0;
		}
		
		int row = forest.size();
		int col = forest.get(0).size();
		int step = 0;
		Queue<int[]> queue = new ArrayDeque<>();
		boolean[][] visited = new boolean[row][col];
		//初始化原点
		queue.add(new int[] {sx,sy});
		visited[sx][sy] = true;
		
		while(!queue.isEmpty()) {
			step++;
            int sz = queue.size();
            for (int i = 0; i < sz; ++i) {
                int[] cell = queue.poll();
                int cx = cell[0], cy = cell[1];
                for (int j = 0; j < 4; ++j) {
                    int nx = cx + dirs[j][0];
                    int ny = cy + dirs[j][1];
                    if (nx >= 0 && nx < row && ny >= 0 && ny < col) {
                        if (!visited[nx][ny] && forest.get(nx).get(ny) > 0) {
                            if (nx == tx && ny == ty) {
                                return step;
                            }
                            queue.offer(new int[]{nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
		}
		return -1;
	}	
}
