/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0 || (x%10==0 && x!=0)) return false;
        int drome = 0;
        while( x > drome){
            drome = drome*10 + x%10;
            x /= 10;
        }
        return x == drome || x == drome/10;
    }
}
// @lc code=end

