package jainzhi;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class J37 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}


class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null) {
    		return "null,";
    	}
    	
    	//前序遍历
        String data = root.val + ",";
        data += serialize(root.left);
        data += serialize(root.right);
        
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //构建二叉树，利用前序有null的进行层序遍历即可
    	String [] str = data.split(",");
    	Queue<String> q = new LinkedList<>();
    	for(int i=0;i<str.length;i++) {
    		q.offer(str[i]);
    	}
    	
    	return help(q);
    }

	private TreeNode help(Queue<String> q) {
		// TODO 自动生成的方法存根
		String val = q.poll();
		
		if(val.equals("null")) {
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.parseInt(val));
		root.left = help(q);
		root.right = help(q);
		
		return root;
	}
}