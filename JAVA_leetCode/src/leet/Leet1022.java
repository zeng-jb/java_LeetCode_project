package leet;

public class Leet1022 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	
    public int sumRootToLeaf(TreeNode root) {
    	  return hleper(root,0);
    	  
    }
	private int hleper(TreeNode root, int sum) {
		// TODO �Զ����ɵķ������
		if(root == null) {
			return 0;
		}
		sum = 2*sum + root.val;
		if(root.left == null && root.right == null) {
			return sum;
		}
		return hleper(root.left,sum) + hleper(root.right,sum);
	}
}
