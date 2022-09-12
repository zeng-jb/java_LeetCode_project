import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 */
public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /* 
    int target = 0;
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        preOrder(root);
        return count;
    }

    public void preOrder(TreeNode root){
        if(root == null) return;
        dfs(root,0);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void dfs(TreeNode root, int sum){
        if(root == null) return;
        int temp = sum;
        sum += root.val;
        if(temp>0 && root.val>0 && sum<0)sum = -sum; // 防止最后一样例 [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]' + '0
        if(sum  == target) count++;
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    */
    public int pathSum(TreeNode root, int targetSum) {
        // 前缀和
        Map<Long,Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root,prefix,0L,targetSum);
    }

    public int dfs(TreeNode root, Map<Long,Integer> prefix, long curr, int targetSum){
        if(root == null) return 0;

        int ret = 0;
        curr += root.val;

        ret = prefix.getOrDefault(curr-targetSum, 0);
        prefix.put(curr, prefix.getOrDefault(curr, 0)+1);
        ret += dfs(root.left, prefix, curr, targetSum);
        ret += dfs(root.right, prefix, curr, targetSum);
        prefix.put(curr, prefix.getOrDefault(curr, 0)-1);

        return ret;
    }
}
// @lc code=end

