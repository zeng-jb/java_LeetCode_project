/*
 * @lc app=leetcode.cn id=1450 lang=java
 *
 * [1450] 在既定时间做作业的学生人数
 */

// @lc code=start
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        // int n = startTime.length;
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     if(endTime[i] >= queryTime && startTime[i] <= queryTime){
        //         count++;
        //     }
        // }
        // return count;

        // 差分数组
        int n = startTime.length;
        int[] cha = new int[1010];
        for(int i=0;i<n;i++){
            // 
            cha[startTime[i]]++;
            cha[endTime[i] + 1]--;

        }
        for(int i=1;i<=queryTime;i++){
            cha[i] += cha[i-1];
        }
        return cha[queryTime];
    }
}
// @lc code=end

