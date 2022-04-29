package leet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Leet653 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	Set<Integer> set = new HashSet<>();
	public boolean findTarget0(TreeNode root, int k) {
		//深度优先搜索
		if(root == null) return false;
		if(set.contains(k-root.val)) {
			return true;
		}
		set.add(root.val);
		return findTarget(root.left, k) || findTarget(root.right, k);
	}
	
	public boolean findTarget1(TreeNode root, int k) {
		return helper(root,k);
    }

	private boolean helper(TreeNode root, int k) {
		// TODO 自动生成的方法存根
		int target = k - root.val;
		if(set.contains(target)) {
			return true;
		}
		set.add(root.val);
		boolean ans = false;
		if(root.left != null) {
			ans = helper(root.left, k);
		}
		if(root.right != null && !ans) {
			ans = helper(root.right, k);
		}
		return ans;
	}
	
	//广度优先搜索
	public boolean findTarget2(TreeNode root, int k) {
		Set<Integer> set = new HashSet<>();
		Queue<TreeNode> q = new ArrayDeque<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode node = q.poll();
			if(set.contains(k-node.val)) {
				return true;
			}
			set.add(node.val);
			if(node.left != null) {
				q.add(node.left);
			}
			if(node.right != null) {
				q.add(node.right);
			}
		}
		return false;
	}
	
	//二叉搜索树的中序遍历，双指针找出
	List<Integer> list = new ArrayList<>();
	public boolean findTarget(TreeNode root, int k) {
		inorderBST(root);
		int left = 0;
		int right = list.size()-1;
		while(left < right) {
			int target = list.get(left) + list.get(right);
			if(target == k) {
				return true;
			}else if(target > k) {
				right--;
			}else {
				left++;
			}
		}
		return false;
	}

	private void inorderBST(TreeNode root) {
		// TODO 自动生成的方法存根
		if(root == null) {
			return ;
		}
		inorderBST(root.left);
		list.add(root.val);
		inorderBST(root.right);
	}
}
