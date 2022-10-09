import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=2244 lang=java
 *
 * [2244] 完成所有任务需要的最少轮数
 */

// @lc code=start
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int task : tasks){
            map.put(task, map.getOrDefault(task, 0)+1);
        }

        int sum = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1){
                return -1;
            }

            int mod = value%3;
            if(mod == 0){
                sum += value/3;
            }else{
                sum += value/3 +1;
            }
        }
        return sum;
    }
}
// @lc code=end

