/*
 * @lc app=leetcode.cn id=395 lang=java
 *
 * [395] 至少有 K 个重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int longestSubstring(String s, int k) {
        int len = s.length();
        int[] arr  = new int[26];
        for(int i=0;i<len;i++){
            arr[s.charAt(i) - 'a'] ++;
        }
        for(int i=0;i<len;i++){
            if(arr[s.charAt(i) - 'a'] < k){
                int l = longestSubstring(s.substring(0, i), k);
                int r = longestSubstring(s.substring(i+1, len), k);
                return Math.max(l, r);
            }
        }
        return len;
    }
}
// @lc code=end

