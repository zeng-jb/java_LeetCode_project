import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        int level = 1;
        if(root != null){
            q.offer(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> temp = new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode t = q.poll();
                    temp.add(t.val);
                    if(t.left != null) q.offer(t.left);
                    if(t.right != null) q.offer(t.right);
                }
                if(level%2 == 0){
                    // 是偶数层反转一下
                    Collections.reverse(temp);
                }
                level++;
                res.add(temp);
            }
        }

        return res;
    }
}
// @lc code=end

