import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1561 lang=java
 *
 * [1561] 你可以获得的最大硬币数目
 */

// @lc code=start
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        for(int i=piles.length/3;i<piles.length;i+=2){
            sum += piles[i];
        }

        return sum;
    }
}
// @lc code=end

