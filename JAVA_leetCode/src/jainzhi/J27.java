package jainzhi;

public class J27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	//二叉树镜像
	public static TreeNode mirrorTree(TreeNode root) {
		if(root == null) return null;
		
		TreeNode right = mirrorTree(root.right);
		TreeNode left = mirrorTree(root.left);
		
		root.left = right;
		root.right = left;
		
		return root;
    }
	//对称二叉树
	public static boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return helper(root.left,root.right);
    }
	private static boolean helper(TreeNode root1,TreeNode root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		return root1.val==root2.val && helper(root1.left,root2.right) && helper(root1.right,root2.left);
	}
}
