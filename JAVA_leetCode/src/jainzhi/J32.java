package jainzhi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class J32 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		
		Deque<TreeNode> q = new ArrayDeque<>();
		if(root != null) q.add(root);
		 
		while(!q.isEmpty()) {
			List<Integer> ans = new ArrayList<>();
			int n = q.size();
			for(int i=0;i<n;i++) {
				TreeNode temp = q.poll();
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				ans.add(temp.val);
			}
			
			res.add(ans);
		}
		
		return res;
    }
	
	static List<List<Integer>> res = new ArrayList<>();;
	public static List<List<Integer>> levelOrder1(TreeNode root) {
		lei(root,0);
		return res;
	}


	private static void lei(TreeNode root, int k) {
		// TODO 自动生成的方法存根
		if(root != null) {
			if(res.size() <= k) res.add(new ArrayList<>());
			res.get(k).add(root.val);
			lei(root.left,k+1);
			lei(root.right,k+1);
		}
	}
	
	
	public static List<List<Integer>> levelOrder2(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		
		Deque<TreeNode> q = new ArrayDeque<>();
		if(root != null) q.add(root);
		int k=0; 
		while(!q.isEmpty()) {
			List<Integer> ans = new ArrayList<>();
			int n = q.size();
			for(int i=0;i<n;i++) {
				TreeNode temp = q.poll();
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				ans.add(temp.val);
			}
			if(k++ %2 != 0) Collections.reverse(ans);
			res.add(ans);
		}
		
		return res;
    }
}
