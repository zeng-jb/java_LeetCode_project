/*
 * @lc app=leetcode.cn id=921 lang=java
 *
 * [921] 使括号有效的最少添加
 */

// @lc code=start
class Solution {
    public int minAddToMakeValid(String s) {
        int l = 0,r= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }else{
                if(l!=0) l--;
                else r++;
            }
        }

        return l+r;
    }
}
// @lc code=end

