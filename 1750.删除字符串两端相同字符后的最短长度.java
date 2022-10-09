/*
 * @lc app=leetcode.cn id=1750 lang=java
 *
 * [1750] 删除字符串两端相同字符后的最短长度
 */

// @lc code=start
class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0, j = n-1;

        while(i < j && s.charAt(i) == s.charAt(j)){
            char l = s.charAt(i), r = s.charAt(j);
            while(i < j && s.charAt(i) == l){
                i++;
            }
            while(i <= j && s.charAt(j) == r){
                j--;
            }
        }

        return j-i+1;
    }
}
// @lc code=end

