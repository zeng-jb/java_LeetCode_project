package leet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import leet.Leet1609.TreeNode;

public class Leet0111 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//利用BFS找出二叉树最小深度
	public int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		Deque<TreeNode> q = new ArrayDeque<>();
		int depth = 1;
		
		q.addLast(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode temp = q.poll();
				if(temp.left == null && temp.right == null) {
					//叶子结点
					return depth;
				}
				if(temp.left != null) {
					q.addLast(temp.left);
				}
				if(temp.right != null) {
					q.addLast(temp.right);
				}
			}
			depth++;
		}
		return depth;
    }
}
