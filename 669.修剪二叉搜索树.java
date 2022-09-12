/*
 * @lc app=leetcode.cn id=669 lang=java
 *
 * [669] 修剪二叉搜索树
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // if(root == null) return null;

        // if(root.val < low){
        //     return trimBST(root.right, low, high);
        // }
        // if(root.val > high){
        //     return trimBST(root.left, low, high);
        // }

        // root.left = trimBST(root.left, low, high);
        // root.right = trimBST(root.right, low, high);

        // return root;



        while(root != null && (root.val < low || root.val > high )){
            root = root.val < low ? root.right : root.left;
        }

        TreeNode ans = root;
        while(root != null){
            while(root.left != null && root.left.val < low){
                root.left = root.left.right;
            }
            root = root.left;
        }
        root = ans;
        while(root != null){
            while(root.right != null && root.right.val > high){
                root.right = root.right.left;
            }
            root = root.right;
        }

        return ans;
    }
}
// @lc code=end

