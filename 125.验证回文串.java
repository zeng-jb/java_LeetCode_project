/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        /* 
        if(s == null) return true;

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str.append(c);
            }
        }

        return str.toString().equals(str.reverse().toString());
        */
        if(s.length() == 0) return true;
        s = s.toLowerCase();
        int n = s.length();
        for(int i=0,j=n-1;i<j;i++,j--){
            while(!Character.isLetterOrDigit(s.charAt(i)) && i < j) i++;
            while(!Character.isLetterOrDigit(s.charAt(j)) && i < j) j--;
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
// @lc code=end

