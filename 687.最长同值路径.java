/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
    public int maxL = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        getMaxL(root,root.val);
        return maxL;
    }
    public int getMaxL(TreeNode root, int val){
        if(root == null) return 0;
        int left = getMaxL(root.left, root.val);
        int right = getMaxL(root.right, root.val);

        maxL = Math.max(maxL, left + right);
        if(root.val == val){
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}
// @lc code=end

