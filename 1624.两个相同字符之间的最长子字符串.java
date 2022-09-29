import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1624 lang=java
 *
 * [1624] 两个相同字符之间的最长子字符串
 */

// @lc code=start
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int[] pre = new int[26];
        int[] last = new int[26];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(pre[c-'a'] == 0){
                pre[c-'a'] = i+1;
            }
        }

        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(last[c-'a'] == 0){
                last[c-'a'] = i+1;
            }
        }

        int max = -1;
        for(int i=0;i<26;i++){
            max = Math.max(max, last[i]-pre[i]);
        }
        return max-1;
    }
}
// @lc code=end

