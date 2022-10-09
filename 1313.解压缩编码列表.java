import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1313 lang=java
 *
 * [1313] 解压缩编码列表
 */

// @lc code=start
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            while(freq-- > 0){
                list.add(val);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

