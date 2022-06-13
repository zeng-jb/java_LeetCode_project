/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return true;

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str.append(c);
            }
        }

        return str.toString().equals(str.reverse().toString());
    }
}
// @lc code=end

