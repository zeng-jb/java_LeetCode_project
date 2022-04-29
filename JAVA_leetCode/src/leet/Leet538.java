package leet;

public class Leet538 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	int num = 0;
	//将二叉搜索树变成累加树
	public TreeNode convertBST(TreeNode root) {
		if(root != null) {
			//中序遍历逆转
			convertBST(root.right);
			
			root.val = root.val + num;
			num = root.val;
			
			convertBST(root.left);
			
			return root;
		}
		return null;
    }
}
