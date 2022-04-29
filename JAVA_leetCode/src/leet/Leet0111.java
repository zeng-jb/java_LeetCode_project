package leet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import leet.Leet1609.TreeNode;

public class Leet0111 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//����BFS�ҳ���������С���
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
					//Ҷ�ӽ��
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
