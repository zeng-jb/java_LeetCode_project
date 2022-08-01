/*
 * @lc app=leetcode.cn id=1374 lang=java
 *
 * [1374] 生成每种字符都是奇数个的字符串
 */

// @lc code=start
class Solution {
    public String generateTheString(int n) {
        if(n % 2 == 0){
            return  "a".repeat(n-1) + "b";
        }else{
            return "a".repeat(n);
        }
    }
}
// @lc code=end

