package leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet199 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode root = getTargetTree();
		Leet199 obj = new Leet199();
		
		System.out.println(obj.rightSideView1(root));
	}
	
	
	List<Integer> ans = new LinkedList<>();
	public List<Integer> rightSideView1(TreeNode root) {
		dfs(root,0);	//从根结点开始dfs，深度为0
		return ans;
	}
	private void dfs(TreeNode tree , int depth) {
		if(tree == null) {
			return;
		}
		if(depth == ans.size()) {
			//如果当前深度为list的长度，就把第一个访问的结点加入
			ans.add(tree.val);
		}
		//深度增加，想访问结点，然后右节点再左节点；和前序遍历相反。
		depth++;
		dfs(tree.right, depth);
		dfs(tree.left, depth);
	}
	
	
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		//用层序遍历，保留每一层的最后一个（右边
		if(root != null) {
			LinkedList<TreeNode> list = new LinkedList<>();
			list.add(root);
			TreeNode currentNode;
			while(!list.isEmpty()) {
				int size = list.size();
				int temp = 0;
				while(size-- >0) {					
					currentNode = list.poll();
					temp = currentNode.val;
					if(currentNode.left != null) {
						list.add(currentNode.left);
					}
					if(currentNode.right != null) {
						list.add(currentNode.right);
					}
				}
				ans.add(temp);
			}
		}
		
		
		return ans;
    }
	
	// 创建一个二叉树
	public static TreeNode getTargetTree() {
			// 叶子节点	[1,2,3,null,5,null,4]
		
		TreeNode E = new TreeNode(5);
		TreeNode D = new TreeNode(4);
		TreeNode C = new TreeNode(3,null,D);
		TreeNode B = new TreeNode(2,null,E);
		// 构造根节点
		TreeNode root = new TreeNode(1, B, C);
		return root;
	}
}







 class TreeNode {
	      int val;
	      TreeNode left;
	  	TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	        this.left = left;
	         this.right = right;
     }
 }
