/*
 * @lc app=leetcode.cn id=672 lang=java
 *
 * [672] 灯泡开关 Ⅱ
 */

// @lc code=start
class Solution {
    public int flipLights(int n, int presses) {
        if(presses == 0) return 1;
        if(n == 1) return 2;
        if(n == 2) return presses == 1 ? 3 : 4;
        return presses > 2 ? 8 : (presses == 1) ? 4 : 7;
    }
}
// @lc code=end

