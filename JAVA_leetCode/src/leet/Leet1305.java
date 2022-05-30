package leet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leet1305 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	List<Integer> list = new ArrayList<>();
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		inorder1(root1,l1);
		inorder1(root2,l2);
		int m = l1.size();
		int n = l2.size();
		int i = 0 , j = 0;
		while(i < m || j < n) {
			int a = i < m ? l1.get(i) : Integer.MAX_VALUE;
			int b = j < n ? l2.get(j) : Integer.MAX_VALUE;
			if(a > b) {
				list.add(b);
				j++;
			}else {
				list.add(a);
				i++;
			}
		}
		
		
//		Collections.sort(list)l1;
		return list;
    }
	private void inorder1(TreeNode root, List<Integer> list) {
		// TODO 自动生成的方法存根
		if(root == null) return;
		inorder1(root.left, list);
		list.add(root.val);
		inorder1(root.right, list);
	}
	private void inorder(TreeNode root) {
		// TODO 自动生成的方法存根
		if(root == null) return ;
		
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}
}
