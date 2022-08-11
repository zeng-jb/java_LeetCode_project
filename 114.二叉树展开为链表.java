import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        // 后序遍历
        // 保存右子树
        TreeNode temp = root.right;
        // 移动左子树，并置空左子树
        root.right = root.left;
        root.left = null;

        // 移动后右子树不为空，指针移动到右子树最后
        while(root.right != null) root = root.right;
        // 将暂存的右子树赋值
        root.right = temp;
    }

   
}
// @lc code=end

