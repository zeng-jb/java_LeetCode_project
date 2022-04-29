package leet;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leet0144 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//��������ǰ��������ݹ��
	List<Integer> res = new ArrayList<>();
	public List<Integer> preorderTraversal1(TreeNode root) {
		preorder(root);
		return res;
    }
	private void preorder(TreeNode root) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			return ;
		}
		res.add(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	//��������ǰ�������������
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		if(root == null) return res;
		stack.add(root);
		while( !stack.isEmpty() ) {
			
			//ջ�����ԣ����ʵ�ǰ�ڵ㣬�������ӽڵ㣬�������ֽڣ����������������������
			TreeNode node = stack.pop();
			res.add(node.val);
			if(node.right != null) {
				stack.add(node.right);
			}
			if(node.left != null) {
				stack.add(node.left);
			}
		}
		
		return res;
	}
}
