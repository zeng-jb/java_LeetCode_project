import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    long min = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        // return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);

        /*
        //递归版中序遍历
        if(root == null) return true;
        //访问左志书
        if(!isValidBST(root.left)){
            return false;
        }
        //访问当前节点
        if(root.val <= min){
            return false;
        }
        min = root.val;
        //访问柚子树
        return isValidBST(root.right);
        */

        //非递归版的中序遍历
        Deque<TreeNode> stack = new LinkedList();

        while(!stack.isEmpty() || root != null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= min){
                return false;
            }
            min = root.val;
            root = root.right;
        }
        return true;

    }

    public boolean dfs(TreeNode root, long min,long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}
// @lc code=end

