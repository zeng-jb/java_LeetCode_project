/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        // int i = 1;
        // for(;i <= x/i ; i++){

        // }
        // return i - 1;
        int left = 0;
        int right = x;
        while(left < right){
            int mid = left + (right - left) / 2 + 1;
            if(mid > x/mid) right = mid - 1;
            else left = mid;
        }
        return left;
    }
}
// @lc code=end

