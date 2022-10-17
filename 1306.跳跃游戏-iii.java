import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1306 lang=java
 *
 * [1306] 跳跃游戏 III
 */

// @lc code=start
class Solution {
    public boolean canReach(int[] arr, int start) {
        // return dfs(arr,start);
        return bfs(arr,start);

    }

    public boolean dfs(int[] arr, int start){
        if(start < 0 || start >= arr.length || arr[start] == -1) return false;
        if(arr[start] == 0) return true;
        int step = arr[start];
        arr[start] = -1;
        return dfs(arr, start+step) || dfs(arr, start-step);
    }

    public boolean bfs(int[] arr, int start){
        if(arr[start] == 0) return true;
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int step = q.poll();
            if((step + arr[step]) < n && !visited[step + arr[step]]){
                if(arr[step+arr[step]] == 0){
                    return true;
                }
                q.add(step+arr[step]);
                visited[step+arr[step]] = true;
            }
            if((step - arr[step]) >= 0 && !visited[step - arr[step]]){
                if(arr[step-arr[step]] == 0){
                    return true;
                }
                q.add(step-arr[step]);
                visited[step-arr[step]] = true;
            }
        }

        return false;
    }
}
// @lc code=end

