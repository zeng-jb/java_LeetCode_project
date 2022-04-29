package jainzhi;

import java.util.HashMap;

/**
 * 重建二叉树
 * @author 123
 *
 */
public class J07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[]preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
		Tree tree = new Tree();
		
		tree.printTree(tree.buildTree(preorder, inorder));
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		// TODO 自动生成的构造函数存根
		this.val = val;
	}
}

class Tree{
	
	TreeNode root = null;
	//用map记录中缀结点所在位置，方便查找
	HashMap<Integer, Integer> indexMap = new HashMap<>();
	//利用前缀和中缀构造二叉树
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		for(int i=0;i<n;i++) {
			indexMap.put(inorder[i], i);
		}
		
		return myBuildTree(preorder, inorder, 0, n-1, 0, n-1);
    }
	public TreeNode myBuildTree(int[] preorder,int[] inorder,int preorder_left,int preorder_rgiht,int inorder_left,int inorder_right) {
		
		if(preorder_left>preorder_rgiht)	return null;
		//前缀左节点就是二叉树的根结点
		int preorder_root = preorder_left;
		//获取中缀根结点
		int inorder_root = indexMap.get(preorder[preorder_root]);
		
		TreeNode root = new TreeNode(preorder[preorder_root]);
		//左子树的长度
		int size_left_subTree = inorder_root - inorder_left;
		//构造左子树，先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
		root.left = myBuildTree(preorder, inorder, preorder_left+1, preorder_left+size_left_subTree, inorder_left, inorder_root-1);
		//递归构造右子树，
		root.right = myBuildTree(preorder, inorder, preorder_left+size_left_subTree+1, preorder_rgiht, inorder_root+1, inorder_right);
		
		return root;
	}
	
	public void printTree(TreeNode root) {
		while(root!=null) {
			printTree(root.left);
			System.out.print(root.val + " ");
			printTree(root.right);
		}
	}
}