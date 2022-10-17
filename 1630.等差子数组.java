import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1630 lang=java
 *
 * [1630] 等差子数组
 */

// @lc code=start
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        int n = nums.length;
        int m = l.length;

        for(int i=0;i<m;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                temp.add(nums[j]);
            }
            temp.sort((a,b)->a-b);
            if(check(temp)){
                res.add(true);
            }else{
                res.add(false);
            }
        }


        return res;
    }

    public boolean check(List<Integer> temp){
        int x = temp.get(1) - temp.get(0);
        for(int i=1;i<temp.size();i++){
            if(temp.get(i)-temp.get(i-1) != x){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

