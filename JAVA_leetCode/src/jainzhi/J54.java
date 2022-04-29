package jainzhi;

import java.util.ArrayList;
import java.util.List;

public class J54 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//二叉搜索树求最大的第k个节点，利用中序遍历的逆序找出第k个数
	public int kthLargest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		inorder(root,list);
		
		return list.get(k);
    }

	private void inorder(TreeNode root, List<Integer> list) {
		// TODO 自动生成的方法存根
		//中序遍历逆序
		if(root == null) return ;
		inorder(root.right, list);
		list.add(root.val);
		inorder(root.left, list);
		
	}
}
