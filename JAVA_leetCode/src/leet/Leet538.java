package leet;

public class Leet538 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	int num = 0;
	//����������������ۼ���
	public TreeNode convertBST(TreeNode root) {
		if(root != null) {
			//���������ת
			convertBST(root.right);
			
			root.val = root.val + num;
			num = root.val;
			
			convertBST(root.left);
			
			return root;
		}
		return null;
    }
}
