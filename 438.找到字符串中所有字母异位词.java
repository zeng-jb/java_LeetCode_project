import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        // 记录p的字符个数
        int[] letters = new int[26];
        for(char c : p.toCharArray()) letters[c-'a']++;
        // 滑动窗口的字符个数
        int[] windows = new int[26];
        int left = 0;
        int right = 0;
        while(right < s.length()){
            windows[s.charAt(right) - 'a']++;
            if(right - left + 1 == p.length()){
                if(Arrays.equals(letters, windows)) ans.add(left);
                // 将滑动窗口左边的减去，然后left++
                windows[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return ans;
    }
}
// @lc code=end

