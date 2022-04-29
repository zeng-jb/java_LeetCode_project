package leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leet590 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	List<Integer> res = new LinkedList<>();
	public List<Integer> postorder1(Node root) {
		if(root == null) return res;
		//后序遍历，先访问子节点在访问根结点
		for(Node childNode : root.children) {
			postorder(childNode);
		}
		res.add(root.val);
		return res;
    }
	
	//后序遍历迭代，利用两个栈，每次把s1的栈顶弹出到s2，然后将这个node的孩子压入s1，最后弹出s2的所有元素
	public List<Integer> postorder(Node root) {
		List<Integer> res = new LinkedList<>();
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		if(root == null) return res;
		s1.push(root);
		while(!s1.isEmpty()) {
			Node temp = s1.pop();
			s2.push(temp);
			for(Node childNode : temp.children) {
				s1.push(childNode);
			}
		}
		while(!s2.isEmpty()) {
			res.add(s2.pop().val);
		}
		return res;
	}
}
