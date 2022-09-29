import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=986 lang=java
 *
 * [986] 区间列表的交集
 */

// @lc code=start
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int m = firstList.length;
        int n = secondList.length;
        int i = 0 , j = 0;
        // list 转二维数组--------List<int[]> list = new ArrayList<>();  list.toArray(new int[list.size()][]);
        List<int[]> list = new ArrayList<>();
        while(i < m && j < n){
            int left = Math.max(firstList[i][0], secondList[j][0]);
            int right = Math.min(firstList[i][1], secondList[j][1]);
            if(left <= right){
                list.add(new int[]{left,right});
            }
            if(firstList[i][1] > secondList[j][1]){
                j++;
            }else{
                i++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
// @lc code=end

