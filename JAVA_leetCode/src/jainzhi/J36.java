package jainzhi;

public class J36 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	
	/*
	Node head, tail;
	public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        
        inOrder(root);
        
        head.left = tail;
        tail.right = head;
        
        return head;
    }
	private void inOrder(Node root) {
		// TODO �Զ����ɵķ������
		if(root == null) return;
		
		inOrder(root.left);
		
		if(head == null) {
			head = root;
			tail = root;
		}else {
			//ͷ����㲻����β��㶯
			tail.right = root;
			root.left = tail;
			tail = root;
		}
		
		inOrder(root.right);
	}
	
	*/
}


/*
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

*/