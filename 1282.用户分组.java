import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1282 lang=java
 *
 * [1282] 用户分组
 */

// @lc code=start
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int num = groupSizes[i];
            if(map.containsKey(num)){
                map.get(num).add(i);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(num, temp);
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            int len = entry.getKey();
            List<Integer> value = entry.getValue();

            int count = value.size() / len;
            for(int i=0;i<count;i++){
                List<Integer> list = new ArrayList<>(len);
                for(int j=0;j<len;j++){
                    list.add(value.get(i*len+j));
                }
                res.add(list);
            }
        }

        return res;
    }
}
// @lc code=end

