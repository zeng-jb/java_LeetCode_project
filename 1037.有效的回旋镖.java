/*
 * @lc app=leetcode.cn id=1037 lang=java
 *
 * [1037] 有效的回旋镖
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        //S=1/2[(x1y2-x2y1)+(x2y3-x3y2)+(x3y1-x1y3)],
        return  (  (points[0][0]*points[1][1] - points[1][0]*points[0][1] )
                + (points[1][0]*points[2][1] - points[2][0]*points[1][1] )
                + (points[2][0]*points[0][1] - points[0][0]*points[2][1] )
                ) != 0;
    }
}
// @lc code=end

