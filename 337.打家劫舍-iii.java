import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    public int rob(TreeNode root) {
        // 抢劫该点和该点左子树的左右子树，右子树的左右子树
        // 抢劫该点的左右子树
        // if(root ==  null) return 0;
        // int val = 0;

        // if(root.left != null) val += rob(root.left.left) + rob(root.left.right);
        // if(root.right != null) val += rob(root.right.left) + rob(root.right.right);

        // return Math.max(rob(root.left) + rob(root.right), val + root.val);

        //dp动态规划
        // res[0] 抢劫该点
        // res[1] 不抢劫该点
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    public int[] helper(TreeNode root){
        if(root == null){
            return new int[2];
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int[] res = new int[2];
        
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);//计算不抢劫当前根节点可获得的最大金额(那么其左右子树可以随便抢)
        res[1] = root.val + left[0] + right[0];//计算若抢劫根节点可获得的最大金额(此时,其左右子树的根节点不能被抢)
        return res;
    }

}
// @lc code=end

