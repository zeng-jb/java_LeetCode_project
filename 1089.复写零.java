import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1089 lang=java
 *
 * [1089] 复写零
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(arr[i] == 0) q.add(0);
            arr[i] = q.poll();
        }
    }
}
// @lc code=end

