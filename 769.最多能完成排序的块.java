import java.util.Stack;

/*
 * @lc app=leetcode.cn id=769 lang=java
 *
 * [769] 最多能完成排序的块
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int res = 0, max = 0;
        //当遍历到第i个位置时，如果可以切分为块，那前i个位置的最大值一定等于i。
        //否则，一定有比i小的数划分到后面的块，那块排序后，一定不满足升序。
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            if(max == i) res++;
        }
        return res;
    }
}
// @lc code=end

