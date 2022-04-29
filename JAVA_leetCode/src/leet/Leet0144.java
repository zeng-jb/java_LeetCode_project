package leet;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leet0144 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//二叉树的前序遍历，递归版
	List<Integer> res = new ArrayList<>();
	public List<Integer> preorderTraversal1(TreeNode root) {
		preorder(root);
		return res;
    }
	private void preorder(TreeNode root) {
		// TODO 自动生成的方法存根
		if(root == null) {
			return ;
		}
		res.add(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	//二叉树的前序遍历，迭代版
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		if(root == null) return res;
		stack.add(root);
		while( !stack.isEmpty() ) {
			
			//栈的特性，访问当前节点，先入右子节点，在入左字节，这样出来就是先左后右了
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
