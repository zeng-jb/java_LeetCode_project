/*
 * @lc app=leetcode.cn id=1422 lang=java
 *
 * [1422] 分割字符串的最大得分
 */

// @lc code=start
class Solution {
    public int maxScore(String s) {
        int num0 = 0, num1 = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                num0++;
            else
                num1++;
        }
        int count0 = 0, count1 = num1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else
                count1--;
            max = Math.max(max, count0 + count1);
        }
        return max;
    }
}
// @lc code=end

