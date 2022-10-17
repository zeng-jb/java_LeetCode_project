import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2033 lang=java
 *
 * [2033] 获取单值网格的最小操作数
 */

// @lc code=start
class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] arr = new int[m*n];
        int i=0;
        for(int[] aa : grid){
            for(int a : aa){
                arr[i++] = a;
            }
        }
        Arrays.sort(arr);

        int j = arr[(m*n)/2];
        int sum = 0;
        for(i=0;i<m*n;i++){
            int l = Math.abs(j-arr[i]);
            if(l%x != 0) return -1;
            sum += l/x;
        }
        return sum;
    }
}
// @lc code=end

