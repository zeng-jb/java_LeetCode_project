/*
 * @lc app=leetcode.cn id=1790 lang=java
 *
 * [1790] 仅执行一次字符串交换能否使两个字符串相等
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int m = -1, n = -1, count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(m == -1) m = i;
                if(n == -1 && m != i) n = i;
            }
        }

        if(count == 0) return true;
        if(count == 2 && s1.charAt(m) == s2.charAt(n) && s1.charAt(n) == s2.charAt(m)){
            return true;
        }
        return false;
    }
}
// @lc code=end

