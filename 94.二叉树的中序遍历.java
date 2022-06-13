import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //inorder(root);
        Stack<TreeNode> q = new Stack<>();
        while(!q.isEmpty() || root != null){
            while(root != null){
                q.push(root);
                root = root.left;
            }
            root = q.pop();
            list.add(root.val);
            root = root.right;

        }

        return list;
    }
    // public void inorder(TreeNode root){
    //     if(root == null) return ;
    //     inorder(root.left);
    //     list.add(root.val);
    //     inorder(root.right);
    // }
}
// @lc code=end

