import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=623 lang=java
 *
 * [623] 在二叉树中增加一行
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 0 || depth == 1){
            TreeNode t = new TreeNode(val);
            if(depth == 1){
                // 左子树
                t.left = root;
            }else{
                t.right = root;
            }
            return t;
        }

        if(root != null && depth > 1){
            root.left = addOneRow(root.left, val, depth > 2 ? depth-1 : 1);
            root.right = addOneRow(root.right, val, depth > 2 ? depth-1 : 0);

        }
        return root;
    }
}
// @lc code=end

