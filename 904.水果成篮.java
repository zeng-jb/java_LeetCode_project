/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0;
        int ln = fruits[left] , rn = fruits[right];
        int ans = 0;
        while(right < fruits.length){
            if(fruits[right] == ln || fruits[right] == rn){
                ans = Math.max(ans, right-left+1);
                right++;
            }else{
                left = right-1;
                ln = fruits[left];
                while(left>=1 && fruits[left-1] == ln) left--;
                rn = fruits[right];
                ans = Math.max(ans, right-left+1);
            }
        }

        return ans;
    }
}
// @lc code=end

