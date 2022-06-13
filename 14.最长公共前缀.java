/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String s = strs[0];
        for(String string : strs){
            while(!string.startsWith(s)){
                if(s.length() == 0) return "";
                s = s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
// @lc code=end

