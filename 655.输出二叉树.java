import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=655 lang=java
 *
 * [655] 输出二叉树
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
    List<List<String>> res;
    int height = 0;
    public List<List<String>> printTree(TreeNode root) {
        res = new ArrayList<>();
        height = getHeight(root) - 1;
        int m = height + 1;
        int n = (1 << (height+1)) - 1;

        for(int i=0;i<m;i++){
            List<String> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add("");
            }
            res.add(temp);
        }

        dfs(root,0,(n-1)/2);
        return res;

    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public void dfs(TreeNode root, int row, int col){
        if(root == null) return;
        res.get(row).set(col, Integer.toString(root.val));
        if(root.left != null) dfs(root.left, row+1, col-(1 << (height-row-1)));
        if(root.right != null) dfs(root.right, row+1, col+(1 << (height-row-1)));
    }

}
// @lc code=end

 