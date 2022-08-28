import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
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
    int ans = 1;
    public int widthOfBinaryTree(TreeNode root) {
        // 设置当前节点编号为1
        // dfs(root,1,0);
        // return ans;

        // BFSv 层序遍历，记录每个节点的索引，当每层遍历完成后计算下一层的最大宽度(链表最后一个元素索引-链表的最前面元素索引+1)
        if(root == null) return 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        LinkedList<Integer> indexList = new LinkedList<>();
        q.offer(root);
        indexList.add(1);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                int index = indexList.removeFirst();
                if(temp.left != null){
                    q.offer(temp.left);
                    indexList.add(index << 1);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                    indexList.add(index << 1 | 1);
                }
            }
            if(indexList.size() >= 2){
                ans = Math.max(ans, indexList.getLast()-indexList.getFirst()+1);
            }
        }
        return ans;
    }

    public void dfs(TreeNode root, int u, int depth){
        if(root == null) return;
        if(!map.containsKey(depth)) map.put(depth, u);
        ans = Math.max(ans, u-map.get(depth)+1);
        // 左子树节点编号为2u，右子树为2u+1
        dfs(root.left, u << 1, depth+1);
        dfs(root.right, u << 1 | 1, depth+1);
    }
}
// @lc code=end

