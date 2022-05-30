package leet;

import java.util.LinkedList;
import java.util.Queue;

public class Leet449 {

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
        
        String data = root.val + ",";
        data += serialize(root.left);
        data += serialize(root.right);
        return data;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        String[] str = data.split(",");
        for(String s : str) {
        	q.offer(s);
        }
        
        return hlper(q);
    }

	private TreeNode hlper(Queue<String> q) {
		// TODO 自动生成的方法存根
		String s = q.poll();
		if(s.equals("null")) {
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(s));
		root.left = hlper(q);
		root.right = hlper(q);
		return root;
	}
}