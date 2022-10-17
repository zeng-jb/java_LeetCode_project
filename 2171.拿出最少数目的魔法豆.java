import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2171 lang=java
 *
 * [2171] 拿出最少数目的魔法豆
 */

// @lc code=start
class Solution {
    public long minimumRemoval(int[] beans) {
        // 先排序，假设当前位置为基准，那么前面的豆子都要为0，后面的豆子都为这个数
        // 所以要知道前缀和，后缀和
        int n = beans.length;
        Arrays.sort(beans);
         // 不能用stream求和，会超范围
        // long total = Arrays.stream(beans).sum();
        long total = 0L;
        for(int bean : beans) total += bean;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        long res = Long.MAX_VALUE;

        // 求出前缀和
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+beans[i-1];
        }
        // 求出后缀和
        for(int i=0;i<n;i++){
            suffix[i] = total - prefix[i] - (n-i)*(long)beans[i];
            // 前后相加，保留最小值
            res = Math.min(res, prefix[i]+suffix[i]);
        }
        
        return res;
    }
}
// @lc code=end

