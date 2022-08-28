/*
 * @lc app=leetcode.cn id=793 lang=java
 *
 * [793] 阶乘函数后 K 个零
 */

// @lc code=start
class Solution {
    public int preimageSizeFZF(int k) {
        int start = 1;
        while(start < k){
            start = start*5 + 1;
        }
        while(start > 1){
            if(start-1 == k){
                return 0;
            }

            start = (start-1)/5;

            k %= start;
        }

        return 5;
    }
}
// @lc code=end

