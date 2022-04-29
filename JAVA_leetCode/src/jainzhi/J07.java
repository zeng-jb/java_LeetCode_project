package jainzhi;

import java.util.HashMap;

/**
 * �ؽ�������
 * @author 123
 *
 */
public class J07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵĹ��캯�����
		this.val = val;
	}
}

class Tree{
	
	TreeNode root = null;
	//��map��¼��׺�������λ�ã��������
	HashMap<Integer, Integer> indexMap = new HashMap<>();
	//����ǰ׺����׺���������
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		for(int i=0;i<n;i++) {
			indexMap.put(inorder[i], i);
		}
		
		return myBuildTree(preorder, inorder, 0, n-1, 0, n-1);
    }
	public TreeNode myBuildTree(int[] preorder,int[] inorder,int preorder_left,int preorder_rgiht,int inorder_left,int inorder_right) {
		
		if(preorder_left>preorder_rgiht)	return null;
		//ǰ׺��ڵ���Ƕ������ĸ����
		int preorder_root = preorder_left;
		//��ȡ��׺�����
		int inorder_root = indexMap.get(preorder[preorder_root]);
		
		TreeNode root = new TreeNode(preorder[preorder_root]);
		//�������ĳ���
		int size_left_subTree = inorder_root - inorder_left;
		//��������������������С��� ��߽�+1 ��ʼ�� size_left_subtree����Ԫ�ؾͶ�Ӧ����������С��� ��߽� ��ʼ�� ���ڵ㶨λ-1����Ԫ��
		root.left = myBuildTree(preorder, inorder, preorder_left+1, preorder_left+size_left_subTree, inorder_left, inorder_root-1);
		//�ݹ鹹����������
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