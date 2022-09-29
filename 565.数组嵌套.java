/*
 * @lc app=leetcode.cn id=565 lang=java
 *
 * [565] 数组嵌套
 */

// @lc code=start
class Solution {
    public int arrayNesting(int[] nums) {
        int max = 1;
        // 标记已经访问的，说明不会出现最大环
        boolean[] visited = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(max > nums.length/2) return max;
            // 判断环
            if(visited[nums[i]]) continue;
            visited[nums[i]] = true;
            int curMax = 1;
            int cur = nums[nums[i]];
            while(cur != nums[i]){
                // 标记
                visited[cur] = true;
                curMax++;
                cur = nums[cur];
            }
            
            max = curMax > max? curMax : max;
        }
        return max;
    }
}
// @lc code=end

