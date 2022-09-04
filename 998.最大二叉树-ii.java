/*
 * @lc app=leetcode.cn id=998 lang=java
 *
 * [998] 最大二叉树 II
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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        // if(root == null){
        //     return new TreeNode(val);
        // }

        // if(root.val < val){
        //     return new TreeNode(val, root, null);
        // }

        // root.right = insertIntoMaxTree(root.right, val);
        // return root;


        TreeNode node  = new TreeNode(val);
        TreeNode prev = null, cur = root;
        // 向右找出节点值刚好小于val的节点
        while(cur != null && cur.val > val){
            prev = cur;
            cur = cur.right;
        }
        // 如果没有，则说明val最大，作为根节点
        if(prev == null){
            node.left = root;
            return node;
        }else{
            prev.right = node;
            node.left = cur;
            return root;
        }
    }
}
// @lc code=end

