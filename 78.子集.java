import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        // res.add(new ArrayList<Integer>());
        // backTack(nums,0);
        backTack1(nums, 0, new ArrayList<Integer>());
        return res;
    }

    public void backTack(int[] nums, int index){
        if(index == nums.length) return;
        int size = res.size();
        for(int i=0;i<size;i++){
            ArrayList<Integer> temp = new ArrayList<>(res.get(i));
            temp.add(nums[index]);
            res.add(temp);
        }
        backTack(nums, index+1);
    }

    public void backTack1(int[] nums, int index, ArrayList<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backTack1(nums, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

