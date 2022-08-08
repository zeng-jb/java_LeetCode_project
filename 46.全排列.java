import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backTrack(nums,visited,new ArrayList<>());
        return res;
    }

    public void backTrack(int[] nums, boolean[] visited, ArrayList<Integer> tempList){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                tempList.add(nums[i]);
                backTrack(nums, visited, tempList);
                visited[i] = false;
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
// @lc code=end

