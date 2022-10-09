import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=797 lang=java
 *
 * [797] 所有可能的路径
 */

// @lc code=start
class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 所有路径都是从0开始
        path.add(0);
        dfs(graph,0);
        return result;

    }

    public void dfs(int[][] graph, int x){
        if(x == graph.length-1){
            // 如果x已经是终点了加入结果
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<graph[x].length;i++){
            // 加入该点
            path.add(graph[x][i]);
            // 递归
            dfs(graph, graph[x][i]);
            // 回溯
            path.remove(path.size()-1);
        }
    }
}
// @lc code=end

