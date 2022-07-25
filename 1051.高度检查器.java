import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1051 lang=java
 *
 * [1051] 高度检查器
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101];

        for(int height : heights){
            arr[height]++;
        }
        int count = 0;
        for(int i=0,j=0;i<arr.length;i++){
            while(arr[i]-- > 0){
                if(heights[j++] != i){
                    count++;
                }
            }
        }
        return count;
    }
}
// @lc code=end

