import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1944 lang=java
 *
 * [1944] 队列中可以看到的人数
 */

// @lc code=start
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]){
                ans[i]++;
                stack.pop();
            }
            stack.push(i);
            if(stack.size() > 1) ans[i]++;
        }

        return ans;
    }
}
// @lc code=end

