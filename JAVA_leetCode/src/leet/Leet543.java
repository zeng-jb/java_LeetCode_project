package leet;

public class Leet543 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	int maxDiameter = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		traverse(root);
		return maxDiameter;
    }
	
	private int traverse(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftmax = traverse(root.left);
		int rightmax = traverse(root.right);
		//�����������ֱ��
		int myDiameter = leftmax + rightmax;
		maxDiameter = Math.max(maxDiameter, myDiameter);
		
		return Math.max(rightmax, leftmax) + 1;
	}
	
	private void traverse1(TreeNode root) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			return;
		}
		
		int leftsize = maxDepth(root.left);
		int rightsize = maxDepth(root.right);
		
		int myDiameter = leftsize + rightsize;
		maxDiameter = Math.max(myDiameter, maxDiameter);
		
		traverse(root.left);
		traverse(root.right);
	}
	private int maxDepth(TreeNode root) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			return 0;
		}
		
		return Math.max( maxDepth(root.left) , maxDepth(root.right) ) + 1;
	}
}
