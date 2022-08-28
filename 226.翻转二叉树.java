import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {
        // 前序遍历
        // if(root == null) return null;
        // TreeNode rightTree = root.right;
        // root.right = root.left;
        // root.left = rightTree;
        // invertTree(root.left);
        // invertTree(root.right);
        // return root;

        //中序遍历
        // if(root == null) return null;
        // invertTree(root.left);
        // TreeNode rightTree = root.right;
        // root.right = root.left;
        // root.left = rightTree;
        // // 注意右子树遍历
        // invertTree(rightTree);
        // return root;

        // 后序遍历
        // if(root == null) return null;
        // invertTree(root.left);
        // invertTree(root.right);
        // TreeNode rightTree = root.right;
        // root.right = root.left;
        // root.left = rightTree;
        // return root;

        // 层序遍历
         if(root == null) return null;
         Deque<TreeNode> q = new ArrayDeque<>();
         q.offer(root);
         while(!q.isEmpty()){
            TreeNode temp = q.poll();
            TreeNode rightTree = temp.right;
            temp.right = temp.left;
            temp.left = rightTree;
            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
         }
         return root;
    }
}
// @lc code=end

