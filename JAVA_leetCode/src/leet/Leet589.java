package leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet589 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//递归前序遍历，先访问当前节点，再依次访问当前节点的子节点
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
	
	//非递归前序遍历，先访问当前节点，将当前节点的子节点从右到左依次入栈
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