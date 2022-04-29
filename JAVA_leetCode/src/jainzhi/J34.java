package jainzhi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class J34 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	static List<List<Integer>> res;
	public static List<List<Integer>> pathSum1(TreeNode root, int target) {
		res = new ArrayList<>();
		
		reCur(root,target,new ArrayList<>());
	
		return res;
    }
	private static void reCur(TreeNode root, int target, List<Integer> collector) {
		// TODO 自动生成的方法存根
		if(root == null) return ;
		
		collector.add(root.val);
		target -= root.val;
		
		if(target == 0 && root.left == null && root.right == null) {
			res.add(new ArrayList<>(collector));
		}else {
			reCur(root.left, target, collector);
			reCur(root.right, target, collector);
		}
		
		collector.remove(collector.size()-1);
	}
	
	static List<List<Integer>> ans;
	static Deque<Integer> path;
	public static List<List<Integer>> pathSum(TreeNode root, int target) {
		ans = new ArrayList<>();
		path = new ArrayDeque<>();
		dfs(root,target);
		return ans;
	}
	private static void dfs(TreeNode root, int target) {
		// TODO 自动生成的方法存根
		if(root == null) return ;
		path.addLast(root.val);
		target -= root.val;
		
		if(target == 0 && root.left == null && root.right == null) {
			ans.add(new ArrayList<>(path));
		}
		
		dfs(root.left, target);
		dfs(root.right, target);
		
		path.pollLast();
	}
}
