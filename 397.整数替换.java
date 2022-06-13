/*
 * @lc app=leetcode.cn id=397 lang=java
 *
 * [397] 整数替换
 */

// @lc code=start
class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        long N = n;
        while(N > 1){
            //如果是偶数，直接右移一位
            if((N & 1) == 0){
                N >>= 1;
            }
            //如果是奇数，且后面连续两个11 （3） 且n不为3，那就加1，否则-1
            else if((N & 3) == 3  && N != 3){
                N += 1;
            }else{
                N -= 1;
            }
            count++;
        }
        return count;
    }
}
// @lc code=end

