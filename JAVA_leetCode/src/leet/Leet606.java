package leet;

public class Leet606 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	public String tree2str(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		dotree2str(root,sb);
		return sb.toString();
    }

	private void dotree2str(TreeNode root, StringBuilder sb) {
		// TODO �Զ����ɵķ������
		if(root != null) {
			sb.append(root.val);
			if(root.left != null ||root.right != null) {
				sb.append("(");
				dotree2str(root.left, sb);
				sb.append(")");
				if(root.right != null) {
					sb.append("(");
					dotree2str(root.right, sb);
					sb.append(")");
				}
			}
		}
	}
	
}

/*

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode(int val,TreeNode left , TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

*/