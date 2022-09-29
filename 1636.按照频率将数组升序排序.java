import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            list.add(num);
        }

        list.sort((a,b)->{
            int counta = map.get(a);
            int countb = map.get(b);
            if(counta == countb){
                return b-a;
            }
            return counta-countb;
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

