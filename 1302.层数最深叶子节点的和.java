import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=1302 lang=java
 *
 * [1302] 层数最深叶子节点的和
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
    int maxDepth = -1;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        DFS(root, 0);
        return sum;
    }


    public void DFS(TreeNode root,int depth){
        if(root == null) return;
        if(depth > maxDepth){
            maxDepth = depth;
            sum = root.val;
        }else if(depth == maxDepth){
            sum += root.val;
        }

        DFS(root.left, depth+1);
        DFS(root.right, depth+1);
    }

    public int BFS(TreeNode root){
        if(root == null) return 0;
        int ans = 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ans = 0;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                ans += temp.val;
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
        }


        return ans;
    }

    public int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
// @lc code=end

