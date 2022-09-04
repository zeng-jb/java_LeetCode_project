import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import javafx.print.PrintQuality;

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // topk，小根堆实现，保持k个元素在堆中，如果元素比栈顶小则抛弃，超过k个弹出栈顶
        // 用map统计计数
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Map.Entry<Integer,Integer>> entryset =  map.entrySet();

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> enrty : entryset){
            pq.add(enrty);
            if(pq.size() >k){
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
// @lc code=end

