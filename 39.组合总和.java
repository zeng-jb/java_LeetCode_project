import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    public void backTrack(int[] candidates, int target, int start, ArrayList<Integer> tempList){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            tempList.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i, tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}
// @lc code=end

