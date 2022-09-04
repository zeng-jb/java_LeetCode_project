import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
 */

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxTree(nums,0,nums.length-1);
    }

    public TreeNode maxTree(int[] nums, int l, int r){
        if(l > r){
            return null;
        }

        int bond = getMaxIntdex(nums,l,r);
        TreeNode root = new TreeNode(nums[bond]);
        root.left = maxTree(nums, l, bond-1);
        root.right = maxTree(nums, bond+1, r);
        return root;

    }

    public int getMaxIntdex(int[] nums,int l, int r){
        int max = Integer.MIN_VALUE;
        int maxIntdex = 0;
        for(int i=l;i<=r;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIntdex = i;
            }
        }
        return maxIntdex;
    }
}
// @lc code=end

