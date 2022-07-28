import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* 
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
        */
        int n = s.length();
        int left = 0;
        int ret = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            ret = Math.max(ret, i-left+1);
        }
        return ret;
    }
}
// @lc code=end

