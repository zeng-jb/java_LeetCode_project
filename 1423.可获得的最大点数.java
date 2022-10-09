import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1423 lang=java
 *
 * [1423] 可获得的最大点数
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = Arrays.stream(cardPoints).sum();
        if(n == k) return sum;
        int curSum = 0;
        int max = 0;
        int left = 0, right = 0;
        while(right < n){
            curSum += cardPoints[right++];

            if(right-left >= n-k){
                max = Math.max(max, sum-curSum);
                curSum -= cardPoints[left++];
            }
        }

        return max;
    }
}
// @lc code=end

