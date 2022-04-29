package leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet199 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeNode root = getTargetTree();
		Leet199 obj = new Leet199();
		
		System.out.println(obj.rightSideView1(root));
	}
	
	
	List<Integer> ans = new LinkedList<>();
	public List<Integer> rightSideView1(TreeNode root) {
		dfs(root,0);	//�Ӹ���㿪ʼdfs�����Ϊ0
		return ans;
	}
	private void dfs(TreeNode tree , int depth) {
		if(tree == null) {
			return;
		}
		if(depth == ans.size()) {
			//�����ǰ���Ϊlist�ĳ��ȣ��Ͱѵ�һ�����ʵĽ�����
			ans.add(tree.val);
		}
		//������ӣ�����ʽ�㣬Ȼ���ҽڵ�����ڵ㣻��ǰ������෴��
		depth++;
		dfs(tree.right, depth);
		dfs(tree.left, depth);
	}
	
	
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		//�ò������������ÿһ������һ�����ұ�
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
	
	// ����һ��������
	public static TreeNode getTargetTree() {
			// Ҷ�ӽڵ�	[1,2,3,null,5,null,4]
		
		TreeNode E = new TreeNode(5);
		TreeNode D = new TreeNode(4);
		TreeNode C = new TreeNode(3,null,D);
		TreeNode B = new TreeNode(2,null,E);
		// ������ڵ�
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
