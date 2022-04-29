package jainzhi;

public class J26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public static boolean isSubStructure(TreeNode A, TreeNode B) {
		if(A == null || B == null) return false;
		return dfs(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
	private static boolean dfs(TreeNode A , TreeNode B) {
		if(B == null ) return true;
		if(A == null ) return false;
		return A.val == B.val  && dfs(A.left, B.left) && dfs(A.right, B.right);
	}
}

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	public TreeNode(int x) {
//		// TODO 自动生成的构造函数存根
//		val = x;
//	}
//}