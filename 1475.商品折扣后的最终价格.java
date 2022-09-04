import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1475 lang=java
 *
 * [1475] 商品折扣后的最终价格
 */

// @lc code=start
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];

        // for(int i=0;i<n;i++){
        //     int k = 0;
        //     for(int j=i+1;j<n && k == 0;j++){
        //         if(prices[i] >= prices[j]){
        //             k = prices[j];
        //         }
        //     }
        //     ans[i] = prices[i] - k;
        // }


        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int idx = stack.pop();
                ans[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
            ans[i] = prices[i];
        }


        return ans;
    }
}
// @lc code=end

