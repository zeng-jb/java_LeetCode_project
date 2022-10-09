/*
 * @lc app=leetcode.cn id=1784 lang=java
 *
 * [1784] 检查二进制字符串字段
 */

// @lc code=start
class Solution {
    public boolean checkOnesSegment(String s) {
        String[] str = s.split("0");

        return str.length == 1;
    }
}
// @lc code=end

