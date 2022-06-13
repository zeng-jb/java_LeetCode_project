/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        /*
        if(root == null) return true;
        int leftlen = getDepth(root.left);
        int rightlen = getDepth(root.right);
        if(Math.abs(leftlen - rightlen) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        */
        return height(root) >= 0;
    }
    public int getDepth(TreeNode root){
        if(root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left, right) + 1;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh >= 0 && rh >= 0 && Math.abs(lh - rh) <= 1){
            return Math.max(lh, rh) + 1;
        }else{
            return -1;
        }
    }
}
// @lc code=end

