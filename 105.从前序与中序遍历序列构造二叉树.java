import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        for(int i=0;i<len;i++){
            // 保存中序的索引
            map.put(inorder[i], i);
        }

        return myBuildTree(preorder,inorder,0,len-1,0,len-1);
    }

    public TreeNode myBuildTree(int[] preorder,int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right){
        if(preorder_left > preorder_right) return null;

        int preorder_root = preorder_left;

        int inorder_root = map.get(preorder[preorder_root]);

        TreeNode root = new TreeNode(preorder[preorder_root]);

        int size_subTree_left = inorder_root - inorder_left;

        root.left = myBuildTree(preorder, inorder, preorder_left+1, preorder_left+size_subTree_left, inorder_left, inorder_root-1);

        root.right = myBuildTree(preorder, inorder, preorder_left+size_subTree_left+1, preorder_right, inorder_root+1, inorder_right);

        return root;
    }
}
// @lc code=end

