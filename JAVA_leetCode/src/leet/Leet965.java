package leet;

public class Leet965 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	int preVal = 0;
	public boolean isUnivalTree(TreeNode root) {
		preVal = root.val;
		return inorder(root);
		
    }
	private boolean inorder(TreeNode root) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			return true;
		}
		if(preVal != root.val) return false;
		return inorder(root.left) && inorder(root.right);
	}
}
