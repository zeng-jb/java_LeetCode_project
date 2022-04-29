package jainzhi;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class J37 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}


class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null) {
    		return "null,";
    	}
    	
    	//ǰ�����
        String data = root.val + ",";
        data += serialize(root.left);
        data += serialize(root.right);
        
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //����������������ǰ����null�Ľ��в����������
    	String [] str = data.split(",");
    	Queue<String> q = new LinkedList<>();
    	for(int i=0;i<str.length;i++) {
    		q.offer(str[i]);
    	}
    	
    	return help(q);
    }

	private TreeNode help(Queue<String> q) {
		// TODO �Զ����ɵķ������
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