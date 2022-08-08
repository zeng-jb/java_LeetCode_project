import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int len = intervals.length;
        int i = 0;
        while(i < len){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i < len-1 && right >= intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{left,right});
            i++;
        }


        return list.toArray(new int[list.size()][2]);

    }
}
// @lc code=end

