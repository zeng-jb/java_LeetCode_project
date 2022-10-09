/*
 * @lc app=leetcode.cn id=856 lang=java
 *
 * [856] 括号的分数
 */

// @lc code=start
class Solution {
    public int scoreOfParentheses(String s) {
        int ans = 0, deep = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                deep++;
            }else{
                deep--;
            }
            if(i > 0 && s.charAt(i) == ')' && s.charAt(i-1) == '(') ans += 1 << deep;
        }

        return ans;
    }
}
// @lc code=end

