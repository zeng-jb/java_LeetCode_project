package jainzhi;

import java.util.ArrayList;
import java.util.List;

public class J54 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//���������������ĵ�k���ڵ㣬������������������ҳ���k����
	public int kthLargest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		inorder(root,list);
		
		return list.get(k);
    }

	private void inorder(TreeNode root, List<Integer> list) {
		// TODO �Զ����ɵķ������
		//�����������
		if(root == null) return ;
		inorder(root.right, list);
		list.add(root.val);
		inorder(root.left, list);
		
	}
}
