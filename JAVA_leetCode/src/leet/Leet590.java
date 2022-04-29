package leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leet590 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	
	List<Integer> res = new LinkedList<>();
	public List<Integer> postorder1(Node root) {
		if(root == null) return res;
		//����������ȷ����ӽڵ��ڷ��ʸ����
		for(Node childNode : root.children) {
			postorder(childNode);
		}
		res.add(root.val);
		return res;
    }
	
	//���������������������ջ��ÿ�ΰ�s1��ջ��������s2��Ȼ�����node�ĺ���ѹ��s1����󵯳�s2������Ԫ��
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
