import java.lang.invoke.ClassSpecializer.Factory;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long ans = 0;
        
        while(x != 0){
            ans = ans*10 + x%10;
            x /= 10;
        }
        
        return (int)ans==ans ? (int)ans : 0;
    }
}
// @lc code=end

