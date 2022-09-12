import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=857 lang=java
 *
 * [857] 雇佣 K 名工人的最低成本
 */

// @lc code=start
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        // 保存每个员工的性价比和工作质量，并按性价比升序排序
        double[][] workers = new double[n][2];
        for(int i=0;i<n;i++){
            workers[i] = new double[]{(double)wage[i]/quality[i], (double)quality[i]};
        }
        Arrays.sort(workers,(a,b)->Double.compare(a[0], b[0]));

        // 最小工资和
        double res = Double.MAX_VALUE;
        // 员工质量和
        int qsum = 0;

        // 最小堆，当存负数变成了最大堆
        PriorityQueue<Double> pq = new PriorityQueue<>();

        for(double[] worker :workers){
            qsum += worker[1];
            pq.add(-worker[1]);
            if(pq.size() > k){
                qsum += pq.poll();
            }
            if(pq.size() == k){
                // 员工质量和乘当前员工的性价比
                res = Math.min(res, qsum*worker[0]);
            }
        }
        return res;
    }
}
// @lc code=end

