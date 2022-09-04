import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=646 lang=java
 *
 * [646] 最长数对链
 */

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        int count = 1;
        Arrays.sort(pairs, (a,b)->a[1]-b[1]);
        int tmp = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > tmp){
                count++;
                tmp = pairs[i][1];
            }
        }
        return count;
    }
}
// @lc code=end

