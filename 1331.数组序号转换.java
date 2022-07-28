import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1331 lang=java
 *
 * [1331] 数组序号转换
 */

// @lc code=start
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0,j=1;i<arrCopy.length;i++){
            if(!map.containsKey(arrCopy[i])){
                map.put(arrCopy[i], j++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
// @lc code=end

