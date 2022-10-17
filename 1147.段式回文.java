/*
 * @lc app=leetcode.cn id=1147 lang=java
 *
 * [1147] 段式回文
 */

// @lc code=start
class Solution {
    public int longestDecomposition(String text) {
        int n = text.length();
        if(n <= 1) return n;
        int index = 1;
        while(index*2 <= n){
            String prefix = text.substring(0, index);
            String suffix = text.substring(n-index,n);
            if(prefix.equals(suffix)){
                return 2 + longestDecomposition(text.substring(index, n-index));
            }
            index += 1;
        }
        return 1;
    }
}
// @lc code=end

