package leet;

public class Leet0104 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	
	public int maxDepth0(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftsize = maxDepth(root.left);
		int rightsize = maxDepth(root.right);
		
		return Math.max(leftsize, rightsize) + 1;
    }
	
	int res = 0;
	int depth = 0;
	public int maxDepth(TreeNode root) {
		traverse(root);
		return res;
	}

	private void traverse(TreeNode root) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			res = Math.max(res, depth);
			return;
		}
		//ǰ��������++��
		depth++;
		traverse(root.left);
		traverse(root.right);
		//����������--��
		depth--;
	}
}
