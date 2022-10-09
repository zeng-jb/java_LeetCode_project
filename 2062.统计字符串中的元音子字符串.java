import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2062 lang=java
 *
 * [2062] 统计字符串中的元音子字符串
 */

// @lc code=start
class Solution {
    public int countVowelSubstrings(String word) {
        String s = "aeiou";
        int len = word.length();
        int count = 0;
        for(int i=0;i<len;i++){
            Set<Character> set = new HashSet<>();
            for(int j=i;j<len;j++){
                if(s.indexOf(word.charAt(j)) < 0){
                    break;
                }
                set.add(word.charAt(j));
                if(set.size() == 5){
                    count++;
                }
            }
        }

        return count;
    }
}
// @lc code=end

