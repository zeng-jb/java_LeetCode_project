/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        // a^b 是无进制的相加  a&b可以把每位进制位， 两者递归直至&w为0
        int sum = a ^ b;
        // 注意进位1+1会进位，所以左移一个
        int carry = (a & b) << 1;

        if(carry != 0){
            return getSum(sum, carry);
        }

        return sum;
    }
}
// @lc code=end

