package leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet589 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//�ݹ�ǰ��������ȷ��ʵ�ǰ�ڵ㣬�����η��ʵ�ǰ�ڵ���ӽڵ�
	ArrayList<Integer> res = new ArrayList<>();
	public List<Integer> preorder1(Node root) {
		if(root == null) {			
			return res;
		}
		res.add(root.val);
		for(Node childNode : root.children) {
			preorder(childNode);
		}
		
		return res;
    }
	
	//�ǵݹ�ǰ��������ȷ��ʵ�ǰ�ڵ㣬����ǰ�ڵ���ӽڵ���ҵ���������ջ
	public List<Integer> preorder(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		if(root == null) return res;
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			ans.add(temp.val);
			for(int i=temp.children.size()-1;i>=0;i--) {
				stack.push(temp.children.get(i));
			}
		}
		
		return ans;
	}
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};