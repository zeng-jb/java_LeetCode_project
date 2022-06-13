/*
 * @lc app=leetcode.cn id=926 lang=java
 *
 * [926] 将字符串翻转到单调递增
 */

// @lc code=start
class Solution {
    public int minFlipsMonoIncr(String s) {
        int zero = 0, one = 0;
        for(char c: s.toCharArray()){
            if(c == '0'){
                one = Math.min(zero, one) + 1;
            }else{
                one = Math.min(zero, one);
                zero++;
            }
        }
        return Math.min(zero, one);
    }
}
// @lc code=end

