import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ret = 0;
        int len = s.length();
        if(len == 0) return 0;

        while(end < len){
            for(int i=start; i<end;i++){
                if(s.charAt(i) == s.charAt(end)){
                    ret = Math.max(ret,  end - start);
                    start = i + 1;
                }
            }
            end++;
        }
        return Math.max(ret, end - start);
    }
}
// @lc code=end

