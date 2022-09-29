/*
 * @lc app=leetcode.cn id=2309 lang=java
 *
 * [2309] 兼具大小写的最好英文字母
 */

// @lc code=start
class Solution {
    public String greatestLetter(String s) {
        int[] low = new int[26];
        int[] up = new int[26];

        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                low[c - 'a']++;
            }else{
                up[c - 'A']++;
            }
        }

        String res = "";
        for(int i=25;i>=0;i--){
            if(low[i] != 0 && up[i] != 0){
                res = (char)(i+'A') + "";
                break;
            }
        }
        return res;
    }
}
// @lc code=end

